import org.junit.Before;
import org.junit.Test;
import players.Barbarian;

import static org.junit.Assert.assertEquals;

public class BarbarianTest {

    Barbarian barbarian1;
    Barbarian barbarian2;

    @Before
    public void before(){
        barbarian1 = new Barbarian("Thot", 40);
        barbarian2 = new Barbarian("Leid", 90);
    }

    @Test
    public void hasName() {
        assertEquals("Thot", barbarian1.getName());
    }

    @Test
    public void hasHealthPoints() {
        assertEquals(40, barbarian1.getHealthPoints());
    }
}
