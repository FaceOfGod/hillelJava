package FilosophyJavaLess.Section_3;

/**
 * Created by Сергей on 25.11.2015.
 */
public class task_14 {

    static void f(boolean b, boolean x){}

    private static void stringTest (String x, String y){


        System.out.println(x + y);
        System.out.println(x.equals(y));
        System.out.println(x != y);
        System.out.println(x == y);
        System.out.println(x = y);




    }

    public static void main(String[] args) {
        stringTest("lol","lolik");
        //stringTest("world","work");
    }

}
