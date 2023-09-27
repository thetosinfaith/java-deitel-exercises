package DeitelJavaProgrammingBook.ChapterTwo;

import java.util.Scanner;

public class LargestAndSmallestIntegers {
    public static void main(String[] args) {
        int smallest = Integer.MAX_VALUE;
        int largest = Integer.MIN_VALUE;

        Scanner input = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter a number: ");
            int userInput = input.nextInt();

            if (userInput > largest) {
                largest = userInput;
            }

            if (userInput < smallest) {
                smallest = userInput;
            }
        }

        System.out.println("Largest number is: " + largest);
        System.out.println("Smallest number is: " + smallest);
    }
}
