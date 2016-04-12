package FilosophyJavaLess.Section_5;

/**
 * Created by Сергей on 21.03.2016.
 */
public class task_4 {
    public task_4(){
        System.out.println("deffault");
    }
    public task_4(String a){
        System.out.println(a);
    }

    public static void main(String[] args) {
        String a = "new";
        new task_4();
        new task_4(a);

    }
}
