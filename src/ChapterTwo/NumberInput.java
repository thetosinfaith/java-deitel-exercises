package ChapterTwo;

import java.util.Scanner;
public class NumberInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please input an integer: ");
        int userNumber = input.nextInt();

        System.out.println("You entered: " + userNumber);

    }

}