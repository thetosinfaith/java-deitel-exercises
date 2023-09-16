import Assignments.riderCommission;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class testRiderPayment {
    @Test

    public  void testCanCalculateRiderCommission(){

riderCommission riderCommission = new riderCommission();

int actual = riderCommission.calculateCommission(40);

assertEquals(11400, actual);
    }
}
