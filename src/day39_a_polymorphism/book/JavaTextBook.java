package day39_a_polymorphism.book;

public class JavaTextBook extends Ebook {

    // inst var

    boolean isFun;

    @Override
    public void open() {
        System.out.println("Opening java text book");
    }

    @Override
    public void read() {
        System.out.println("Reading Java text book");

    }

    @Override
    public void dowbload() {
        System.out.println("Downloading java text book");

    }
}
