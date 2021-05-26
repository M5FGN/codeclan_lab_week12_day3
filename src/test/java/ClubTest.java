import enemy.Orc;
import org.junit.Before;
import org.junit.Test;
import weapons.Axe;
import weapons.Club;

import static org.junit.Assert.assertEquals;

public class ClubTest {

    Orc orc1;
    Club club;

    @Before
    public void before(){
        orc1 = new Orc("Rarfu", 60);
        club = new Club(10);
    }

    @Test
    public void canAttack() {
        assertEquals(50, club.attack(orc1));
    }


}
