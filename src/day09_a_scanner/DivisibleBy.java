package day09_a_scanner;

import java.util.Scanner;

public class DivisibleBy {
    public static void main(String[] args) {
        /*
    Ask the user to enter a number. Check if that number is evenly divisible by 2, 3, and 5. Print the boolean values

    Ex:
    Enter a number
    65

    65 is divisible by 2: false
    65 is divisible by 3: false
    65 is divisible by 5: true
 */

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();

        boolean isDivisibleBy2 = num % 2 == 0; // 3 % 2 -----> 1 == 0, number 3 is not divisible. So reminder ---> compltetely disivible
        boolean isDivisibleBy3 = num % 3 == 0; // 7 % 3 -----> 1 == 0
        boolean isDivisibleBy5 = num % 5 == 0; //

        System.out.println(num + "if divisible by 2:" + isDivisibleBy2);
        System.out.println(num + "if divisible by 3:" + isDivisibleBy3);
        System.out.println(num + "if divisible by 5:" + isDivisibleBy5);





    }
}
