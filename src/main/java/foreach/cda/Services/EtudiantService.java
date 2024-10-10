package foreach.cda.Services;

import java.util.List;

import foreach.cda.Model.Etudiant;
import foreach.cda.Wrappers.EtudiantWrapper;

public class EtudiantService extends DatabaseService{
    
   public List<Etudiant> getAll(){
        String sql = "SELECT * FROM Etudiants;";
        return super.getJdbcTemplate().query(sql, new EtudiantWrapper());
   } 

   public Etudiant getByID(int id){
        String sql = "SELECT * FROM Etudiants WHERE Id= ?";
        return super.getJdbcTemplate().queryForObject(sql, new EtudiantWrapper(),id);
   }

   public int insert(Etudiant etudiant){
     String sql = "INSERT INTO Etudiants(Nom,Prenom,Email,Telephone) VALUES (?,?,?,?)";
     return super.getJdbcTemplate().update(sql, etudiant.getNom(), etudiant.getPrenom(), etudiant.getEmail(), etudiant.getTelephone());
   }

   public int update(Etudiant etudiant){
     String sql = "UPDATE Etudiants set Nom=?,Prenom=?,Email=?,Telephone=? WHERE Id=?";
     return super.getJdbcTemplate().update(sql, etudiant.getNom(), etudiant.getPrenom(), etudiant.getEmail(), etudiant.getTelephone(), etudiant.getId());
   }

   public int delete(int id){
     String sql= "DELETE Etudiants WHERE Id=?";
     return super.getJdbcTemplate().update(sql,id);
   }
   
}
