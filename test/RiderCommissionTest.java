import Assignments.riderCommission;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RiderCommissionTest {
    @Test

    public  void testCanCalculateRiderCommission(){

riderCommission riderCommission = new riderCommission();

int actual = riderCommission.calculateCommission(40);

assertEquals(11400, actual);
    }
    @Test
    public void testCanCalculateSalary (){

        riderCommission riderCommission = new riderCommission();

        int actual = riderCommission.calculateCommission(56);

        assertEquals(16200, actual );


    }

    @Test
    public void testCanCalculateWage (){

        riderCommission riderCommission = new riderCommission();

        int actual = riderCommission.calculateCommission(62);

        assertEquals(17200, actual );

    }

    @Test
    public void testCanCalculateIncome (){

        riderCommission riderCommission = new riderCommission();

        int actual = riderCommission.calculateCommission(84);

        assertEquals(21800, actual );


    }

    }




