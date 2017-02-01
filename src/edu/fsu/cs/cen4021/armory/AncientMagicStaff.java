package edu.fsu.cs.cen4021.armory;

/**
 * Created by asajenkins on 2/1/17.
 */
public class AncientMagicStaff extends BasicWeapon implements Weapon {
    public AncientMagicStaff(){super(1);}

    @Override
    public int hit() {
        return 0;
    }

    @Override
    public int hit(int armor) {
        return 0;
    }
}
