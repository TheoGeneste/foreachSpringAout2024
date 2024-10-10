package foreach.cda.Services;

import java.util.List;

import foreach.cda.Model.Formateur;
import foreach.cda.Wrappers.FormateurWrapper;

public class FormateurService extends DatabaseService{

    public List<Formateur> getAll(){
        String sql = "SELECT * FROM Formateurs";
        return super.getJdbcTemplate().query(sql, new FormateurWrapper());
    }

    public Formateur getByID(int id) {
        String sql = "SELECT * FROM Formateurs WHERE Id = ?";
        return super.getJdbcTemplate().queryForObject(sql, new FormateurWrapper(), id);
    }

       public int insert(Formateur formateur){
     String sql = "INSERT INTO Formateurs(Nom,Prenom,Email,Telephone) VALUES (?,?,?,?)";
     return super.getJdbcTemplate().update(sql, formateur.getNom(), formateur.getPrenom(), formateur.getEmail(), formateur.getTelephone());
   }

   public int update(Formateur formateur){
     String sql = "UPDATE Formateurs set Nom=?,Prenom=?,Email=?,Telephone=? WHERE Id=?";
     return super.getJdbcTemplate().update(sql, formateur.getNom(), formateur.getPrenom(), formateur.getEmail(), formateur.getTelephone(), formateur.getId());
   }

   public int delete(int id){
     String sql= "DELETE Formateurs WHERE Id=?";
     return super.getJdbcTemplate().update(sql,id);
   }
}
