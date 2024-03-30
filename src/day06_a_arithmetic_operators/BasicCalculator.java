package day06_a_arithmetic_operators;

public class BasicCalculator {
    public static void main(String[] args) {

        double num1 = 7; // the values datatype it's int. Since we assigned it to double variable it was converted automatically into double
        double num2 = 5;

        double addition = num1 + num2;
        double subtraction = num1 - num2;
        double multiplication = num1 * num2;
        double division = num1 / num2;
        double remainer = num1 % num2; // module  ----> 7/5 = whatver is not divisible will  be the remainer. In our case it's 2.


        // TODO:

        System.out.println(num1 + " + " + num2 + " = " + addition);
        System.out.println(num1 + " - " + num2 + " = " + subtraction);
        System.out.println(num1 + " * " + num2 + " = " + multiplication);
        System.out.println(num1 + " / " + num2 + " = " + division);
        System.out.println(num1 + " % " + num2 + " = " + remainer);

        num1 = 13;
        num2 = 5;
        remainer = num1 % num2;
        System.out.println(num1 + " % " + num2 + " = " + remainer);


        int n1 = 7;
        int n2 = 5;
        int result = n1 / n2;
        System.out.println(result); // 1.4 --> 1. It will be 1. there is a data loss since we are printing out the WHOLE number

        System.out.println("------------------------------------------------------------------------");
        System.out.println(3.2 + 1); // 4 or 4.2 -- output is double

        int a = 3;
        double b = 4; // 4.0
        double result2 = a + b;
        System.out.println(a+b); // 7.0

        byte b5 = 3;
        short s = 7;
        System.out.println(b+s);

        byte b2 = 3;
        short s2 = 7;
        short total = (short) (b2 + s2); // by default smaller than int, will become as int after any operation

        byte a1 = 4;
        short a2 = 5;
        double d2 = a1 + a2;


    }
}
