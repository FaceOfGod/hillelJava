package FilosophyJavaLess.Section_3;

import java.util.Random;

/**
 * Created by Сергей on 23.11.2015.
 */
public class task_7 {
    public static void main(String[] args) {
        Random rand = new Random();
        int j = rand.nextInt(100);

        if(j < 50){
            System.out.println("Tail of coin!  " + j);
        }
        else if(j==50){
            System.out.println("Edge of a coin!!!  " + j);
        }
        else {
            System.out.println("Eagle!!!  " + j);
        }
    }
}
