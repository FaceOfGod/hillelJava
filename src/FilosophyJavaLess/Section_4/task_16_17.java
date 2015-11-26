package FilosophyJavaLess.Section_4;


import java.util.Random;

/**
 * Created by Сергей on 26.11.2015.
 */
public class task_16_17 {
    static String result = " ";
    static Random rnd = new Random();

    static void test(int rndNumOne,int rndNumTwo){
        if(rndNumOne<rndNumTwo){
            result = "One < Two ";
        }
        else if(rndNumOne>rndNumTwo){
            result = "One > Two ";
        }
        else result = "One = Two ";
    }

    public static void main(String[] args) {
        for(int i = 0;i < 24; i++){
        //while(true) {
            int b = rnd.nextInt(20);
            int a = rnd.nextInt(20);
            test(a, b);
            System.out.println(result + a + " " + b);
        }
    }




}
