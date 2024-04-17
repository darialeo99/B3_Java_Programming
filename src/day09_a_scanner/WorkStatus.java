package day09_a_scanner;

import java.util.Scanner;

public class WorkStatus {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your first name: ");
        String firstName = input.next();
        System.out.println("Enter your lastname: ");
        String lastName = input.next();

        System.out.print("Are you employed? [true/false]");
        boolean isEmployed = input.nextBoolean();

        System.out.print("Are you student? [true/false]");
        boolean isStudent = input.nextBoolean();

        String personInfo = firstName + " " + lastName + " information: \n\tis employed: " + isEmployed + "\n\tIs a student: " + isStudent;

        System.out.println(personInfo);

        //System.out.println("Your name is: " + firstName);

    }
}
