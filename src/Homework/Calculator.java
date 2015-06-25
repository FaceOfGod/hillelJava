package Homework;

import java.util.Scanner;

/**
 * Created by Сергей on 25.06.2015.
 */
public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hello!!! \nIt is elementary calculate!!! \nPlease Enter two numbers. \nFirst number:");
        while (!sc.hasNextDouble()) sc.next();
        double num1 = sc.nextDouble();
        System.out.println("Enter two number:");
        double num2 = sc.nextDouble();
        System.out.println("Choose operation +, -, *, /:");
        String operation = sc.next();





    }
}

