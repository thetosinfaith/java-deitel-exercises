import Assignments.ArrayOperations;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArrayOperationsTest {
    @Test
    public void testCorrectlyFindLargestElementInArray(){

        int[] largestElementInArray = {9, 7,10, 55, 273, 46};

        int largest = ArrayOperations.findElementFunction(largestElementInArray);

        assertEquals(273, largest);



    }
}
