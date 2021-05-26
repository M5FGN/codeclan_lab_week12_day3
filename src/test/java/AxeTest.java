import behaviours.IWeapon;
import enemy.Enemy;
import enemy.Orc;
import org.junit.Before;
import org.junit.Test;
import weapons.Axe;

import static org.junit.Assert.assertEquals;

public class AxeTest {

    Orc orc1;
    Axe axe;

    @Before
    public void before() {
        orc1 = new Orc("Rarfu", 60);
        axe = new Axe(10);
    }

    @Test
    public void canAttack() {
        assertEquals(50, axe.attack(orc1));
    }


}

