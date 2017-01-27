package edu.fsu.cs.cen4021.armory;

/**
 * Created by asajenkins on 1/27/17.
 */
public class SimpleAxe extends BasicWeapon implements Weapon {
    SimpleAxe(){super(60);}

    @Override
    public int hit() {
        return DAMAGE;
    }

    @Override
    public int hit(int armor) {
        if (armor > 0 && armor < 20){
            return hit();
        }else{
            return hit() - armor;
        }
    }
}
