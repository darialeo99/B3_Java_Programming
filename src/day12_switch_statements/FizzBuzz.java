package day12_switch_statements;

import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {

        Scanner key = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = key.nextInt();  //15


        if (num % 3 == 0) {
            System.out.println("Fizz");
        } else if ( num % 5 == 0) {
            System.out.println("Buzz");
        } else if (num % 3 == 0 && num % 5 == 0) {
            System.out.println("FzzBuzz");
        }


// Option 1

        if (num % 3 == 0 && num % 5 != 0) {
            System.out.println("Fizz");
        } else if ( num % 5 == 0 && num % 3 != 0) {
            System.out.println("Buzz");
        } else if (num % 3 == 0 && num % 5 == 0) {
            System.out.println("FzzBuzz");
        }


// Option 2

        if (num % 3 == 0 && num % 5 == 0) {
            System.out.println("FizzBuzz");
        } else if ( num % 5 == 0 ) {
            System.out.println("Buzz");
        } else if (num % 3 == 0 ) {
            System.out.println("Fzz");
        }

    }

}
