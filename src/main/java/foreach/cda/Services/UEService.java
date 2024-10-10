package foreach.cda.Services;

import java.util.List;

import foreach.cda.Model.UE;
import foreach.cda.Wrappers.UEWrapper;

public class UEService extends DatabaseService{
    public List<UE> getAll(){
        String sql = "SELECT * FROM UE";
        return super.getJdbcTemplate().query(sql, new UEWrapper());
    }

    public UE getByID(int id){
        String sql = "SELECT * FROM UE WHERE Id = ?";
        return super.getJdbcTemplate().queryForObject(sql, new UEWrapper(), id);
    }

    public int insert(UE ue){
        String sql = "INSERT INTO UE(Libelle) VALUES (?)";
        return super.getJdbcTemplate().update(sql, ue.getLibelle());
    }

    public int update(UE ue){
        String sql = "UPDATE UE SET Libelle=? WHERE Id=?";
        return super.getJdbcTemplate().update(sql, ue.getLibelle(), ue.getId());
    }

    public int delete(int id){
        String sql = "DELETE FROM UE WHERE Id=?";
        return super.getJdbcTemplate().update(sql, id);
    }
}
