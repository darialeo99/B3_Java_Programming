package day31_custom_classes;

public class ThisKeyword {

    // instance variable
    int a = 100;


    //                  local variable
    // Java always prioritizes local variables over instance variables
    public ThisKeyword (int a) {
        a = a; // a 300 = a 300, this a related to LOCAL only NOT the one ABOVE

        // how can I make a difference between LOCAL and INSTANCE variable if they have the SAME NAMES?
        System.out.println(a); // this is LOCAL variable ---> a
        System.out.println(this.a); // this is INSTANCE variable --> a
        this.a = 400;




    }
}
