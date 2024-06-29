package day24_methods;

public class MyFirstMethod {
    public static void main(String[] args) {
        System.out.println("Hello World1!"); //

        helloWorld(); // I called the helloWorld(); method
        helloWorld();

        System.out.println("Hello World2!");

    }

    // I declared a public static method that returns nothing
    public static void helloWorld (){
        System.out.println("Hello World!");
    }

}
