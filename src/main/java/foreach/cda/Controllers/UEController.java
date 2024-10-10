package foreach.cda.Controllers;

import java.util.List;

import foreach.cda.Model.UE;
import foreach.cda.Services.UEService;

// 5 TYPES DE REQUÊTES HTTP/HTTPS
// GET -> Récuperer des données
// POST -> Ajouter des données
// DELETE -> Supprimer des données 
// PATCH -> Modifier des données 
// PUT -> Modifier des données

// Préciser la route du controllers 
// exemple /ue
// Controllers
public class UEController {
    private UEService ueService;

    public UEController() {
        this.ueService = new UEService();
    }

    // GET
    //exemple /
    //Utilisateur va devoir aller sur /ue/
    public List<UE> getAll(){
        return ueService.getAll();
    }


    // GET
    // exemple /{id}
    //Utilisateur va devoir aller sur /ue/1
    public UE getByID(int id){
        return ueService.getByID(id);
    }

    //POST 
    //exemple /
    //Utilisateur va devoir aller sur /ue/
    public void insert(UE etudiant){
        ueService.insert(etudiant);
    }

    // PATCH/PUT
    //exemple /{id}
    //Utilisateur va devoir aller sur /ue/1
    public void update(UE ue, int id) {
        ue.setId(id);
        ueService.update(ue);
    }

    // DELETE
    //exemple /{id}
    //Utilisateur va devoir aller sur /ue/1
    public void delete(int id){
        ueService.delete(id);
    }
}
