package FilosophyJavaLess.Section_3;

import FilosophyJavaLess.Section_3.task_5;

/**
 * Created by Сергей on 23.11.2015.
 */
public class task_6 {
    String name;
    String says;
    public static void main(String[] args) {
        task_5 firstDog = new task_5();
        task_5 twoDog = new task_5();
        task_5 thirdDog = new task_5();
        firstDog.name = "Spot";
        firstDog.says = "Hello i'm Spot!!";
        twoDog.name = "Scruffy";
        twoDog.says = "Hello i'm Scruffy!!!";

        firstDog = thirdDog;


        System.out.println(firstDog == thirdDog);
        System.out.println(firstDog.equals(thirdDog));


    }
}
