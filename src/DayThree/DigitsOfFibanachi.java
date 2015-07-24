package DayThree;

/**
 * Created by ITHILLEL6 on 30.06.2015.
 */
public class DigitsOfFibanachi {
    public static void main(String[] args) {
        int n = 20;
        int a = 1, b = 1;
        System.out.println(a + " " + b);
        int fib = 2, i = 2;
        while (i < n) {
            fib = a + b;
            a = b;
            b = fib;
            System.out.println(" " + fib);
            i++;
        }
    }
}
