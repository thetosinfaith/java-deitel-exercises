//Exercise 2.5

package DeitelJavaProgrammingBook.ChapterTwo;

import java.util.Scanner;
public class IntegerProductOfThree {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int x  = input.nextInt();

        System.out.print("Enter another number: ");
        int y = input.nextInt();

        System.out.print("Enter the third number: ");
        int z = input.nextInt();

        int result = x * y *z;

        System.out.printf("Product is " + result);



    }
}
