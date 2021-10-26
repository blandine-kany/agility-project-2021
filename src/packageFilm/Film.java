package packageFilm;

/**
 * Décrivez votre classe packageFilm.Film ici.
 *
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public class Film {
    // variables d'instance - remplacez l'exemple qui suit par le vôtre
    private String title;
    private String director;
    private Scenario scenario;

    /**
     * Constructeur d'objets de classe packageFilm.Film
     */
    public Film(String title, String director) {
        // initialisation des variables d'instance
        this.title = title;
        this.director = director;
    }

    public String filmInformation() {
        return this.title + " by " + this.director;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDirector() {
        return this.director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public Scenario getScenario() {
        return this.scenario;
    }

    public void setScenario(Scenario scenario) {
        this.scenario = scenario;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Film) {
            Film film1 = (Film) obj;
            return film1.title.equals(this.title) && film1.director.equals(this.director);
        }
        return false;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 7 * hash + (this.director != null ? this.director.hashCode() : 0);
        hash = 7 * hash + (this.title != null ? this.title.hashCode() : 0);
        return hash;
    }
}
