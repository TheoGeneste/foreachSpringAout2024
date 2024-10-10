package foreach.cda.Services;

import java.util.List;

import foreach.cda.Model.Cours;
import foreach.cda.Model.Etudiant;
import foreach.cda.Model.Suivre;
import foreach.cda.Wrappers.SuivreWrapper;

public class SuivreService extends DatabaseService{

    public List<Suivre> getAll(){
        String sql = "SELECT * FROM Suivre;";
        return super.getJdbcTemplate().query(sql, new SuivreWrapper());
    }

    public Suivre getByEtudiantID(int id){
        String sql = "SELECT * FROM Suivre WHERE FK_Etudiant=?";
        return super.getJdbcTemplate().queryForObject(sql, new SuivreWrapper(), id);
    }
    
    public Suivre getByCourID(int id){
        String sql = "SELECT * FROM Suivre WHERE FK_Cour=?";
        return super.getJdbcTemplate().queryForObject(sql, new SuivreWrapper(), id);
    }

    public int deleteAllByEtudiantID(int id){
        String sql = "DELETE FROM Suivre WHERE FK_Etudiant = ?";
        return super.getJdbcTemplate().update(sql, id);
    }

    public int deleteAllByCourID(int id){
        String sql = "DELETE FROM Suivre WHERE FK_Cour = ?";
        return super.getJdbcTemplate().update(sql, id);
    }
    
    public int deleteAllByCourID(Cours cour){
        String sql = "DELETE FROM Suivre WHERE FK_Cour = ?";
        return super.getJdbcTemplate().update(sql, cour.getId());
    }

    public int delete(int idCour, int idEtudiant){
        String sql = "DELETE FROM Suivre WHERE FK_Cour = ? AND FK_Etudiant = ?";
        return super.getJdbcTemplate().update(sql, idCour, idEtudiant);
    }

    public int insert(int idCour, int idEtudiant){
        String sql ="INSERT INTO Suivre VALUES (?,?)";
        return super.getJdbcTemplate().update(sql, idCour, idEtudiant);
    }

    public int insert(Cours cour, Etudiant etudiant){
        String sql ="INSERT INTO Suivre VALUES (?,?)";
        return super.getJdbcTemplate().update(sql, cour.getId(), etudiant.getId());
    }
}
