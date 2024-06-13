package day37_a_abstraction.book;

public interface Create {

    // if something is final, it has to be given value
    // variables in interface are "static final" - constants

    public static final String NAME = "Test"; // public static final String NAME = "Test";


    // method (public abstract)
    void read(); // abstract method -- public abstract void read ();

    void write(); // abstract method --- any method made in the interface with no access modifiers is public abstract


}
