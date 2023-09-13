package Exercises;

import java.util.Scanner;
public class MultiplicationTableGenerator {
    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);
//    2. Read input number from the user and store it in a variable num
        int number = userInput.nextInt();
//3. Initialize a variable i to 1
        int MultiplicationTable = 1;
//            4. While i is less than or equal to 10:
        int result = 0;
        while (MultiplicationTable <= 24) {
            result = number * MultiplicationTable;

            System.out.println(number + "x" + MultiplicationTable + "=" + result + MultiplicationTable++);

        }

    }

}
