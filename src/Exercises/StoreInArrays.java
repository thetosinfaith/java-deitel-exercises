package Exercises;

import java.util.Scanner;

public class StoreInArrays {
    public static void main(String[] args) {
        int total = 0;
        int average;
        int minimum = 0;
        int maximum = 0;

        int[] scores = new int[10];
        Scanner input = new Scanner(System.in);

        for (int count = 0; count < 10; count++) {
            System.out.println("Enter your score: ");
            scores[count] = input.nextInt();
            total = total + scores[count];
        }
        System.out.println("The total of all scores is: " + total);
        average = total/10;
        System.out.println("The average is " + average);

        for (int i = 0; i < scores.length; i++) {
        }
            if (scores.length > minimum) {
                minimum = total;
            }else
                maximum = scores.length;

            System.out.println("The minimum number is " + minimum);
            System.out.println("The maximum number is " + maximum);


        }


        }







