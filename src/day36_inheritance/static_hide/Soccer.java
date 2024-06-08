package day36_inheritance.static_hide;

public class Soccer extends Sports {

    //@Override - static methods do not get Overriden
    public static void cheer () {
        System.out.println("Cheering from the Child Class");
    }
    /*
    Note:
        It looks like we are overriding
        but we are NOT because the method is - static method.

        We are hiding the cheer () method from parent class
     */
}
