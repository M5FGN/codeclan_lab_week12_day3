import org.junit.Before;
import org.junit.Test;
import players.Wizard;

import static org.junit.Assert.assertEquals;

public class WizardTest {

    Wizard wizard1;
    Wizard wizard2;

    @Before
    public void setUp(){
        wizard1 = new Wizard ("Weharad", 20);
        wizard2 = new Wizard ("Agorin", 85);
    }

    @Test
    public void hasName(){
        assertEquals("Agorin", wizard2.getName());
    }

    @Test
    public void hasHealthPoints() {
        assertEquals(85, wizard2.getHealthPoints());
    }
}
