package Basic_Exercises;

import java.util.Scanner;
public class PowerCalculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter first number: ");
        int firstNumber = input.nextInt();

        System.out.println("Enter second number: ");
        int secondNumber = input.nextInt();

        int total = firstNumber* firstNumber;

        System.out.println(total);

    }

}
