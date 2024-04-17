package day09_a_scanner;

import java.sql.SQLOutput;
import java.util.Scanner;

public class AddNumbers {
    public static void main(String[] args) {
            /*
        create Scanner object
        ask the user to enter 3 numbers
        find and print the sum of the numbers
     */
        Scanner key = new Scanner (System.in); // Declared Scanner Reference and assigned a Scanner object to it
        System.out.println("Please, enter 3 numbers and hit enter after each.");
        //System.out.println("\nNumber 1: ");

        // Ask the user to enter 3 numbers
        int num1 = key.nextInt(); //12
        int num2 = key.nextInt(); //23
        int num3 = key.nextInt(); //34

        System.out.println("-------------");
        //
        int total = num1 + num2 + num3;
        //System.out.println("The num of the number: " + (num1 + num2 + num3));
        System.out.println("The total of the numbersL " + total);

        // This is just to show the benefit of variable reusability
        int afterDivision = total/2;
        System.out.println("After division by 2: " + afterDivision);

        System.out.println("After adding 2: " + (afterDivision + 2));


    }
}
