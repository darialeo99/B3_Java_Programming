package day24_methods;

public class MyMathClass {

    // Create 4 custom methods that accepts two parameters and calculates ADDITION, SUBTRACTION, MULTIPLICATION, DIVISION

    public static void add (int num1, int num2){

        System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));

    }

    public static void minus (int num1, int num2){
        System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
    }

    public static void multiply (double num1, double num2){  // we can also do variables as double
        System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
    }

    public static void divide (double num1, double num2){
        System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
        // Add exception division by 0 here







    }




    public static void main(String[] args) {
        add(3,5);
        minus(3,5);
        multiply(3,5);
        divide(3,5);
        divide(3,0); // Arithmetic exception by 0

    }
}
