package foreach.cda.Controllers;

import java.util.List;

import foreach.cda.Model.Cours;
import foreach.cda.Services.CoursService;

// 5 TYPES DE REQUÊTES HTTP/HTTPS
// GET -> Récuperer des données
// POST -> Ajouter des données
// DELETE -> Supprimer des données 
// PATCH -> Modifier des données 
// PUT -> Modifier des données

// Préciser la route du controllers 
// exemple /cours
// Controllers
public class CoursController {
    private CoursService coursService;

    public CoursController() {
        this.coursService = new CoursService();
    }

    // GET
    //exemple /
    //Utilisateur va devoir aller sur /cours/
    public List<Cours> getAll(){
        return coursService.getAll();
    }


    // GET
    // exemple /{id}
    //Utilisateur va devoir aller sur /cours/1
    public Cours getByID(int id){
        return coursService.getByID(id);
    }

    //POST 
    //exemple /
    //Utilisateur va devoir aller sur /cours/
    public void insert(Cours etudiant){
        coursService.insert(etudiant);
    }

    // PATCH/PUT
    //exemple /{id}
    //Utilisateur va devoir aller sur /cours/1
    public void update(Cours cours, int id) {
        cours.setId(id);
        coursService.update(cours);
    }

    // DELETE
    //exemple /{id}
    //Utilisateur va devoir aller sur /cours/1
    public void delete(int id){
        coursService.delete(id);
    }
}
