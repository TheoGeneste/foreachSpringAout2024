package foreach.cda.Services;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import foreach.cda.Model.Etudiants;
import foreach.cda.Wrappers.EtudiantWrapper;

public class EtudiantService {
    
    private JdbcTemplate jdbcTemplate;

    public EtudiantService(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

   public List<Etudiants> getAll(){
        String sql = "SELECT * FROM Etudiants;";
        return this.jdbcTemplate.query(sql, new EtudiantWrapper());
   }
}
