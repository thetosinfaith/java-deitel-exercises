package Exercises;
public class ThinkPad {
    public static void main(String[] args) {

        int[] ages = {12, 13, 65, 5, 45, 23};

        for (int i = 0; i < ages.length; i++) {

            ages[i] = ages[i] * 2;

            System.out.println(ages[i] + "");

        }

    }
}