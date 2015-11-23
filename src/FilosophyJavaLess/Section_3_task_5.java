package FilosophyJavaLess;

/**
 * Created by Сергей on 23.11.2015.
 */
public class Section_3_task_5 {
    String name;
    String says;

    public static void main(String[] args) {
        Section_3_task_5 firstDog = new Section_3_task_5();
        Section_3_task_5 twoDog = new Section_3_task_5();
        firstDog.name = "Spot";
        twoDog.name = "Scruffy";
        firstDog.says = "Hello me name is Spot!! Wooof wooof!!";
        twoDog.says = "Hello me name is Scruffy!! Wooof Wooof!!!";

        System.out.println(firstDog.name + '\n' + firstDog.says);
        System.out.println(twoDog.name + '\n' + twoDog.says);
    }
}
