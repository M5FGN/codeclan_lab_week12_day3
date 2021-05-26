import org.junit.Before;
import org.junit.Test;
import players.Knight;

import static org.junit.Assert.assertEquals;

public class KnightTest {

    Knight knight1;
    Knight knight2;

    @Before
    public void setUp() {
        knight1 = new Knight("Jarvis the Keeper", 25);
        knight2 = new Knight("Harding the Fierce", 65);
    }

    @Test
    public void hasName() {
       assertEquals("Harding the Fierce", knight2.getName());
    }

    @Test
    public void hasHealthPoints(){
        assertEquals(65, knight2.getHealthPoints());
    }
}
