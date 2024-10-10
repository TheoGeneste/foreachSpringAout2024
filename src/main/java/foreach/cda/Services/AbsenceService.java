package foreach.cda.Services;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import foreach.cda.Model.Absences;
import foreach.cda.Wrappers.AbsenceWrapper;

public class AbsenceService {
    
    private JdbcTemplate jdbcTemplate;

    public AbsenceService(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public List<Absences> getAll(){
        String sql = "SELECT * FROM absences";
        return this.jdbcTemplate.query(sql, new AbsenceWrapper());
    }
}
