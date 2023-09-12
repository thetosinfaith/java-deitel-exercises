package Basic_Exercises;

import java.util.Scanner;
public class Questionnaire {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("What's your first name?");
            String name = scanner.nextLine();

            System.out.println("What's your second name?");
            String secondName = scanner.nextLine();

            System.out.println("What's is your surname?");
            String surname = scanner.nextLine();

        System.out.println(surname);

        }
    }

