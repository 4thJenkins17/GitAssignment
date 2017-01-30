package edu.fsu.cs.cen4021.armory;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.StringBuilder;

/**
 * Created by asajenkins on 1/27/17.
 */
public class TheChosenOneAxe extends BasicWeapon implements Weapon {
    private static int chosenPower;
    private static FileInputStream file;
    private static String firstWord, secondWord;

    TheChosenOneAxe() throws IOException {
        super(getChosenPower());
    }

    @Override
    public int hit()
    {
        return DAMAGE;
    }

    public static int getChosenPower() throws IOException {
        try {
            setChosenPower();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return chosenPower;
    }

    public static void setChosenPower() throws IOException {

        StringBuilder str1 = new StringBuilder("");
        StringBuilder str2 = new StringBuilder("");
        boolean flag = false, flag2 = false, flag3 = false, flag4 = false;
        String tmp = "";
        firstWord = "";
        secondWord = "";

        int a;
        int b = 0, e = 0;
        char c, d;

        try {

            file = new FileInputStream("conf/thechosenone.txt");

            while ((a = file.read()) != -1){

                c = (char)a;
                d = (char)a;

                // First word
                if (c != '\n' && flag == false) {
                   firstWord += c;
                }


                if (c == '\n' && flag2 == false){
                    b++;
                    str1.append(firstWord);
                    flag = true;
                    flag2 = true;
                }

                if (d != '\n' && flag3 == false && flag2 == true && flag == true) {
                    secondWord += d;
                }

                if (d == '\n' && flag4 == false && flag2 == true && flag == true){
                    if (secondWord.equals(firstWord)) {
                        b++;
                        secondWord = "";
                    }else if(!secondWord.equals(firstWord) && secondWord != "") {
                        chosenPower = b + 1;
                        str2.append(secondWord);
                        break;
                    }
                }


            }

        }catch (Exception ex){

            ex.printStackTrace();

        }finally {

            if (file != null){
                file.close();
            }

        }
    }

    @Override
    public int hit(int armor)
    {

        if (armor > 0 && armor < 20){
            return DAMAGE;
        }

        return DAMAGE - armor;
    }
}
