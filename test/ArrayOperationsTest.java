import Assignments.ArrayOperations;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ArrayOperationsTest {
    @Test
    public void testCorrectlyFindLargestElementInArray(){

        int[] largestElementInArray = {9, 7,10, 55, 273, 46};

        int largest = ArrayOperations.findElementFunction(largestElementInArray);

        assertEquals(273, largest);
    }
   ; @Test
        public void testCorrectlyReversesAnArray(){

            int[] reverseArray = {9, 7,10, 55, 273, 46};

            ArrayOperations.reverseElementFunction(reverseArray);

            int[] expectedArrayReverse = {46, 273, 55, 10, 7, 9};

            assertArrayEquals(expectedArrayReverse, reverseArray);
    }
    @Test
    public void testElementExistInAnArray(){

       int [] array = {9, 7,10, 55, 273, 46};

       int pickOut = 55;

       boolean confirm = doesThisArrayExist(array, pickOut);

       assertTrue(confirm);

    }


    @Test
    public void testFunctionPrintsElementsAtOddPositionsCorrectly(){

    }

    @Test
    public void testReturnElementsOnEvenPositions(){

    }

    @Test
    public void testThatFunctionCalculatesTheRunningTotalCorrectly(){


    }

    @Test

    public void testThatFunctionCorrectlyIdentifiesPalindromes(){

    }

    @Test
    public void testCasesForAllThreeLoopScenariosToComputeTheSumOfNumbersInTheArray(){

    }

    @Test

    public void testThatFunctionCorrectlyConcatenatesTwoArays() {

    }

    @Test
    public void testThatFunctionCombinesTwoArraysAlternatelyAsExpected(){

}


@Test
    public void testThatConvertNumberToListOfDigits(){


    }

}
