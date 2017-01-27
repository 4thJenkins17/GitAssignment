package edu.fsu.cs.cen4021.armory;

/**
 * Created by asajenkins on 1/27/17.
 */
public class SimpleMagicStaff extends BasicWeapon implements Weapon {
    SimpleMagicStaff(){super(80);}

    @Override
    public int hit() {
        return DAMAGE;
    }

    @Override
    public int hit(int armor) {
        double perc = armor * 0.20;
        return hit() - (armor - (int)perc);
    }
}
