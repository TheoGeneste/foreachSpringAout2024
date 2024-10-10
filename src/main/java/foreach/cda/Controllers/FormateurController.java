package foreach.cda.Controllers;

import java.util.List;

import foreach.cda.Model.Formateur;
import foreach.cda.Services.FormateurService;


// 5 TYPES DE REQUÊTES HTTP/HTTPS
// GET -> Récuperer des données
// POST -> Ajouter des données
// DELETE -> Supprimer des données 
// PATCH -> Modifier des données 
// PUT -> Modifier des données

// Préciser la route du controllers 
// exemple /formateurs
// Controllers
public class FormateurController {
    private FormateurService formateurService;

    public FormateurController() {
        this.formateurService = new FormateurService();
    }

    // GET
    //exemple /
    //Utilisateur va devoir aller sur /formateurs/
    public List<Formateur> getAll(){
        return formateurService.getAll();
    }


    // GET
    // exemple /{id}
    //Utilisateur va devoir aller sur /formateurs/1
    public Formateur getByID(int id){
        return formateurService.getByID(id);
    }

    //POST 
    //exemple /
    //Utilisateur va devoir aller sur /formateurs/
    public void insert(Formateur etudiant){
        formateurService.insert(etudiant);
    }

    // PATCH/PUT
    //exemple /{id}
    //Utilisateur va devoir aller sur /formateurs/1
    public void update(Formateur formateurs, int id) {
        formateurs.setId(id);
        formateurService.update(formateurs);
    }

    // DELETE
    //exemple /{id}
    //Utilisateur va devoir aller sur /formateurs/1
    public void delete(int id){
        formateurService.delete(id);
    }
}
