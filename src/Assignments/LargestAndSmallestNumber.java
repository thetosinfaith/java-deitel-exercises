package Assignments;

import java.util.Scanner;

public class LargestAndSmallestNumber {
    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        int largestNumber = 0;
        int smallestNumber = 0;

        while (true) {

            System.out.print("Enter a number or -1 to break: ");
        int number = userInput.nextInt();
      if (number == -1){
          break;
      }

        if (number > largestNumber) {
            largestNumber = number;
        }else
             smallestNumber = number;

            System.out.println("The largest number is " + largestNumber);
            System.out.println("The smallest number is " + smallestNumber);

        }

    }

}