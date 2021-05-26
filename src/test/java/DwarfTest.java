import com.sun.xml.internal.txw2.DatatypeWriter;
import org.junit.Before;
import org.junit.Test;
import players.Dwarf;

import static org.junit.Assert.assertEquals;

public class DwarfTest {

    Dwarf dwarf1;
    Dwarf dwarf2;

    @Before
    public void before(){
        dwarf1 = new Dwarf("Khougreac Grayjaw", 30);
        dwarf2 = new Dwarf("Grutrek Longfall", 80);
    }

    @Test
    public void hasName() {
        assertEquals("Khougreac Grayjaw", dwarf1.getName());
    }

    @Test
    public void hasHealthPoints() {
        assertEquals(30, dwarf1.getHealthPoints());
    }
}
