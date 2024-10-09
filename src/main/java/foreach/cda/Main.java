package foreach.cda;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("application.xml");
        JdbcTemplate jdbcTemplate = (JdbcTemplate) context.getBean("jdbcTemplate");
        
        try {
            String sql = "SELECT * FROM etudiants";
            System.out.println(jdbcTemplate.queryForList(sql));
            // jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper(Etudiants.class)));
            jdbcTemplate.execute(sql);
            System.out.println("Connexion Réussi");
        } catch (DataAccessException e) {
            System.out.println(e);
            // TODO: handle exception
        }
    }
}