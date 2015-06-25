import java.util.Scanner;

/**
 * Created by Сергей on 23.06.2015.
 */
public class Calculate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hello, this is an elementary calculator !!!");
        System.out.println("Enter two number.");
        System.out.println("Enter your first number:");
        double num1 = sc.nextDouble();
        System.out.println("Enter your second number:");
        double num2 = sc.nextDouble();
        System.out.println("Please choose operation +, -, *, / :");
        String operation = sc.next();
        switch (operation) {
            case "+":
                System.out.print("Result:");
                System.out.println(num1 + num2);
                break;
            case "-":
                System.out.print("Result:");
                System.out.println(num1 - num2);
                break;
            case "*":
                System.out.print("Result:");
                System.out.println(num1 * num2);
                break;
            case "/":
                System.out.print("Result:");
                System.out.println(num1 / num2);
                break;
            default:
                System.out.println("Please choose operation only(+,-,*,/)!!!");
                main(args);

        }
    }
}



