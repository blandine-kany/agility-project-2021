package packageFilm;

public abstract class MovingPicture {

    protected String title;
    protected String director;
    protected Scenario scenario;

    MovingPicture() {
    }

    /**
     * Template method
     **/
    public final String startProduction() {
        return this.information() + "\n" + this.hirePeople();
    }

    /**
     * Abstract methods
     **/
    public abstract String information();

    public abstract String hirePeople();

    @Override
    public abstract boolean equals(Object obj);

    @Override
    public abstract int hashCode();

    /**
     * Simple methods
     **/
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

}
