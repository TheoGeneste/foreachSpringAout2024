package foreach.cda.Wrappers;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import foreach.cda.Model.Suivre;
import foreach.cda.Services.CoursService;
import foreach.cda.Services.EtudiantService;

public class SuivreWrapper implements RowMapper<Suivre> {
    private EtudiantService etudiantService;
    private CoursService coursService;

    public SuivreWrapper() {
        ApplicationContext context = new ClassPathXmlApplicationContext("application.xml"); 
        JdbcTemplate jdbcTemplate = (JdbcTemplate) context.getBean("jdbcTemplate");
        this.etudiantService = new EtudiantService(jdbcTemplate);
        this.coursService = new CoursService(jdbcTemplate);
    }



    @Override
    public Suivre mapRow(ResultSet rs, int rowNum) throws SQLException {
        return new Suivre(this.etudiantService.getByID(rs.getInt("FK_Etudiant")), this.coursService.getByID(rs.getInt("FK_Cour")));
    }
    
}
