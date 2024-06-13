package day37_a_abstraction.Car;
// If you have Abstract method in your class, you need to have Abstract Class. If you have inheritance,
// child classes need(forced) to implement abstract methods
public abstract class Car {

//    public void start () {
//        System.out.println("Car is running");
//    }

    // child classes are FORCED to implement abstract methods if there is inheritance
    public abstract void start ();

    // instance method. Child classes are not forced to implement instance methods
//    public void test () {
//
//    }
}
