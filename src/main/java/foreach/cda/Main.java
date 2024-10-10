package foreach.cda;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import foreach.cda.Model.Suivre;
import foreach.cda.Services.SuivreService;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("application.xml");
        JdbcTemplate jdbcTemplate = (JdbcTemplate) context.getBean("jdbcTemplate");
        
        // EtudiantService etudiantService = new EtudiantService(jdbcTemplate);

        // System.out.println(etudiantService.getAll());
        // for (Etudiant etudiants : etudiantService.getAll()) {
        //     etudiants.sePresenter();
        // }

        // FormateurService formateurService  = new FormateurService(jdbcTemplate);

        // for (Formateur formateur : formateurService.getAll()) {
        //     System.out.println(formateur.getNom());
        // }
        
        
        // UEService ueService  = new UEService(jdbcTemplate);

        // for (UE ue : ueService.getAll()) {
        //     System.out.println(ue.getLibelle());
        // }

        // AbsenceService absenceService = new AbsenceService(jdbcTemplate);
        // for (Absences absence : absenceService.getAll()) {
        //     System.out.println(absence.getDateDebut());
        //     absence.getEtudiants().sePresenter();
        // }

        // CoursService coursService = new CoursService(jdbcTemplate);
        // for(Cours cour : coursService.getAll()){
        //     System.out.println(cour.getDateDebut());
        //     System.out.println(cour.getUe().getLibelle());
        //     System.out.println(cour.getFormateur().getNom());
        // }

        SuivreService suivreService = new SuivreService(jdbcTemplate);
        for(Suivre suivre : suivreService.getAll()){
            System.out.println(suivre.getCours().getDateDebut());
            System.out.println(suivre.getCours().getUe().getLibelle());
            suivre.getEtudiants().sePresenter();
        }
    }
}