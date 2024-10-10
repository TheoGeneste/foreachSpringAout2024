package foreach.cda.Controllers;
import java.util.List;

import foreach.cda.Model.Etudiant;
import foreach.cda.Services.EtudiantService;


// 5 TYPES DE REQUÊTES HTTP/HTTPS
// GET -> Récuperer des données
// POST -> Ajouter des données
// DELETE -> Supprimer des données 
// PATCH -> Modifier des données 
// PUT -> Modifier des données

// Préciser la route du controllers 
// exemple /etudiants
// Controllers
public class EtudiantController {
    private EtudiantService etudiantService;

    public EtudiantController() {
        this.etudiantService = new EtudiantService();
    }


    // GET
    //exemple /
    //Utilisateur va devoir aller sur /etudiants/
    public List<Etudiant> getAll(){
        return etudiantService.getAll();
    }


    // GET
    // exemple /{id}
    //Utilisateur va devoir aller sur /etudiants/1
    public Etudiant getByID(int id){
        return etudiantService.getByID(id);
    }

    //POST 
    //exemple /
    //Utilisateur va devoir aller sur /etudiants/
    public void insert(Etudiant etudiant){
        etudiantService.insert(etudiant);
    }

    // PATCH/PUT
    //exemple /{id}
    //Utilisateur va devoir aller sur /etudiants/1
    public void update(Etudiant etudiant, int id) {
        etudiant.setId(id);
        etudiantService.update(etudiant);
    }

    // DELETE
    //exemple /{id}
    //Utilisateur va devoir aller sur /etudiants/1
    public void delete(int id){
        etudiantService.delete(id);
    }
}
