package edu.fsu.cs.cen4021.armory;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;

/**
 * Created by asajenkins on 2/3/17.
 */
public class WebRitualArrow extends BasicWeapon implements Weapon {
    private final static String theURL = "http://ww2.cs.fsu.edu/~escobara/courses/cen4021.html";
    public WebRitualArrow(){super(setPower());}

    private static int setPower(){
        return readPage();
    }

    public static int readPage(){
        URLConnection  connect = null;
        try {
            int tmp = 0;
            // establish connection
            connect = new URL(theURL).openConnection();

            //input html
            Scanner input = new Scanner(connect.getInputStream());

            // regex: end of string
            input.useDelimiter("\\Z");

            // split input using regex: filter nondigits
            String[] content = input.next().split("\\D");

            // find <h1> ... </h1>
            for (int i = 0; i < content.length; i++) {
                if (content[i].equals("1")) {
                    tmp = Integer.parseInt(content[i+1]);
                    break;
                }
            }

            return tmp;
        }catch (Exception ex){
            ex.printStackTrace();
        }
        return -1;
    }

    @Override
    public int hit() {
        return DAMAGE;
    }

    @Override
    public int hit(int armor) {
        return hit() - (armor-10);
    }
}
