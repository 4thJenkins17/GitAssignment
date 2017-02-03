package edu.fsu.cs.cen4021.armory;

/**
 * Created by asajenkins on 2/3/17.
 */
public class WebRitualArrow extends BasicWeapon implements Weapon {
    public WebRitualArrow(){super(1);}

    @Override
    public int hit() {
        return 0;
    }

    @Override
    public int hit(int armor) {
        return 0;
    }
}
