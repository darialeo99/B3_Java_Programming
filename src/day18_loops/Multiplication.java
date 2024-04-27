package day18_loops;

import java.util.Scanner;

public class Multiplication {
    public static void main(String[] args) {

/*

    Task:
        declare and assign a number

        print all the multiplication results for 1 through 10

        Ex:
            4

            4 x 1 = 4
            4 x 2 = 8
            ..
            4 x 10 = 40

 */

        Scanner key = new Scanner(System.in);
        System.out.println("What number you want to see the multiplication table for? ");
        int num = key.nextInt();
        //int num = 4; // hardcoded value

        System.out.println(num + " x " + 1 + " = " + num * 1);

        for (int i = 1; i <= 10 ; i++) {

            System.out.println(num + " x " + i + " = " + num * i);

        }


    }
}
