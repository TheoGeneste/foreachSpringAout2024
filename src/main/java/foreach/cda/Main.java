package foreach.cda;

import foreach.cda.Controllers.CoursController;

public class Main {
    public static void main(String[] args) {
        
        // EtudiantController etudiantController = new EtudiantController();

        // System.out.println(etudiantController.getAll());
        // System.out.println(etudiantController.getByID(1));

        // AbsenceController absenceController = new AbsenceController();
        
        // System.out.println(absenceController.getAll());

        // SuivreController suivreController = new SuivreController();

        // System.out.println(suivreController.getAll());

        CoursController coursController = new CoursController();

        System.out.println(coursController.getAll());















        // Server server = new Server(8080);

        // // The ServletContextHandler is a Jetty-specific handler that allows us to configure servlets.
        // ServletContextHandler context = new ServletContextHandler(ServletContextHandler.SESSIONS);
        // context.setContextPath("/");
        // server.setHandler(context);

        // // Create the Spring application context
        // AnnotationConfigWebApplicationContext applicationContext = new AnnotationConfigWebApplicationContext();
        // applicationContext.setConfigLocation("com.example.config");

        // // Create the DispatcherServlet and register it with Jetty
        // DispatcherServlet dispatcherServlet = new DispatcherServlet(applicationContext);
        // ServletHolder servletHolder = new ServletHolder(dispatcherServlet);
        // context.addServlet(servletHolder, "/*");

        // try {
        //     // Start the Jetty server
        //     server.start();
        //     server.join();
        // } catch (Exception ex) {
        // }
        // EtudiantService etudiantService = new EtudiantService(jdbcTemplate);

        // System.out.println(etudiantService.getAll());
        // for (Etudiant etudiants : etudiantService.getAll()) {
        //     etudiants.sePresenter();
        // }

        // FormateurService formateurService  = new FormateurService(jdbcTemplate);

        // for (Formateur formateur : formateurService.getAll()) {
        //     System.out.println(formateur.getNom());
        // }
        
        
        // UEService ueService  = new UEService();

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