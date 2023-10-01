package NokiaMobileAppProject;

import java.util.Scanner;

public class NokiaMobilePhone {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.println("Nokia 3310 App");

        System.out.println("""
                Display Menu
                1 -> PhoneBook
                2 -> Messages
                3 -> Chat
                4 -> Call Register
                5 -> Tones
                6 -> Settings
                7 -> Call Divert
                8 -> Games
                9 -> Calculator
                10 - > Reminders
                11 -> Clock
                12 -> Profiles
                13 -> Sim Services
                """);
        System.out.println("Press a number to get started");
        int Input = userInput.nextInt();

        switch (Input) {

            case 1:

                System.out.println("""
                        1 -> Search
                        2 -> Service Nos
                        3 -> Add Name
                        4 -> Erase
                        5 -> Edit
                        6 -> Assign Tone
                        7 -> Send B' Card
                        8 -> Options
                        9 -> Speed Dials
                        10 -> Voice Tags
                        """);
                System.out.println("pick number 1: ");
                Input = userInput.nextInt();
                switch (Input) {
                    case 1:
                        System.out.println("""
                                Search
                                """);
                        break;
                    case 8:
                        System.out.println("""
                                1 -> Type of view
                                2 -> Memory status
                                """);
                        break;
                }
                break;
            case 2:

                System.out.println("""
                        1 -> Write Messages
                        2 -> Inbox
                        3 -> Outbox
                        4 -> Picture messages
                        5 -> Templates
                        6 -> Smileys
                        7 -> Message Settings
                        """);
                System.out.println("Pick number 7");
                Input = userInput.nextInt();

                switch (Input) {
                    case 7:
                        System.out.println("""
                                1 -> Set
                                2 -> Common
                                """);
                        System.out.println("Pick an option");
                        Input = userInput.nextInt();

                        switch (Input) {
                            case 1:
                                System.out.println("""
                                        1 -> Message centre number
                                        2 -> Message sent as
                                        3 -> Message validity
                                            """);
                                break;

                            case 2:
                                System.out.println("""
                                        1 -> Delivery reports
                                        2 -> Reply via same centre
                                        3 -> Character support
                                        """);
                                break;
                        }
                        break;
                    case 3:
                        System.out.println("""
                                1 -> Chat
                                """);
                        System.out.println("Pick an option");
                        Input = userInput.nextInt();
                        break;

                    case 4:
                        System.out.println("""
                                1 -> Missed Calls
                                2 -> Received Calls
                                3 -> Dialled Numbers
                                4 -> Erase recent call lists
                                5 -> Show call duration
                                6 -> Show call cost
                                7 -> Call cost setting
                                8 -> Prepaid credit
                                """);
                        System.out.println("Use number 5 to check call duration");
                        Input = userInput.nextInt();
                        switch (Input) {

                            case 5:
                                System.out.println("""
                                        1 -> Last call duration 
                                        2 -> All calls duration
                                        3 -> Received calls duration
                                        4 -> Dialled calls duration
                                        5 -> Clear timers
                                        """);
                                System.out.println("Pick an option");
                                Input = userInput.nextInt();
                                break;

                            case 6:
                                System.out.println("""
                                        1 -> Last call cost
                                        2 -> All calls cost
                                        3 -> Clear counters
                                        """);
                                System.out.println("Pick an optionh");
                                Input = userInput.nextInt();
                                break;

                            case 7:
                                System.out.println("""
                                        1 -> Call cost limit
                                        2 -> Show costs in
                                        """);
                                Input = userInput.nextInt();
                                break;
                        }

                    case 5:
                        System.out.println("""
                                1 -> Ringing Tone
                                2 -> Ringing Volume
                                3 -> Incoming Call alert
                                4 -> Composer
                                5 -> Message alert tone
                                6 -> Keypad tones
                                7 -> Warning and game tones
                                8 -> Vibrating alert
                                9 -> Screen saver
                                """);
                        System.out.println("Press an option");
                        Input = userInput.nextInt();
                        break;

                }

            case 6:
                System.out.println("""
                        1 -> Call setting
                        2 -> Phone setting
                        3 -> Security setting
                        4 -> Restore factory setting
                        """);
                System.out.println("Pick an option to continue");
                Input = userInput.nextInt();
                switch (Input) {

                    case 1:
                        System.out.println("""
                                1 -> Automatic redial
                                2 -> Speed dialling
                                3 -> Call waiting options
                                4 -> Phone line in use
                                5 -> Automatic answer
                                """);
                        System.out.println("Pick an option to continue");
                        Input = userInput.nextInt();
                        switch (Input) {
                            case 2:
                                System.out.println("""
                                        1 -> Language
                                        2 -> Cell info display
                                        3 -> Welcome note 
                                        4 -> Network selection
                                        5 -> Lights
                                        6 -> Confirm SIM service actions
                                        """);
                                System.out.println("Pick an option to continue");
                                Input = userInput.nextInt();
                                break;

                            case 3:
                                System.out.println("""
                                        1 -> PIN Code request
                                        2 -> Call barring service
                                        3 -> Fixed dialling
                                        4 -> Closed user group
                                        5 -> Phone security
                                        6 -> Change access codes
                                        """);
                                System.out.println("Pick an option to continue");
                                Input = userInput.nextInt();
                                break;

                        }

                    case 11:
                        System.out.println("""
                                1 -> Alarm Clock
                                2 -> Clock Setting
                                3 -> Date setting
                                4 -> Stopwatch
                                5 -> Countdown timer
                                6 -> Auto update of date and time
                                """);
                        System.out.println("Enter a number to get started");
                        Input = userInput.nextInt();
                        break;

                    default:
                        System.out.println("Wrong input! Try again");
                }


        }


    }

}