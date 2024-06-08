package day36_inheritance.final_examples;

public class FinalExample {

    // instance variables
   // final int z; // if variable is "final" it must have initial value. Either directly assigned, or through constructor
    final int a = 5;
    final int b; // here the reason it does not complain is because it is initialized through constructor


// STATIC VARIABLE
    public static final String PLANET = "Earth";// if variable is "static final" it is also called constant variable

    // You can also initialize "public static final String PLANET" in the static block instead of during on declaration

//    static {
//        PLANET = "Earth";
//    }

    public FinalExample(int b) {
        this.b = b;
    }

    // CONSTANT/ FINAL variables samples

    //Math.PI;
    //Integer.MAX_VALUE;
}
