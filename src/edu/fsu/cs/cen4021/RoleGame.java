package edu.fsu.cs.cen4021;

import edu.fsu.cs.cen4021.armory.Weapon;
import edu.fsu.cs.cen4021.armory.WeaponFactory;

/**
 * @author Javier
 */
public class RoleGame {

    public static void main(String[] args) {
        Weapon sword = WeaponFactory.getWeapon("sword");
//        Weapon arrow = WeaponFactory.getWeapon("arrow");            // Uncomment to test arrow
//        Weapon axe = WeaponFactory.getWeapon("axe");                // Uncomment to test axe
        Weapon staff = WeaponFactory.getWeapon("staff");
        System.out.println("Sword has " + staff.hit() + " of damage.");
        int armor = 17;
        System.out.println("Swords were able to do " + staff.hit(armor) + " of damage due to an armor with " + armor + " points.");

        //TODO: Add the remaining weapons here

    }
}
