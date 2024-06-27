package day43_a_map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Store {

    public static void main(String[] args) {

        Map<String, Double> store = new HashMap<String, Double>();
        store.put("Water", 1.9); // (id, itemName)
        store.put("Coffee", 2.5);
        store.put("Apple", 0.99);
        store.put("Bread", 2.25);
        store.put("Milk", 3.89);

        /* Store Inventory
                Item: $itemName for $price
                ...

         */

        // Option 1

        System.out.println("Store Inventory");
        for (String eachItem : store.keySet() ) { // We used .keySet() method to get all the KEYS and looped through them to get each KEY
            System.out.println("\tItem: " + eachItem + " for $" + store.get(eachItem)); // In print statement, we used each KEY that we are getting each cycle and getting linked VALUE to that key

        }

        System.out.println("--------------");

        // Option 2

        for (Map.Entry <String, Double> eachPair : store.entrySet() ) {
            System.out.println("\tItem: " + eachPair.getKey() + " for $" + eachPair.getValue());

        }

        System.out.println("--------------");

        System.out.println(store.values()); // this will return all the values as Collection


        System.out.println("--------------");

        System.out.println("What item do you want?");
        Scanner input = new Scanner(System.in);
        String userItem = input.nextLine();

        System.out.println( store.containsKey(userItem) ? userItem + " is in stock for $" + store.get(userItem) : userItem + " is not available in stock");



    }
}
