package day09_a_scanner;

import java.util.Scanner;

public class FirstScanner {
    public static void main(String[] args) {

        //Scanner input; // Scanner Class, Scanner is a class as well

        //String name = "hello";  // String class
        //String name2 = new String("hello");

        // #1 - Scanner Object declaration / instantiation
        // Scanner input; ---> input is the object reference name
        Scanner input = new Scanner (System.in);

        System.out.println("Please, enter a number: ");

        //# 2 - We get the value from console
        int userNumber = input.nextInt(); // returns input as int ---> Therefore, I can assign it into int variable
        System.out.println("You entered: " + userNumber);



    }
}
