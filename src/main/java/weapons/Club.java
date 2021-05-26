package weapons;

import behaviours.IWeapon;
import enemy.Enemy;

public class Club implements IWeapon {


    private int damageValue;

    public Club(int damageValue) {
        this.damageValue = damageValue;
    }

    public int attack(Enemy enemy) {
        int healthPoints = enemy.getHealthPoints();
        healthPoints -= damageValue;
        enemy.setHealthPoints(healthPoints);
        return enemy.getHealthPoints();
    }
}
