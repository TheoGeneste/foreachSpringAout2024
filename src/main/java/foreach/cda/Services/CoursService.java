package foreach.cda.Services;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import foreach.cda.Model.Cours;
import foreach.cda.Wrappers.CoursWrapper;

public class CoursService {
    private JdbcTemplate jdbcTemplate;

    public CoursService(JdbcTemplate jdbcTemplate) {    
        this.jdbcTemplate = jdbcTemplate;
    }

    public List<Cours> getAll(){
        String sql = "SELECT * FROM Cours";
        return this.jdbcTemplate.query(sql, new CoursWrapper());
    }

    public Cours getByID(int id) {
        String sql = "SELECT * FROM Cours WHERE Id = ?";
        return this.jdbcTemplate.queryForObject(sql, new CoursWrapper(), id);
    }
}
