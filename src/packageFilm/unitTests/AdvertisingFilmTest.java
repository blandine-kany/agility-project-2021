package packageFilm.unitTests;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import packageFilm.AdvertisingFilm;
import packagePhone.Phone;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class AdvertisingFilmTest {

    private Phone iPhoneX;
    private Phone samsungGalaxyS;
    private AdvertisingFilm adForIphone;
    private AdvertisingFilm adForSamsung;


    public AdvertisingFilmTest() {
    }

    @BeforeEach
    public void setUp() // throws java.lang.Exception
    {
        this.iPhoneX = new Phone();
        this.iPhoneX.setName("iPhone X");

        this.samsungGalaxyS = new Phone();
        this.samsungGalaxyS.setName("Samsung Galaxy S");

        this.adForIphone = new AdvertisingFilm("The Awesomest iPhone", "Steven Jobs", iPhoneX);
        this.adForSamsung = new AdvertisingFilm("The most Incredible Samsung phone", "Raphael Abizmil", samsungGalaxyS);
    }

    @AfterEach
    public void tearDown() // throws java.lang.Exception
    {
        this.iPhoneX = null;
        this.samsungGalaxyS = null;
        this.adForIphone = null;
        this.adForSamsung = null;
    }

    @Test
    public void testInformation() {
        assertEquals("Advertising Film: The Awesomest iPhone by director Steven Jobs for iPhone X", adForIphone.information());
    }

    @Test
    public void testHirePeople() {
        assertEquals("People to hire: Cameramen, Screen writer, Producer", adForIphone.hirePeople());
    }

    @Test
    public void testStartProduction() {
        assertEquals("Advertising Film: The Awesomest iPhone by director Steven Jobs for iPhone X" + "\n" + "People to hire: Cameramen, Screen writer, Producer", this.adForIphone.startProduction());
    }

    @Test
    public void testEquals() {
        assertNotEquals(this.adForIphone, null);
        assertNotEquals(this.adForIphone, this.adForSamsung);
        assertEquals(this.adForIphone, new AdvertisingFilm("The Awesomest iPhone", "Steven Jobs", iPhoneX));
        assertEquals(this.adForIphone, this.adForIphone);

    }

    @Test
    public void testHashCode() {
        AdvertisingFilm advertisingFilm = new AdvertisingFilm("The Awesomest iPhone", "Steven Jobs", iPhoneX);
        assertEquals(this.adForIphone.hashCode(), advertisingFilm.hashCode());
    }
}
