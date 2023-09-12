package Exercises;/* Pseudocode

- Collect User Input

- Check user input

- If user input any number between 100 - 90
                                   (Print A)

- If user input any number between 90 - 80
                                   (Print B)

- If user input any number between 80 - 70
                                   (Print C)

- If user input any number between 70 - 60
                                   (Print D)

- If user input any number less than 60
                                   (Print F)
*/

import java.util.Scanner;

public class ReportCard {
    public static void main(String[] args) {

        Scanner students = new Scanner(System.in);

        System.out.println("Please, enter your student score");

        int userinput = students.nextInt();

        if ((userinput <= 100) & (userinput >= 90)) {

            System.out.println("A");

        }

        if ((userinput <= 89) & (userinput >= 80)) {

            System.out.println("B");

        }

        if ((userinput <= 79) & (userinput >= 70)) {

            System.out.println("C");

        }

        if ((userinput <= 69) & (userinput >= 60)) {

            System.out.println("D");

        }

        if ((userinput <= 59) & (userinput >= 50)) {

            System.out.println("F");

        }

    }

}