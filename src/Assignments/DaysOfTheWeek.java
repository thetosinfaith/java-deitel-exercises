package Assignments;

import java.util.Scanner;

public class DaysOfTheWeek {

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        System.out.println("Enter Today's Day of the Week: ");
        int week = userInput.nextInt();

        System.out.println("Enter Future Day of the Week: ");
        int futuredate = userInput.nextInt();

        int result = (week + futuredate) % 7;

        switch (week) {

            case 0:
                System.out.print("Today is Sunday");
                break;

            case 1:
                System.out.print("Today is Monday");
                break;

            case 2:
                System.out.print("Today is Tuesday");
                break;

            case 3:
                System.out.print("Today is Wednesday");
                break;

            case 4:
                System.out.print("Today is Thursday");
                break;

            case 5:
                System.out.print("Today is Friday");
                break;

            case 6:
                System.out.print("Today is Saturday");
                break;

        }

        switch (result){

            case 0:
                System.out.println(" and the future day is Sunday");
                break;

            case 1:
                System.out.println(" and the future day is Monday");
                break;

            case 2:
                System.out.println(" and the future day is Tuesday");
                break;

            case 3:
                System.out.println(" and the future day is Wednesday");
                break;

            case 4:
                System.out.println(" and the future day is Thursday");
                break;

            case 5:
                System.out.println(" and the future day is Friday");
                break;

            case 6:
                System.out.println(" and the future day is Saturday");
                break;
        }



        }
    }

