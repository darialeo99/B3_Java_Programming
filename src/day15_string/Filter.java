package day15_string;

import java.util.Scanner;

public class Filter {
    public static void main(String[] args) {
        /*
    ask the user to enter a message
    clean the message for empty spaces in the beginning and end
    check the message for bad phrases:

        java is bad
        quit
        have fun
        crying

    if there is a bad phrase in the message print:

        message failed to send

    otherwise print:

    $message sent
 */

        Scanner input = new Scanner(System.in);

        System.out.print("Please enter a message: ");
        String userMessage = input.nextLine().trim().toLowerCase(); // or I can just write directly "trim" here
        // we can combine multiple methods as long as they all return a string

        //userMessage = userMessage.trim(); // I can do this as well
        //String originaMessage = userMassage;
        // userMessage = userMessage.toLowerCase();

        System.out.println("You entered: " + userMessage);

        boolean hasBadWords = userMessage.contains("java is bad") || userMessage.contains("quit") || userMessage.contains("have fun") || userMessage.contains("crying");

        if (hasBadWords){
            System.out.println("message failed to send");
        }else{
            System.out.println(userMessage + " was sent");
        }

    }
}
