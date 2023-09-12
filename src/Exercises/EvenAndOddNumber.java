package Exercises;

import java.util.Scanner;
public class EvenAndOddNumber {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        System.out.println("Please enter a number");

        int num = reader.nextInt();

        if (num % 2 == 0)
            System.out.printf(num + "is even");
        else

            System.out.printf(num + "is odd");

    }

}

