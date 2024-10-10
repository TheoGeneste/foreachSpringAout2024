package foreach.cda.Wrappers;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import foreach.cda.Model.Absences;
import foreach.cda.Services.EtudiantService;

public class AbsenceWrapper implements RowMapper<Absences> {
    private EtudiantService etudiantService;

    public AbsenceWrapper() {
        ApplicationContext context = new ClassPathXmlApplicationContext("application.xml"); 
        JdbcTemplate jdbcTemplate = (JdbcTemplate) context.getBean("jdbcTemplate");
        this.etudiantService = new EtudiantService(jdbcTemplate);
    }



    @Override
    public Absences mapRow(ResultSet rs, int rowNum) throws SQLException {
        return new Absences(rs.getInt("id"),
         rs.getDate("Date_Debut"), 
         rs.getDate("Date_Fin"), 
         rs.getString("Type"),
         this.etudiantService.getByID(rs.getInt("FK_Etudiant"))
         );
    }
    
}
