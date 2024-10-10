package foreach.cda.Controllers;

import java.util.List;

import foreach.cda.Model.Suivre;
import foreach.cda.Services.SuivreService;

public class SuivreController {
    private SuivreService suivreService;

    public SuivreController() {
        this.suivreService = new SuivreService();
    }

    // GET
    //exemple /
    //Utilisateur va devoir aller sur /suivre/
    public List<Suivre> getAll(){
        return suivreService.getAll();
    }


    // GET
    // exemple /{id}/suivre
    //Utilisateur va devoir aller sur /suivre/1/etudiant
    public List<Suivre> getBySuivreID(int id){
        return suivreService.getByEtudiantID(id);
    }

    // GET
    // exemple /{id}/cours
    //Utilisateur va devoir aller sur /suivre/1/cours
    public List<Suivre> getByCourID(int id){
        return suivreService.getByCourID(id);
    }

    //POST 
    //exemple /
    //Utilisateur va devoir aller sur /suivre/
    public void insert(int idEtudiant, int idCour){
        suivreService.insert(idCour, idEtudiant);
    }

    // DELETE
    //exemple /{id}/cours
    //Utilisateur va devoir aller sur /suivre/1/cours
    public void deleteByCourID(int id){
        suivreService.deleteAllByCourID(id);
    }

    // DELETE
    //exemple /{id}/etudiant
    //Utilisateur va devoir aller sur /suivre/1/etudiant
    public void deleteByEtudiantID(int id){
        suivreService.deleteAllByEtudiantID(id);
    }

    
    // DELETE
    //exemple /{idEtudiant}/{idCour}
    //Utilisateur va devoir aller sur /suivre/1/1
    public void deleteByEtudiantID(int idEtudiant, int idCour){
        suivreService.delete(idEtudiant, idCour);
    }
}
