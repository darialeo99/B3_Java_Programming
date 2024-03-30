package day04_variables;

public class Fruits {
    public static void main(String[] args) {

        int apples = 80;
        int grapes = 100;
        int bananas = 150;

        System.out.println("This is how many apples we have:" + 50 ); // the value 70 is HARDCODED
        System.out.println("This is how many apples we have:" + apples); // the value of apple is DYNAMICALLY used
        System.out.println("Grapes:" +     grapes);
        System.out.println("Bananas:" + bananas);

        System.out.println();

        System.out.println("Sold out some of apples");
        apples = 30; // reassigned container called apple to hold 30
        System.out.println("Apples after selling: " +apples);

        System.out.println();

        int price = 15;
        System.out.println("The price of my 30 apples is $15"); // IT IS HARDCODED
        System.out.println("The price of my " + apples + " apples is $" + price);





        System.out.println();






        System.out.println(50 + 50); // This is NOT CONCATENATION
        // NOTE: Anything after FIRST String is CONCATENATION
        System.out.println("50" + 50);
        System.out.println(10 + 10 + "10" + 10); //201010

    }
}
