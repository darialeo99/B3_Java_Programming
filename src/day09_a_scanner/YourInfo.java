package day09_a_scanner;

import java.util.Scanner;

public class YourInfo {
    public static void main(String[] args) {
        /*
    Ask them to enter their favorite book
    Ask the user to enter their age (byte),
    ask them to enter their favorite number (long),
    Print all the values from the inputs
 */

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your favorite book: ");
        String bookName =input.nextLine();

        System.out.print("Enter your age: ");
        byte age = input.nextByte();

        System.out.print("Enter your favorite number" );
        long favoriteNumber = input.nextLong();


        System.out.println("Information:");
        System.out.println("\t" + age);
        System.out.println("\t" + favoriteNumber);
        System.out.println("\t" + bookName);



    }
}
