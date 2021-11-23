package packageFilm;

/**
 * Décrivez votre classe packageFilm.Film ici.
 *
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public class Film extends MovingPicture {
    /**
     * Constructeur d'objets de classe packageFilm.Film
     */
    public Film(String title, String director) {
        super();
        // initialisation des variables d'instance
        this.title = title;
        this.director = director;
    }

    @Override
    public String information() {
        return "Film: " + this.title + " by " + this.director;
    }

    @Override
    public String hirePeople() {
        return "People to hire: Actors, Set Designer, Cameramen, Director, Screen writer, Producer";
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
