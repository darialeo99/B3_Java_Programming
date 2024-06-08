package day36_inheritance.static_hide;

public class B extends A {

    @Override// can be overriden since instance method
    public void instanceMethod () {
        System.out.println("Instance method from Child class");
        staticMethod();


    }

    //@Override - static can not be overriden
    public static void staticMethod () {
        System.out.println("Static method from Child class");
    }

}
