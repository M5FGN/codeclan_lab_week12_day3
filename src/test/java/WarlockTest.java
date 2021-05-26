import org.junit.Before;
import org.junit.Test;
import players.Warlock;

import static org.junit.Assert.assertEquals;

public class WarlockTest {

    Warlock warlock1;
    Warlock warlock2;

    @Before
    public void setUp() {
        warlock1 = new Warlock("Dunorim", 90);
        warlock2 = new Warlock("Onoldor", 10);
    }

    @Test
    public void hasName(){
        assertEquals("Dunorim", warlock1.getName());
    }

    @Test
    public void hasHealthPoints() {
        assertEquals(10, warlock2.getHealthPoints());
    }
}
