package day33_a_static;

public class UseSong {
    public static void main(String[] args) {

        Song s1 = new Song("Waka Waka"); // default object

        System.out.println(s1.name);
        System.out.println(s1);

        Song s2 = new Song("Shape of my heart", 3.0);
        System.out.println(s2);

        Song s3 = new Song("Rich Girl", 3.5, "Gwen Stefani", "Pop");

        System.out.println(s3);

    }
}
