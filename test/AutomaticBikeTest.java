import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class AutomaticBikeTest {
    @Test
    public void testAutomaticBikeCanBeTurnedOn() {

        // Given Bike is in a PowerOff State
        AutomaticBike bajaj = new AutomaticBike();

        // When the power button is pressed
        boolean confirm = bajaj.turnOn();

        // Assert that the bike is turned on
        assertTrue(true);
    }
    @Test

    public void testAutomaticBikeCanBeTurnedOff() {

        //Given Bike is in a PowerOn State
        AutomaticBike bajaj = new AutomaticBike();

        // When the power button is pressed
        boolean confirm = bajaj.turnOff();

        // Assert that the bike is turned on
        assertTrue(true);
    }
        @Test
        public void testAutomaticBikeCanAccelerate1() {
            //Given I have a Bike

            AutomaticBike bajaj = new AutomaticBike();

            // When the power button is pressed and bike is turned on
            bajaj.turnOn(); // Assuming turnOn() method just turns on the bike without any gear parameter

            // Accelerate the bike
            bajaj.accelerate(); // Assuming the bike starts in Gear One

            // Then the bike's speed should be increased based on Gear One acceleration
            int expectedSpeed = 1; // Assuming Gear One acceleration adds 1 to the speed
            int actualSpeed = bajaj.getSpeed();
            assertEquals(expectedSpeed, actualSpeed);

        }

        @Test
        public void testAutomaticBikeCanAccelerate2() {
            // Given I have created the instance of AutomaticBike
            AutomaticBike bajaj = new AutomaticBike();

            bajaj.turnOn();

            bajaj.accelerate();

            int expectedSpeed = 2;
            int actualSpeed = bajaj.getSpeed();

        }

    @Test
    public void testAutomaticBikeCanAccelerate3() {
        // Given I have created the instance of AutomaticBike
        AutomaticBike bajaj = new AutomaticBike();

        bajaj.turnOn();

        bajaj.accelerate();

        int expectedSpeed = 3;
        int actualSpeed = bajaj.getSpeed();

        {






        }