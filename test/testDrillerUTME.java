import Assignments.TestDrillerUTME;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class testDrillerUTME {
    @Test

    public void testCanReturnPriceToBuyer(){

        TestDrillerUTME testDrillerUTME = new TestDrillerUTME();

        int actual = testDrillerUTME.returnPrice(2000);

        assertEquals(2000, actual);




    }
}
