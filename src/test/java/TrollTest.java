import enemy.Troll;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TrollTest {

    Troll troll1;
    Troll troll2;

    @Before
    public void setUp(){
        troll1 = new Troll("Ekon", 45);
        troll2 = new Troll("Melkree", 95);
    }

    @Test
    public void hasName() {
        assertEquals("Melkree", troll2.getName());
    }

    @Test
    public void hasHealthPoints(){
        assertEquals(95, troll2.getHealthPoints());
    }

}
