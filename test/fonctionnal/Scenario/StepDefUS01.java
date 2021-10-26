package Scenario;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import packageFilm.Film;
import packageFilm.Scenario;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class StepDefUS01 {
/**
    private Scenario scenario;

    @Given("un scenario qui est nommé {string}")
    public void un_scenario_qui_est_nommé(String origTitle) {
        this.scenario = new Scenario(origTitle);
    }

    @And("le scenario comprend un film avec un {string} et un {string}")
    public void le_scenario_comprend_un_film_avec_un_et_un(String title, String director) {
        this.scenario.addFilm(new Film(title, director));
    }

    @When("le réalisateur supprime une adaptation d'un scenario donné")
    public void le_réalisateur_supprime_une_adaptation_d_un_scenario_donné() {
        this.scenario.scenarioInfo();
        this.scenario.removeFilm(this.scenario.getListOfFilms().get(1));
    }

    @Then("le système met à jour les informations du scenario \\(nombre d'adaptations du scenario: {int}).")
    public void le_système_met_à_jour_les_informations_du_scenario_nombre_d_adaptations_du_scenario(int result) {
        assertTrue(this.scenario.getListOfFilms().size() > 0);
        assertEquals(Integer.valueOf(result), scenario.getListOfFilms().size());
    }
**/
}
