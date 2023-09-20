package Assignments;

public class TestDrillerUTME {

    public int returnPrice(int perCopy) {

        int testDrillerUTME = 0;

        if (perCopy >= 1 && perCopy <= 4) {
            testDrillerUTME = 2000;

        } else if (perCopy >= 5 && perCopy <= 9) {
            testDrillerUTME = 1800;

        } else if (perCopy >= 10 && perCopy <= 29) {
            testDrillerUTME = 1800;

            } else if (perCopy >= 30 && perCopy <= 49) {
                testDrillerUTME = 1500;

            } else if (perCopy >= 50 && perCopy <= 99) {
                testDrillerUTME = 1300;

            } else if (perCopy >= 100 && perCopy <= 199) {
                testDrillerUTME = 1200;

            } else if (perCopy >= 200 && perCopy <= 499) {
                testDrillerUTME = 1100;

            } else if (perCopy >= 500) {
                testDrillerUTME = 1000;
        }
            return testDrillerUTME;
        }
    }
