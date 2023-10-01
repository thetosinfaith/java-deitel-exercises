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

    public static void reverseElementFunction(int[] arrayOperations) {

        int left = 0;   //
        int right = arrayOperations.length - 1;

        while (left < right) {
            int temporaryVariable = arrayOperations[left];
            arrayOperations[left] = arrayOperations[right];
            arrayOperations[right] = temporaryVariable;

            left++;
            right--;
        }

        for (int i = 0; i < arrayOperations.length; i++) {
            System.out.println(arrayOperations[i] + " ");

        }

    }

}
//                // Initialize variables
//                leftIndex = 0            // Index of the first element
//        rightIndex = length(anArray) - 1  // Index of the last element
//
//        // Loop until the indices meet in the middle
//        while leftIndex < rightIndex
//                // Swap elements at leftIndex and rightIndex
//                temp = anArray[leftIndex]
//        anArray[leftIndex] = anArray[rightIndex]
//        anArray[rightIndex] = temp
//
//        // Move the indices inward
//        leftIndex = leftIndex + 1
//        rightIndex = rightIndex - 1
//
//        // Array is now reversed
//
//// Example Usage
//        anArray = [9, 7, 10, 55, 273, 46]
//        ArrayReverser.reverseArray(anArray)
//// Now, 'anArray' contains [46, 273, 55, 10, 7, 9]



