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
        int armor = 20;
        System.out.println("Swords were able to do " + sword.hit(armor) + " of damage due to an armor with " + armor + " points.");

        //TODO: Add the remaining weapons here
        Weapon arrow = WeaponFactory.getWeapon("arrow");
        Weapon axe = WeaponFactory.getWeapon("axe");
        Weapon staff = WeaponFactory.getWeapon("staff");
        Weapon tcoAxe = WeaponFactory.getWeapon("theChosenOneAxe");
        Weapon magicStaff = WeaponFactory.getWeapon("ancientMagicStaff");
        Weapon ritualArrow = WeaponFactory.getWeapon("webRitualArrow");

        // Arrow
        System.out.println("\nArrow has " + arrow.hit() + " of damage.");
        System.out.println("Arrows were able to do " + arrow.hit(armor) + " of damage due to an armor with " + armor + " points.");

        // Axe
        System.out.println("\nAxe has " + axe.hit() + " of damage.");
        System.out.println("Axes were able to do " + axe.hit(armor) + " of damage due to an armor with " + armor + " points.");

        // Staff
        System.out.println("\nStaff has " + staff.hit() + " of damage.");
        System.out.println("Staffs were able to do " + staff.hit(armor) + " of damage due to an armor with " + armor + " points.");

        // Chosen One Axe
        System.out.println("\nThe Chosen One Axe has " + tcoAxe.hit() + " of damage.");
        System.out.println("The Chosen One Axe  were able to do " + tcoAxe.hit(armor) + " of damage due to an armor with " + armor + " points.");

        // Ancient Magic Staff
        System.out.println("\nThe Ancient Magic Staff has " + magicStaff.hit() + " of damage.");
        System.out.println("The Ancient Magic Staff  were able to do " + magicStaff.hit(armor) + " of damage due to an armor with " + armor + " points.");

        // Web Ritual Arrow
        System.out.println("\nThe Web Ritual Arrow has " + ritualArrow.hit() + " of damage.");
        System.out.println("The Web Ritual Arrow  were able to do " + ritualArrow.hit(armor) + " of damage due to an armor with " + armor + " points.");

    }
}
