package foreach.cda.Services;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import foreach.cda.Model.UE;
import foreach.cda.Wrappers.UEWrapper;

public class UEService {
    
    private JdbcTemplate jdbcTemplate;

    public UEService(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public List<UE> getAll(){
        String sql = "SELECT * FROM UE";
        return this.jdbcTemplate.query(sql, new UEWrapper());
    }

    public UE getByID(int id){
        String sql = "SELECT * FROM UE WHERE Id = ?";
        return this.jdbcTemplate.queryForObject(sql, new UEWrapper(), id);
    }
}
