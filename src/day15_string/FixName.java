package day15_string;

import java.util.Scanner;

public class FixName {
    public static void main(String[] args) {

        /*

    first name
    last name

    fix to print proper name:
    capital first letter, the rest of the letter lowercase,  no extra space
 */


        Scanner key = new Scanner(System.in);

        System.out.println( "Enter yore name: ");
        String firstName = key.next().trim();
        System.out.println("Enter your lastname: ");
        String lastName = key.next().trim();

        // TOM JerrY --- > Tom Jerry

        String fixedFirstName= ("" + firstName.charAt(0)).toUpperCase() + firstName.substring(1).toLowerCase(); // TOM ----> OM, MICKY ----> ICKY
        String fixedLastName = ("" + lastName.charAt(0)).toUpperCase() + lastName.substring(1).toLowerCase();

        System.out.println(fixedFirstName);
        System.out.println(fixedLastName);












    }
}
