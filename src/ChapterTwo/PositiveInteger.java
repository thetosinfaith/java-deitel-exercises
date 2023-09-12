package ChapterTwo;/*

Collect user input
Declare a variable to store the result and make it 1
Start a counting loop from 1
1, because 20 divided by 1 is 20
2, because 20 divided by 2 is 10
4, because 20 divided by 4 is 5
5, because 20 divided by 5 is 4
10, because 20 divided by 10 is 2
20, because 20 divided by 20 is 1
Multiply the result to make the result bigger
print result to the user

 */

import java.util.Scanner;

public class PositiveInteger {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a positive integer:");

            for (int result = 1; result <= 20; result++) {

                System.out.println(result);

            }
        }

  }