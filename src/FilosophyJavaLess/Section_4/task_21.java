package FilosophyJavaLess.Section_4;

/**
 * Created by Сергей on 08.12.2015.
 */
public class task_21 {
    public static void maiin(String[] args) {
        for(int i = 0; i < 101; i++){
            if(i==99) break;
            if(i % 9 != 0)continue;
            System.out.println(i + " ");

        }
    }
}
