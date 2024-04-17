package day08_scanner_logical_operators;

public class SignType {
    public static void main(String[] args) {
        /*
     Task:
        Declare and assign a number

        I want to know the sign of the number
            if the number positive
            is the number negative
            is the number 0
 */

        int number = -16;

        boolean isPositive = number > 0;
        boolean isNegative = number < 0;
        boolean isZero = number == 0;

        System.out.println(number + " is Positive " + isPositive);
        System.out.println(number + " is Negative " + isNegative);
        System.out.println(number + " is Zero " + isZero);

    }
}
