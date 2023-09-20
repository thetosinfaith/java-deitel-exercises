package Assignments;

public class Function {
    public static int multiply(int firstNumber, int secondNumber) {
        int value = 0;
        int negative = 1;
        if (secondNumber < 0) {
            for (int count = firstNumber; count >= 1; count--) {
                value = value + secondNumber;
            }
        if (firstNumber < 0 && secondNumber < 0) {
            for (int count = (-secondNumber); count >= 1; count--) {
                value = value + firstNumber;
                negative = -value;
            }return  negative;
        }
            for (int count = secondNumber; count >= 1; count--) {
                value = value + firstNumber;
            }
        }
        return value;

    }
}