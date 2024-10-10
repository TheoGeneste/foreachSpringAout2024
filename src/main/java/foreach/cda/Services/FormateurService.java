package foreach.cda.Services;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import foreach.cda.Model.Formateur;
import foreach.cda.Wrappers.FormateurWrapper;

public class FormateurService {
    private JdbcTemplate jdbcTemplate;

    public FormateurService(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public List<Formateur> getAll(){
        String sql = "SELECT * FROM Formateurs";
        return this.jdbcTemplate.query(sql, new FormateurWrapper());
    }

    public Formateur getByID(int id) {
        String sql = "SELECT * FROM Formateurs WHERE Id = ?";
        return this.jdbcTemplate.queryForObject(sql, new FormateurWrapper(), id);
    }
}
