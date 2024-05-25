package day30_b_custom_classes;

public class App {

    // INSTANCE VARIABLES / DATA MEMBERS
    // These are not in a method. They are directly in the Class level
    // NOTE: if variables are declared in Methods, they are called LOCAL VARIABLES
    // Blueprint is a structure for each object

    String name; // default is null
    double version; // default is 0.0
    boolean isFree; // default is false


    // This method is INSTANCE METHOD - does not have "static" keyword
    // Each obejct will run its own versiob
    public void run (){
        System.out.println(name + " is running");
    }

    public void update (){
        System.out.println(name + " is updating...");
        version += 1.1;
    }


}
