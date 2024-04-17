package day09_a_scanner;

import java.util.Scanner;

public class Order {
    public static void main(String[] args) {
        /*
    - Place an order
    - Ask the user the enter the product name (String, multiple words)
    - Ask the user to enter the price (double)
    - Ask the user to enter the quantity(int)
    - Ask the user to enter their full name (String, multiple word)
    - Print in the following format:
        "$fullName, your order for $quantity $productName has been placed. Your total is $totalCost(price * quantity)."
    Ex:
        Input: "Apples" , 1.5, 5. "Luke"
        Output: Luke, your order for 5 Apples has been places. Your total is 7.5.

 */
        // Object referenceName = object (parameter)
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a product name: ");
        String productName = input.nextLine(); // Green Apple

        System.out.print("Enter the price of " + productName + " $");
        double price = input.nextDouble();

       // How many $productName do you want to buy?
        System.out.print("How many " + productName + " do you want to buy? ");
        int quantity = input.nextInt();

        input.nextLine(); // Handling the ENTER/ RETURN issue

        System.out.print("Enter your full name: ");
        String fullName = input.nextLine();

        // double totalCost = quantity * price;  // just the example

        //"$fullName, your order for $quantity $productName has been placed. Your total is $totalCost(price * quantity)."

        String orderDetails = fullName + ", your order for " + quantity + " " + productName + " has been placed. Your total is $ " + (quantity * price);

        System.out.println(orderDetails);








    }
}
