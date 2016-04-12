package FilosophyJavaLess.Section_5;

/**
 * Created by Сергей on 21.03.2016.
 */
public class task_6 {
        public void bark(){
            System.out.println("bark1");
        }
        public void bark(char a,int b){
            System.out.println("bark2");
        }
        public void bark(int a, char b){
            System.out.println("Bark3");
        }

        public static void main(String[] args) {
            int j = 0;
            char c = 'd';
            task_6 a = new task_6();
            a.bark();
            a.bark(c,j);
            a.bark(j,c);
        }

}

