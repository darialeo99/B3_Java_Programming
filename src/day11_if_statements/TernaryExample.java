package day11_if_statements;

public class TernaryExample {
    public static void main(String[] args) {
        // Approach 1 - with if-else
        int a = 70;
        String evenOrOdd;

        if (a % 2 == 0){
            evenOrOdd = "Even";

        }else{
            evenOrOdd = "Odd";
        }
        System.out.println("The number is " +evenOrOdd);

        // Approach 2- with ternary

        evenOrOdd = (a % 2 == 0) ? "Even" : "Odd"; // true : false
        System.out.println("The number is " +evenOrOdd);

        System.out.println("__________________________________");

        int num = -4;
        String posOrNeg;
        if (num < 0){
            posOrNeg = "Negative";
        }else{
            posOrNeg = "Positive";

        }

        System.out.println(posOrNeg);


        posOrNeg = (num < 0) ? "Negative" : "Positive";
        System.out.println(posOrNeg);

        posOrNeg = (num > 0) ? "Positive" : "Negative";
        System.out.println(posOrNeg);


        System.out.println("__________________________________");

        int time = 12;
        double price;

        if (time >= 10 && time <=15){
            price = 7.99;

        }else {
            price = 10.99;
        }

        price = (time >= 10 && time <= 15) ? 7.99 : 10.99; // true and false have to be the same datatype as the datatype of the resultVariableName (price in our case)
        System.out.println("Price is " + price);

    }
}
