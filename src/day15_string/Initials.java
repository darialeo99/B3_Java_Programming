package day15_string;

import java.util.Scanner;

public class Initials {
    public static void main(String[] args) {
        /*
    Ask the user to enter their first name
    Ask the user to enter their last name
    Print the initials as uppercase letters

    james
    bond
    JB
 */


        Scanner key = new Scanner(System.in);
        System.out.println("Please enter your fist name");
        String firstName = key.next().toUpperCase().trim(); // _tom -- > TOM, Tom --- > TOM

        System.out.println("Please enter your lastname: ");
        String lastname = key.next().toUpperCase().trim();

        char first = firstName.charAt(0);
        //String first = "" + firstName.charAt(0); // "" + 'T' -- > "T"
        char last = lastname.charAt(0);

        System.out.println("" + first + last);

    }
}
