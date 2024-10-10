package foreach.cda.Services;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import foreach.cda.Model.Suivre;
import foreach.cda.Wrappers.SuivreWrapper;

public class SuivreService {
    private JdbcTemplate jdbcTemplate;

    public SuivreService(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public List<Suivre> getAll(){
        String sql = "SELECT * FROM Suivre;";
        return this.jdbcTemplate.query(sql, new SuivreWrapper());
    }
    
}
