/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.fsu.cs.cen4021.armory;

import java.io.IOException;

/**
 * @author Javier
 */
public class WeaponFactory {

    public static Weapon getWeapon(String type) {
        switch (type) {
            case "sword":
                return new Sword();
            case "arrow":
                return new SimpleArrow();
            case "axe":
                return new SimpleAxe();
            case "staff":
                return new SimpleMagicStaff();
            case "theChosenOneAxe":
                try {
                    return new TheChosenOneAxe();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            case "ancientMagicStaff":
                return new AncientMagicStaff();
            case "webRitualArrow":
                return new WebRitualArrow();
            default:
                throw new IllegalArgumentException("Invalid type");
        }
    }

}
