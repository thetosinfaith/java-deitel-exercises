import Assignments.TestDrillerUTME;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

        public class testDrillerUTME {
            @Test

            public void testCanReturnPriceToBuyer() {

                TestDrillerUTME testDrillerUTME = new TestDrillerUTME();

                int actual = testDrillerUTME.returnPrice(2000);

                assertEquals(2000, actual);

            }

            @Test

            public void testCanReturnPrice() {

                TestDrillerUTME testDrillerUTME = new TestDrillerUTME();

                int actual = testDrillerUTME.returnPrice(1800);

                assertEquals(1800, actual);

            }

            @Test
            public void testReturnPriceToBuyer() {

                TestDrillerUTME testDrillerUTME = new TestDrillerUTME();

                int actual = testDrillerUTME.returnPrice(1600);

                assertEquals(1600, actual);

            }

            @Test
            public void PriceToBuyer() {

                TestDrillerUTME testDrillerUTME = new TestDrillerUTME();

                int actual = testDrillerUTME.returnPrice(1500);

                assertEquals(1500, actual);

            }

            @Test
            public void testReturn() {

                TestDrillerUTME testDrillerUTME = new TestDrillerUTME();

                int actual = testDrillerUTME.returnPrice(1300);

                assertEquals(1300, actual);

            }

            @Test
            public void testPriceToBuyer() {

                TestDrillerUTME testDrillerUTME = new TestDrillerUTME();

                int actual = testDrillerUTME.returnPrice(1200);

                assertEquals(1200, actual);

            }

            @Test
            public void testPriceReturn() {

                TestDrillerUTME testDrillerUTME = new TestDrillerUTME();

                int actual = testDrillerUTME.returnPrice(1100);

                assertEquals(1100, actual);

            }

            @Test
            public void testReturnPrice() {

                TestDrillerUTME testDrillerUTME = new TestDrillerUTME();

                int actual = testDrillerUTME.returnPrice(1000);

                assertEquals(1000, actual);

            }

        }
