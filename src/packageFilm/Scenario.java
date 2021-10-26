package packageFilm;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Décrivez votre classe packageFilm.Scenario ici.
 *
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public class Scenario {
    // variables d'instance - remplacez l'exemple qui suit par le vôtre
    private String originalTitle;
    private List<Film> listFilm;

    /**
     * Constructeur d'objets de classe packageFilm.Scenario
     */
    public Scenario(String title) {
        // initialisation des variables d'instance
        this.originalTitle = title;
        this.listFilm = new ArrayList<Film>();
    }


    /**
     * Méthode qui renvoie des informations sur l'objet courant
     * @return
     */
    public String scenarioInfo() {
        String infoOfFilms = "";
        for (Film f : this.listFilm) {
            infoOfFilms = infoOfFilms + " " + f.filmInformation();
        }

        return this.originalTitle + infoOfFilms;
    }

    public String getOriginalTitle() {
        return this.originalTitle;
    }

    public void setOriginalTitle(String s) {
        this.originalTitle = s;
    }

    public List<Film> getListOfFilms() {
        return getFilmList();
    }

    private List<Film> getFilmList() {
        List<Film> list = Collections.unmodifiableList(this.listFilm);
        return list;
    }

    /**
     * Méthode qui ajoute un film donné sur la liste des films
     * de l'objet courant
     * @param f
     */
    public void addFilm(Film f) {
        boolean newFilm = true;
        //vérification que le film n'existe pas dans la liste
        for (Film film : this.listFilm) {
            if (film.equals(f)) {
                newFilm = false;
            }
        }
        //ajout du nouveau film
        if (newFilm) {
            this.listFilm.add(f);
            f.setScenario(this);
        }
    }

    /**
     * Méthode qui supprime un film donné de la liste des films
     * @param f
     */
    public void removeFilm(Film f) {
        this.listFilm.remove(f);
        f.setScenario(null);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Scenario) {
            Scenario scenario = (Scenario) obj;
            return scenario.originalTitle.equals(this.originalTitle) && scenario.listFilm.equals(this.listFilm);
        }
        return false;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 7 * hash + (this.originalTitle != null ? this.originalTitle.hashCode() : 0);
        hash = 7 * hash + (this.listFilm != null ? this.listFilm.hashCode() : 0);
        return hash;
    }

        /* Trop compliqué pour l'instant
    public void setListFilm(ArrayList<Film> listFilm) {
        this.listFilm = listFilm;
    }*/
}

