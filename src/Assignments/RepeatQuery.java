package Assignments;

import java.util.Objects;
import java.util.Scanner;

public class RepeatQuery {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String response;

        do {
            System.out.print("Enter first number: ");
            int firstInput = input.nextInt();

            System.out.print("Enter second number: ");
            int secondinput = input.nextInt();

            int sum = firstInput + secondinput;
            System.out.println("The sum is: " + sum);

            System.out.println("Do you want to perform this action again? Yes/No?");
            response = input.nextLine();

        } while (response == "Yes");



    }


        }







