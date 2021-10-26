package Scenario;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import packageFilm.Film;
import packageFilm.Scenario;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class StepDefUS00 {

    private Scenario scenario;
    private List<Film> listFilm;

    //US00_Multiplicité et scenario

    //adaptations multiples d’un scenario
    @Given("un scenario qui est nommé {string}")
    public void un_scenario_qui_est_nommé(String origTitle) {
        this.scenario = new Scenario(origTitle);
    }

    @And("une liste des films <listFilm>")
    public void une_liste_des_films_ListFilm() {
        this.listFilm = new ArrayList<Film>();
    }

    @And("la liste comprend un film avec un {string} et un {string}")
    public void la_liste_comprend_un_film_avec_un_et_un(String title, String director) {
        this.listFilm.add(new Film(title, director));
    }

    @When("le réalisateur crée des adaptations pour le scenario donné")
    public void le_réalisateur_crée_des_adaptations_pour_le_scenario_donné() {
        for (Film f : this.listFilm) {
            this.scenario.addFilm(f);
        }
    }

    @Then("le système met à jour les informations du scenario \\(nombre d'adaptations du scenario: {int}).")
    public void le_système_met_à_jour_les_informations_du_scenario_nombre_d_adaptations_du_scenario(int result) {
        assertTrue(this.scenario.getListOfFilms().size() > 0);
        assertEquals(Integer.valueOf(result), scenario.getListOfFilms().size());
    }


    //refus doublon d'un film
    @Given("la liste comprend un film avec les mêmes informations que le précedent")
    public void la_liste_comprend_un_film_avec_les_mêmes_informations_que_le_précedent() {
        Film sameFilm = listFilm.get(listFilm.size() - 1);
        listFilm.add(new Film(sameFilm.getTitle(), sameFilm.getDirector()));
    }

    @Then("le système réfuse d'ajouter les films avec les mêmes informations qu'une adaptation existante du scenario donné \\(nombre d'adaptations du scenario:{int}).")
    public void le_système_réfuse_d_ajouter_les_films_avec_les_mêmes_informations_qu_une_adaptation_existante_du_scenario_donné_nombre_d_adaptations_du_scenario(int result) {
        assertTrue(this.scenario.getListOfFilms().size() > 0);
        assertEquals(Integer.valueOf(result), scenario.getListOfFilms().size());
    }


    //US01_Annulation et scenario

    //Suppression d'une adaptation d'un scenario
    @Given("le scenario comprend un film avec un {string} et un {string}")
    public void le_scenario_comprend_un_film_avec_un_et_un(String title, String director) {
        this.scenario.addFilm(new Film(title, director));
    }

    @When("le réalisateur supprime une adaptation d'un scenario donné")
    public void le_réalisateur_supprime_une_adaptation_d_un_scenario_donné() {
        this.scenario.scenarioInfo();
        this.scenario.removeFilm(this.scenario.getListOfFilms().get(1));
    }

}
