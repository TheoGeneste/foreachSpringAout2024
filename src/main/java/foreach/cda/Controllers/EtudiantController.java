package foreach.cda.Controllers;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

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
    private ObjectMapper objectMapper;

    public EtudiantController() {
        this.etudiantService = new EtudiantService();
        this.objectMapper = new ObjectMapper();
    }


    // GET
    //exemple /
    //Utilisateur va devoir aller sur /etudiants/
    public String getAll() {
        String jsonData = "";
        try {
            jsonData = objectMapper.writeValueAsString(etudiantService.getAll());
        } catch (JsonProcessingException ex) {
        }
        return jsonData;
    }


    // GET
    // exemple /{id}
    //Utilisateur va devoir aller sur /etudiants/1
    public String getByID(int id){
        String jsonData = "";
        try {
            jsonData = objectMapper.writeValueAsString(etudiantService.getByID(id));
        } catch (JsonProcessingException ex) {
        }
        return jsonData;
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
