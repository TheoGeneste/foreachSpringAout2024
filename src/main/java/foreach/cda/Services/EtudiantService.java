package foreach.cda.Services;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import foreach.cda.Model.Etudiant;
import foreach.cda.Wrappers.EtudiantWrapper;

public class EtudiantService {
    
    private JdbcTemplate jdbcTemplate;

    public EtudiantService(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

   public List<Etudiant> getAll(){
        String sql = "SELECT * FROM Etudiants;";
        return this.jdbcTemplate.query(sql, new EtudiantWrapper());
   } 

   public Etudiant getByID(int id){
        String sql = "SELECT * FROM Etudiants WHERE Id= ?";
        return this.jdbcTemplate.queryForObject(sql, new EtudiantWrapper(),id);
   }
   
}
