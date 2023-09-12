package Exercises;

import java.util.Scanner;

public class NumberOperations {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Input first number: ");
        int number1 = input.nextInt();

        System.out.println("Input second number");
        int number2 = input.nextInt();

        System.out.println(number1 + number2);
        System.out.println(number1 - number2);
        System.out.println(number1 * number2);
        System.out.println(number1 / number2);
        System.out.println(number1 % number2);

    }

}
