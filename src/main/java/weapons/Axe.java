package weapons;

import behaviours.IWeapon;
import enemy.Enemy;
import players.Player;

public class Axe implements IWeapon {



    private int damageValue;

    public Axe(int damageValue) {
        this.damageValue = damageValue;
    }

    public int attack(Enemy enemy) {
        int healthPoints = enemy.getHealthPoints();
        healthPoints -= damageValue;
        enemy.setHealthPoints(healthPoints);
        return enemy.getHealthPoints();
    }


}
