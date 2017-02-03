package edu.fsu.cs.cen4021.armory;
import java.util.Collections;
import java.util.List;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
/**
 * Created by asajenkins on 2/1/17.
 */
public class AncientMagicStaff extends BasicWeapon implements Weapon {
    private static FileInputStream file;
    private static ObjectInputStream obj1;
    private static List<Integer> __list;

    public AncientMagicStaff(){
        super(setPower());
    }

    public static int setPower(){

        // read object
        __list = readObject();

        // raise list to second power
        for (int i = 0; i < __list.size(); i++) {
            __list.set(i, __list.get(i) * __list.get(i));
        }

        // remove 2nd and 5th element
        __list.remove(1);
        __list.remove(4);

        // reverse list
        Collections.reverse(__list);

        // Sum of 1st, 3rd, and 7th
        Integer sum = __list.get(0) + __list.get(2) + __list.get(6);

        return sum.intValue();
    }

    public static List<Integer> readObject(){
        List<Integer> list;
        try{
            file = new FileInputStream("conf/ancientstaff.obj");
            obj1 = new ObjectInputStream(file);
            list = (List<Integer>) obj1.readObject();
            return list;
        }catch(Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }

    public static List<Integer> raisePower(List<Integer> _list){
        List<Integer> list = null;

        return list;
    }

    @Override
    public int hit() {
        return DAMAGE;
    }

    @Override
    public int hit(int armor) {
        double perc = armor * 0.25;
        return hit() - (armor - (int)perc);
    }
}
