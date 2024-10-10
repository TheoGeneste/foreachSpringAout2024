package foreach.cda.Controllers;
import java.util.List;

import foreach.cda.Model.Absences;
import foreach.cda.Services.AbsenceService;

// 5 TYPES DE REQUÊTES HTTP/HTTPS
// GET -> Récuperer des données
// POST -> Ajouter des données
// DELETE -> Supprimer des données 
// PATCH -> Modifier des données 
// PUT -> Modifier des données

// Préciser la route du controllers 
// exemple /absences
// Controllers
public class AbsenceController {
    private AbsenceService absencesService;

    public AbsenceController() {
        this.absencesService = new AbsenceService();
    }


    // GET
    //exemple /
    //Utilisateur va devoir aller sur /absences/
    public List<Absences> getAll(){
        return absencesService.getAll();
    }


    // GET
    // exemple /{id}
    //Utilisateur va devoir aller sur /absences/1
    public Absences getByID(int id){
        return absencesService.getByID(id);
    }

    //POST 
    //exemple /
    //Utilisateur va devoir aller sur /absences/
    public void insert(Absences etudiant){
        absencesService.insert(etudiant);
    }

    // PATCH/PUT
    //exemple /{id}
    //Utilisateur va devoir aller sur /absences/1
    public void update(Absences absences, int id) {
        absences.setId(id);
        absencesService.update(absences);
    }

    // DELETE
    //exemple /{id}
    //Utilisateur va devoir aller sur /absences/1
    public void delete(int id){
        absencesService.delete(id);
    }
}
