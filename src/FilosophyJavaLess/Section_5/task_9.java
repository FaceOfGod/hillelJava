package FilosophyJavaLess.Section_5;

/**
 * Created by Сергей on 12.04.2016.
 */
public class task_9 {
    int kills = 0;
    String heroName = "FOG";
    task_9(){
        System.out.println("deffault ");
    }
    task_9(String name){
        heroName = name;
        System.out.println("This String " + heroName);

    }
    task_9 (int kill){
        this("Trooolll");
        kills = kill;
        System.out.println("This int " + kills);
    }



    public static void main(String[] args) {
        task_9 x = new task_9(2);
        System.out.println(x);




    }
}
