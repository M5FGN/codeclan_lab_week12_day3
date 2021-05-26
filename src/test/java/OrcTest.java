import enemy.Orc;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class OrcTest {

    Orc orc1;
    Orc orc2;

    @Before
    public void setUp(){
        orc1 = new Orc ("Rarfu", 10);
        orc2 = new Orc ("Pitgurat", 75);
    }

    @Test
    public void hasName() {
        assertEquals("Pitgurat", orc2.getName());
    }

    @Test
    public void hasHealthPoints() {
        assertEquals(10, orc1.getHealthPoints());
    }
}
