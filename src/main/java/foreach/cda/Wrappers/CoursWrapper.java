package foreach.cda.Wrappers;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import foreach.cda.Model.Cours;
import foreach.cda.Services.FormateurService;
import foreach.cda.Services.UEService;

public class CoursWrapper implements RowMapper<Cours> {
    private UEService ueService;
    private FormateurService formateurService;

    public CoursWrapper() {
        ApplicationContext context = new ClassPathXmlApplicationContext("application.xml"); 
        JdbcTemplate jdbcTemplate = (JdbcTemplate) context.getBean("jdbcTemplate");
        this.ueService = new UEService(jdbcTemplate);
        this.formateurService = new FormateurService(jdbcTemplate);
    }

    

    @Override
    public Cours mapRow(ResultSet rs, int rowNum) throws SQLException {
        return new Cours(rs.getInt("Id"),
        rs.getDate("Date_Debut"),
        rs.getDate("Date_Fin"),
        this.ueService.getByID(rs.getInt("FK_UE")),
        this.formateurService.getByID(rs.getInt("FK_Formateur"))
        );
    }
    
}
