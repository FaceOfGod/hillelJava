package FilosophyJavaLess.Section_5;

/**
 * Created by Сергей on 08.04.2016.
 */
public class task_8 {
    void testOne(){
        testTwo();
        this.testTwo();
        System.out.println("working" + '\n' + testTwo() );
    }
    int testTwo(){
        int a = 0;
        a++;
        return a;

    }

    public static void main(String[] args) {
        task_8 a = new task_8();
        a.testOne();
    }

}
