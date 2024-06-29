package day37_a_abstraction.book;

public class Book implements Create { // Book is a CONCRETE CLASS

    @Override
    public void read() {
        System.out.println("Reading the book");

    }

    @Override
    public void write() {
        System.out.println("Writing the book");

    }
}
