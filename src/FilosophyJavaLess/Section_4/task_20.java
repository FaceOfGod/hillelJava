package FilosophyJavaLess.Section_4;

/**
 * Created by Сергей on 07.12.2015.
 */
public class task_20 {
    static int test(int testVal, int target, int begin, int end){
        if(testVal > target && testVal >= begin && testVal <= end )
            return +1;
        else if(testVal < target && testVal >= begin && testVal <= end)
            return -1;
        else
            return 0;
    }

    public static void main(String[] args) {
        System.out.println(test(10,5,0,10));
        System.out.println(test(5,10,0,10));
        System.out.println(test(10,10,10,10));



    }
}
