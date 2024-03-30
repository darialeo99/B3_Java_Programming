package day06_a_arithmetic_operators;

public class CastingExample {
    public static void main(String[] args) {

        int num1 = 40;
        float num2 = num1; // int is smaller than float, IMPLICIT/ AUTOMATIC casting happens / WIDENING casting
        System.out.println(num1);
        System.out.println(num2);

        float num3 = 10.5F;
        short num4 = (short) num3; // short is smaller than float, we need CASTING - EXPLICIT CASTING/ MANUAL CASTING / NARROWING CASTING - DATA LOSS
        System.out.println(num3);
        System.out.println(num4);

        float num5 = 300.77F;
        byte num6 = (byte) num5; // byte is smaller than float, we need CASTING - EXPLICIT/ MANUAL/ NARROWING CASTING - DATA LOSS
        System.out.println(num5);
        System.out.println(num6);

        // I can convert char to int - because each character has a number assigned to it.
        // So, I am actually converting number data type to number datatype
        char letter = 'A';
        int letterInt = letter;
        System.out.println(letter);
        System.out.println(letterInt);

        System.out.println('B'); // will print out just 'B'. NOT a NUMBER of ASCII table
        System.out.println((int)'B'); // to print out the int B value according to ASCII table

        System.out.println('6'); // will print out just '6', NOT a number of ASCII table
        System.out.println((int)'6'); // to print out the  value of 6 char according to ASCII table

    }
}
