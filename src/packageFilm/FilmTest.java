package packageFilm;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Classe-test FilmTest.
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
public class FilmTest {
    // Définissez ici les variables d'instance nécessaires à vos engagements;
    // Vous pouvez également les saisir automatiquement du présentoir
    // à l'aide du menu contextuel "Présentoir --> Engagements".
    // Notez cependant que ce dernier ne peut saisir les objets primitifs
    // du présentoir (les objets sans constructeur, comme int, float, etc.).
    private Film film1;
    private Film film2;

    /**
     * Constructeur de la classe-test FilmTest
     */
    public FilmTest() {
    }

    /**
     * Met en place les engagements.
     * <p>
     * Méthode appelée avant chaque appel de méthode de test.
     */
    @BeforeEach
    public void setUp() // throws java.lang.Exception
    {
        // Initialisez ici vos engagements
        this.film1 = new Film("Moi, l'incroyable", "Lina Zerraf");
        this.film2 = new Film("Star Wars", "George Lucas");

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
        this.film2 = null;
    }

    @Test
    public void testFilmInformation() {
        assertEquals("Moi, l'incroyable by Lina Zerraf", this.film1.information());
    }

    @Test
    public void testGetTitle() {
        assertEquals("Moi, l'incroyable", this.film1.getTitle());
    }

    @Test
    public void testSetTitle() {
        this.film1.setTitle("Moi, la miserable");
        assertEquals("Moi, la miserable", this.film1.getTitle());
    }

    @Test
    public void testGetDirector() {
        assertEquals("Lina Zerraf", this.film1.getDirector());
    }

    @Test
    public void testSetDirector() {
        this.film1.setDirector("Beyoncé");
        assertEquals("Beyoncé", this.film1.getDirector());
    }

    @Test
    public void testEquals() {
        assertTrue(!this.film1.equals(null));
        assertEquals(this.film1, this.film1);
        assertEquals(this.film1, new Film("Moi, l'incroyable", "Lina Zerraf"));
        assertTrue(!this.film1.equals(this.film2));
    }

    @Test
    public void testHashCode() {
        Film film = new Film("Moi, l'incroyable", "Lina Zerraf");
        assertTrue(this.film1.hashCode() == film.hashCode());
    }

/**
 public static Test suite() {
 TestSuite suite= new TestSuite();
 suite.addTest(new MoneyTest("testEquals"));
 suite.addTest(new MoneyTest("testSimpleAdd"));
 return suite;
 } **/

}

