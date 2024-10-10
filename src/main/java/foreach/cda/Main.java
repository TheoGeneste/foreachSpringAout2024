package foreach.cda;

import foreach.cda.Model.UE;
import foreach.cda.Services.UEService;

public class Main {
    public static void main(String[] args) {
        
        // EtudiantService etudiantService = new EtudiantService(jdbcTemplate);

        // System.out.println(etudiantService.getAll());
        // for (Etudiant etudiants : etudiantService.getAll()) {
        //     etudiants.sePresenter();
        // }

        // FormateurService formateurService  = new FormateurService(jdbcTemplate);

        // for (Formateur formateur : formateurService.getAll()) {
        //     System.out.println(formateur.getNom());
        // }
        
        
        UEService ueService  = new UEService();

        for (UE ue : ueService.getAll()) {
            System.out.println(ue.getLibelle());
        }

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

        // SuivreService suivreService = new SuivreService(jdbcTemplate);
        // for(Suivre suivre : suivreService.getAll()){
        //     System.out.println(suivre.getCours().getDateDebut());
        //     System.out.println(suivre.getCours().getUe().getLibelle());
        //     suivre.getEtudiants().sePresenter();
        // }


        // UE ue = new UE("Spring Boot");
        // UEService ueService  = new UEService(jdbcTemplate);
        // System.out.println(ueService.insert(ue));

        // UE ue = new UE(2,"Spring Boot");
        // UEService ueService  = new UEService(jdbcTemplate);
        // System.out.println(ueService.update(ue));

        // UEService ueService  = new UEService(jdbcTemplate);
        // System.out.println(ueService.delete(2));

    }
}