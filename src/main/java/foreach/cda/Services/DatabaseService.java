package foreach.cda.Services;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
public abstract class DatabaseService {
    private JdbcTemplate jdbcTemplate;

    public DatabaseService() {
        ApplicationContext context = new ClassPathXmlApplicationContext("application.xml");
        this.jdbcTemplate = (JdbcTemplate) context.getBean("jdbcTemplate");
    }

    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    
    
    
}
