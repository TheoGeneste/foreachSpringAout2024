package foreach.cda;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import foreach.cda.Model.Etudiants;
import foreach.cda.Services.EtudiantService;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("application.xml");
        JdbcTemplate jdbcTemplate = (JdbcTemplate) context.getBean("jdbcTemplate");
        
        EtudiantService etudiantService = new EtudiantService(jdbcTemplate);

        System.out.println(etudiantService.getAll());
        for (Etudiants etudiants : etudiantService.getAll()) {
            etudiants.sePresenter();
        }
        
    }
}