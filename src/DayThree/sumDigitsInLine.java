package DayThree;
import java.util.Scanner;

public class sumDigitsInLine {
    public static void main(String[] args) {
        System.out.println("Num");
        Scanner scn = new Scanner(System.in);
        int n = 0;
        n = scn.nextInt();
        int x = n;
        int s = 0;
        while (x != 0) {
            s += x % 10;
            x /= 10;
        }
        System.out.println("Sum " + n + " = " + s);
    }
}
