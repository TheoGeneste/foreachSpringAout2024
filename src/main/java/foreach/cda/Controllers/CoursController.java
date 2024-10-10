package foreach.cda.Controllers;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

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
    private ObjectMapper objectMapper;

    public CoursController() {
        this.coursService = new CoursService();
        this.objectMapper = new ObjectMapper();
    }

    // GET
    //exemple /
    //Utilisateur va devoir aller sur /cours/
    public String getAll(){
        String jsonData = "";
        try {
            jsonData = objectMapper.writeValueAsString(coursService.getAll());
        } catch (JsonProcessingException ex) {
        }
        return jsonData;
    }


    // GET
    // exemple /{id}
    //Utilisateur va devoir aller sur /cours/1
    public String getByID(int id){
        String jsonData = "";
        try {
            jsonData = objectMapper.writeValueAsString(coursService.getByID(id));
        } catch (JsonProcessingException ex) {
        }
        return jsonData;
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
