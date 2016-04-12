package FilosophyJavaLess.Section_5;

/**
 * Created by Сергей on 21.03.2016.
 */
public class task_5 {
    public void bark(){
        System.out.println("bark1");
    }
    public void bark(char a){
        System.out.println("bark2");
    }
    public void bark(int a){
        System.out.println("Bark3");
    }

    public static void main(String[] args) {
        int j = 0;
        char c = 'd';
        task_5 a = new task_5();
        a.bark();
        a.bark(c);
        a.bark(j);
    }

}
