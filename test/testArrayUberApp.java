import org.junit.jupiter.api.Test;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

public class testArrayUberApp {

    @Test

    public void testArrayCanCollect10ScoresFromUser(){

        int[] scores = new int[10];

        for (int i = 0; i < scores.length; i++) {

            Scanner scanner = new Scanner(System.in);

            System.out.println("Enter your score: ");

           int input = scanner.nextInt();

            // This is to confirm that the collected input is not null.
            assertNotNull(input);

            // Check that array length is 10 confirm 10 scores are collected.
            assertEquals(10,  scores.length);








        }



    }

}
