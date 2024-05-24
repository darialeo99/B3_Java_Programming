package day29_arraylist;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class ShoppingList {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList <String> shoppingList = new ArrayList<>();

        // Can you make this a reusable method
        System.out.println(  statusOfShoppingList(shoppingList)  );


        String userAnswer = "";
        do {
            System.out.print ("Enter the item: ");
            shoppingList.add( input.nextLine() );

            System.out.print("Do you want to continue y/n: ");
            userAnswer = input.nextLine(); // yes

        } while (userAnswer.equalsIgnoreCase("yes") || userAnswer.equalsIgnoreCase("y")); // ask as long as user say "Yes", "Yes", "yes, "y", "Y"



        // loop through list
        System.out.println("Shopping list has " + shoppingList.size() + " item: ");
        for ( String eachItem : shoppingList) {
            System.out.println("\t" + eachItem);
        }

        System.out.println(statusOfShoppingList(shoppingList));

        System.out.println("--------------------");

        // Check if shopping list has an item: $item is on list / $item is not on list
        System.out.print("What item do you want to check if it is in the list? ");
        //input.nextLine(); // hat

        itemAvailability(shoppingList, input.nextLine());

        System.out.println("--------------------");

        System.out.print ("Do you want to remove any item? ");
        if (input.nextLine().equalsIgnoreCase("yes") ) {
            System.out.print ("What item do you want to remove: ");
            String itemRemove = input.nextLine();  // user item to remove  --- > "Bread" - "1"/"10"


            // "1"/"10"   -- "Bread"
            if (Character.isDigit( itemRemove.charAt(0) )) {

                //int num = Integer.parseInt(itemRemove); //  "1"/"10" --- > 1, 10
                shoppingList.remove( Integer.parseInt(itemRemove) - 1);

            } else {
                shoppingList.remove(itemRemove);
            }
        }

        System.out.println("Final List: " + shoppingList);


    }

    public static String statusOfShoppingList (ArrayList <String> sl) {

        return sl.isEmpty() ? "Shopping List is empty!" : "You have some items";

    }

    public static void itemAvailability (ArrayList<String> sl, String itemToCheck) {
        System.out.println( sl.contains(itemToCheck) ? itemToCheck + " is on list" : itemToCheck + " is not on list");
    }

}

