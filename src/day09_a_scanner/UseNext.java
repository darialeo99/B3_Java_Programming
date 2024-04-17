package day09_a_scanner;

import java.util.Scanner;

public class UseNext {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("What is today");
        String day = input.nextLine();

        System.out.println("Enter your first name");
        String firstName = input.next();

        System.out.println("Enter your last name: ");
        String lastName = input.next();

        input.nextLine(); // this nextLine(); is used to capture the ENTER/RETURN from previous Scanner method

        System.out.println("Enter your address: ");
        String address = input.nextLine();


        System.out.println("Today: " + day);
        System.out.println("First Name: " + firstName);
        System.out.println("Last Name: " + lastName);
        System.out.println("Address : " + address);
    }
}
