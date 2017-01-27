package edu.fsu.cs.cen4021;

import edu.fsu.cs.cen4021.armory.Weapon;
import edu.fsu.cs.cen4021.armory.WeaponFactory;

/**
 * @author Javier
 */
public class RoleGame {

    public static void main(String[] args) {
        Weapon sword = WeaponFactory.getWeapon("sword");

        System.out.println("Sword has " + sword.hit() + " of damage.");
        int armor = 17;
        System.out.println("Swords were able to do " + sword.hit(armor) + " of damage due to an armor with " + armor + " points.");

        //TODO: Add the remaining weapons here

        Weapon arrow = WeaponFactory.getWeapon("arrow");
        Weapon axe = WeaponFactory.getWeapon("axe");
        Weapon staff = WeaponFactory.getWeapon("staff");
        
        System.out.println("Arrow has " + arrow.hit() + " of damage.");
        armor = 25;
        System.out.println("Arrows were able to do " + arrow.hit(armor) + " of damage due to an armor with " + armor + " points.");

        System.out.println("Axe has " + axe.hit() + " of damage.");
        armor = 50;
        System.out.println("Axes were able to do " + axe.hit(armor) + " of damage due to an armor with " + armor + " points.");

        System.out.println("Staff has " + staff.hit() + " of damage.");
        armor = 50;
        System.out.println("Staffs were able to do " + staff.hit(armor) + " of damage due to an armor with " + armor + " points.");

    }
}
