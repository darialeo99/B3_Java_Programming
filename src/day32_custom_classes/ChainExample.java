package day32_custom_classes;

public class ChainExample {

    public ChainExample () {

        System.out.println("First");
    }


    public ChainExample (int i) {
        this();
        System.out.println("Second");
    }

    public ChainExample (String str) {
        this(4);
        System.out.println("Third");
    }

    public ChainExample ( double d){
        this();
        System.out.println("Fourth");
    }
}
