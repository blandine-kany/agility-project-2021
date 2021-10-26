package packageFilm;


import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Classe-test ScenarioTest.
 *
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 * <p>
 * Les classes-test sont documentées ici :
 * http://junit.sourceforge.net/javadoc/junit/framework/TestCase.html
 * et sont basées sur le document Š 2002 Robert A. Ballance intitulé
 * "JUnit: Unit Testing Framework".
 * <p>
 * Les objets Test (et TestSuite) sont associés aux classes à tester
 * par la simple relation yyyTest (e.g. qu'un Test de la classe Name.java
 * se nommera NameTest.java); les deux se retrouvent dans le męme paquetage.
 * Les "engagements" (anglais : "fixture") forment un ensemble de conditions
 * qui sont vraies pour chaque méthode Test à exécuter.  Il peut y avoir
 * plus d'une méthode Test dans une classe Test; leur ensemble forme un
 * objet TestSuite.
 * BlueJ découvrira automatiquement (par introspection) les méthodes
 * Test de votre classe Test et générera la TestSuite conséquente.
 * Chaque appel d'une méthode Test sera précédé d'un appel de setUp(),
 * qui réalise les engagements, et suivi d'un appel à tearDown(), qui les
 * détruit.
 */
public class ScenarioTest {
    private Film film1;
    private Scenario scenario1;
    private Scenario scenario2;


    // Définissez ici les variables d'instance nécessaires à vos engagements;
    // Vous pouvez également les saisir automatiquement du présentoir
    // à l'aide du menu contextuel "Présentoir --> Engagements".
    // Notez cependant que ce dernier ne peut saisir les objets primitifs
    // du présentoir (les objets sans constructeur, comme int, float, etc.).


    /**
     * Constructeur de la classe-test ScenarioTest
     */
    public ScenarioTest() {
    }

    /**
     * Met en place les engagements.
     * <p>
     * Méthode appelée avant chaque appel de méthode de test.
     */
    @BeforeEach
    public void setUp() // throws java.lang.Exception
    {
        this.film1 = new Film("Dune", "Denis Villeneuve");
        this.scenario1 = new Scenario("The Road to Dune");
        this.scenario2 = new Scenario("DragonBall Z");

    }

    /**
     * Supprime les engagements
     * <p>
     * Méthode appelée après chaque appel de méthode de test.
     */
    @AfterEach
    public void tearDown() // throws java.lang.Exception
    {
        //Libérez ici les ressources engagées par setUp()
        this.film1 = null;
        this.scenario1 = null;
        this.scenario2 = null;
    }

    @Test
    public void testScenarioInfo() {
        assertEquals("The Road to Dune", this.scenario1.scenarioInfo());
    }

    @Test
    public void testGetOriginalTitle() {
        assertEquals("The Road to Dune", this.scenario1.getOriginalTitle());
    }

    @Test
    public void testSetOriginalTitle() {
        this.scenario1.setOriginalTitle("Dune");
        assertEquals("Dune", this.scenario1.getOriginalTitle());
    }

    @Test
    public void testGetListFilm() {
        assertEquals(true, this.scenario1.getListOfFilms().isEmpty());
    }

    @Test
    public void testAddFilm() {
        this.scenario1.addFilm(this.film1);

        //modification
        Film f = new Film("Dune", "Denis Villeneuve");
        this.scenario1.addFilm(f);

        assertTrue(this.scenario1.getListOfFilms().contains(this.film1));
        assertEquals(this.scenario1, this.film1.getScenario());

        //modification
        assertEquals(1, this.scenario1.getListOfFilms().size());
        assertEquals(null, f.getScenario());
    }

    @Test
    public void testRemoveFilm() {
        scenario1.removeFilm(film1);

        assertEquals(true, !scenario1.getListOfFilms().contains(film1));
        assertEquals(null, film1.getScenario());
    }

    @Test
    public void testEquals() {
        assertTrue(!this.scenario1.equals(null));
        assertEquals(this.scenario1, this.scenario1);
        assertEquals(this.scenario1, new Scenario("The Road to Dune"));
        assertTrue(!this.scenario1.equals(this.scenario2));
    }

    @Test
    public void testHashCode() {
        Scenario scenario = new Scenario("The Road to Dune");
        assertTrue(this.scenario1.hashCode() == scenario.hashCode());
    }
}

