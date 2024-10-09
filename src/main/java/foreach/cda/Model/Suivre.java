package foreach.cda.Model;

public class Suivre {
    private Etudiants etudiants;
    private Cours cours;

    public Suivre(Etudiants etudiants, Cours cours) {
        this.etudiants = etudiants;
        this.cours = cours;
    }

    public Etudiants getEtudiants() {
        return etudiants;
    }

    public void setEtudiants(Etudiants etudiants) {
        this.etudiants = etudiants;
    }

    public Cours getCours() {
        return cours;
    }

    public void setCours(Cours cours) {
        this.cours = cours;
    }

        
}