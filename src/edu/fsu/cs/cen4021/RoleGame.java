package edu.fsu.cs.cen4021;

import edu.fsu.cs.cen4021.armory.Weapon;
import edu.fsu.cs.cen4021.armory.WeaponFactory;

/**
 * @author Javier
 */
public class RoleGame {

    public static void main(String[] args) {
        Weapon sword = WeaponFactory.getWeapon("sword");
//        Weapon arrow = WeaponFactory.getWeapon("simpleArrow");            // Uncomment to test arrow
        System.out.println("Sword has " + sword.hit() + " of damage.");
        int armor = 20;
        System.out.println("Swords were able to do " + sword.hit(armor) + " of damage due to an armor with " + armor + " points.");

        //TODO: Add the remaining weapons here

    }
}
