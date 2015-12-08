package FilosophyJavaLess.Section_4;

/**
 * Created by Сергей on 08.12.2015.
 */
public class task_23_fibonacci {
    private static int fibonacci(int value) {
        if (value <= 0) {
            return 0;
        } else if (value == 1) {
            return 1;
        } else if (value == 2) {
            return 1;
        } else {
            return fibonacci(value - 1) + fibonacci(value - 2);
        }
    }

    public static void main(String[] args) {
        for (int i = 1; i <= 11; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }
}
