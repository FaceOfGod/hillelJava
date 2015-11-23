package FilosophyJavaLess;

/**
 * Created by Сергей on 23.11.2015.
 */
public class Section_3_task_6 {
    String name;
    String says;
    public static void main(String[] args) {
        Section_3_task_5 firstDog = new Section_3_task_5();
        Section_3_task_5 twoDog = new Section_3_task_5();
        Section_3_task_5 thirdDog = new Section_3_task_5();
        firstDog.name = "Spot";
        firstDog.says = "Hello i'm Spot!!";
        twoDog.name = "Scruffy";
        twoDog.says = "Hello i'm Scruffy!!!";

        firstDog = thirdDog;


        System.out.println(firstDog == thirdDog);
        System.out.println(firstDog.equals(thirdDog));


    }
}
