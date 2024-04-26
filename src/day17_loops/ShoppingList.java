package day17_loops;

import java.util.Scanner;

public class ShoppingList {

    /*
    repeated actions
           - ask the user to enter item
           - add item to the shopping list
           - ask user if they want to add more items

           at the end show the whole items list
     */
    public static void main(String[] args) {


        Scanner key = new Scanner(System.in);
        String list = "Shopping List:";
        String userAnswer;
        do {
            System.out.println("Please enter the name fo the item: ");
            String userItem = key.nextLine();
            list = list + "\n\t" + userItem;

            System.out.println("Do you want to add more item? ");
            userAnswer = key.nextLine(); // YES, yes, Y, y

        } while (userAnswer.equalsIgnoreCase("yes") || userAnswer.equalsIgnoreCase("y"));
        // If the user types anything besides the "yes", "YES" , "y",  "Y" , "Yes", the loop will stop the execution
        // The loop will continue the ITERATION / cycling as long as user enters "yes", "YES" , "y",  "Y" , "Yes"

        System.out.println(list);

    }
}
