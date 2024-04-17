package day11_if_statements;

import java.util.Scanner;

public class Biggest {
    public static void main(String[] args) {
        /*

    declare and assign 3 int variables
    between the 3 numbers find the print the biggest one

 */
        Scanner input = new Scanner (System.in);
        System.out.println("Enter 3 numbers: ");
        System.out.print("\tnum 1: ");
        int num1 = input.nextInt();

        System.out.print("\tnum2: ");
        int num2 = input.nextInt();

        System.out.print("\tnum 3: ");
        int num3 = input.nextInt();

        System.out.println("The numbers you entered: " + num1 + ", " + num2 + ", " + num3);

        if (num1 >= num2 && num1 >= num3){
            System.out.println(num1 + " is the biggest!");
        } else if (num2 > num1 && num2 > num3){
            System.out.println(num2 + " is the biggest!");

        }else if (num3 > num1 && num3 > num2){
            System.out.println(num3 + " is the biggest!");
        } else {
            System.out.println("All the same");
        }
        //System.out.println("_______________________________");

        //System.out.println(Math.max(num1, num3));
    }
}
