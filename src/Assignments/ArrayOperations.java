package Assignments;

public class ArrayOperations {
    public static int findElementFunction(int[] largestElementInArray) {

        int largest = largestElementInArray[0];

        for (int i = 1; i < largestElementInArray.length; i++) {

            if (largestElementInArray[i] > largest) {
                largest = largestElementInArray[i];

            }
        }

        return largest;
    }
}
