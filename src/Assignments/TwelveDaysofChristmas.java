package SEPTEMBER_ASSIGNMENT;

import java.util.Scanner;

public class TwelveDaysofChristmas {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Let’s sing the song together. Pick a number from 1 to 12.");
        System.out.println("""
                1 -> First day of Christmas
                2 -> Second day of Christmas
                3 -> Third day of Christmas
                4 -> Fourth day of Christmas
                5 -> Fifth day of Christmas
                6 -> Sixth day of Christmas
                7 -> Seventh day of Christmas
                8 -> Eighth day of Christmas
                9 -> Ninth day of Christmas
                10-> Tenth day of Christmas
                11-> Eleventh day of Christmas
                12-> Twelve day of Christmas
                """);
        System.out.println("Pick a number to see the verse of each lyrics");
        int userInput = input.nextInt();
        switch (userInput){

            case 1:
                System.out.println("""
                        On the first day of Christmas, my true love sent to me
                        A partridge in a pear tree
                        """);
                break;

            case 2:
                System.out.println("""
                        On the second day of Christmas my true love sent to me
                        Two turtle doves, and
                        A partridge in a pear tree
                        """);
                break;

            case 3:
                System.out.println("""
                        On the third day of Christmas my true love sent to me
                        Three french hens
                        Two turtle doves, and
                        A partridge in a pear tree
                        """);
                break;

            case 4:
                System.out.println("""
                        On the fourth day of Christmas my true love sent to me
                        Four calling birds
                        Three french hens
                        Two turtle doves, and
                        A partridge in a pear tree
                        """);
                break;

            case 5:
                System.out.println("""
                        On the fifth day of Christmas my true love sent to me
                        Five golden rings
                        Four calling birds
                        Three french hens
                        Two turtle doves, and
                        A partridge in a pear tree
                        """);
                break;

            case 6:
                System.out.println("""
                        On the sixth day of Christmas my true love sent to me
                        Six geese a-laying
                        Five golden rings
                        Four calling birds
                        Three french hens
                        Two turtle doves, and
                        A partridge in a pear tree
                        """);
                break;

            case 7:
                System.out.println("""
                         On the seventh day of Christmas my true love sent to me
                         Seven swans a-swimming
                         Six geese a-laying
                         Five golden rings
                         Four calling birds
                         Three french hens
                         Two turtle doves, and
                         A partridge in a pear tree
                        """);
                break;

            case 8:
                System.out.println("""
                         On the eighth day of Christmas my true love sent to me
                         Eight maids a-milking
                         Seven swans a-swimming
                         Six geese a-laying
                         Five golden rings
                         Four calling birds
                         Three french hens
                         Two turtle doves, and
                         A partridge in a pear tree
                        """);
                break;

            case 9:
                System.out.println("""
                        On the ninth day of Christmas my true love sent to me
                        Nine ladies dancing
                        Eight maids a-milking
                        Seven swans a-swimming
                        Six geese a-laying
                        Five golden rings
                        Four calling birds
                        Three french hens
                        Two turtle doves, and
                        A partridge in a pear tree
                        """);
                break;

            case 10:
                System.out.println("""
                         On the tenth day of Christmas my true love sent to me
                         Ten lords a-leaping
                         Nine ladies dancing
                         Eight maids a-milking
                         Seven swans a-swimming
                         Six geese a-laying
                         Five golden rings
                         Four calling birds
                         Three french hens
                         Two turtle doves, and
                         A partridge in a pear tree
                        """);
                break;

            case 11:
                System.out.println("""
                        On the eleventh day of Christmas, my true love sent to me
                        Eleven pipers piping
                        Ten lords a-leaping
                        Nine ladies dancing
                        Eight maids a-milking
                        Seven swans a-swimming
                        Six geese a-laying
                        Five golden rings
                        Four calling birds
                        Three French hens
                        Two turtle doves, and
                        A partridge in a pear tree
                        """);
                break;

            case 12:
                System.out.println("""
                        On the twelfth day of Christmas, my true love sent to me
                        Twelve drummers drumming
                        Eleven pipers piping
                        Ten lords a-leaping
                        Nine ladies dancing
                        Eight maids a-milking
                        Seven swans a-swimming
                        Six geese a-laying
                        Five golden rings
                        Four calling birds
                        Three French hens
                        Two turtle doves, and
                        A partridge in a pear tree
                        """);
                break;

            default:
                System.out.println("You're mad!");
                break;
        }


    }


}
