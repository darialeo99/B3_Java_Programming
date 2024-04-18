package day13_string;

public class UpperAndLower {
    public static void main(String[] args) {

        String str = "sNOw";

        System.out.println(str.toUpperCase());
        System.out.println(str);

        str = str.toUpperCase(); // I reassigned str to String, so it is a different value. We created a completely different string, we did not change the old one.
        // The string is immutable. So we made a copy of old String and created a new String
        System.out.println(str);
        System.out.println(str);
        System.out.println(str);
        System.out.println(str);
        System.out.println(str);

        System.out.println("____________");
        System.out.println(str.toLowerCase());
        str = str.toLowerCase();
        System.out.println(str);
        System.out.println(str);
        System.out.println(str);
        System.out.println(str);
        System.out.println(str);
        System.out.println(str);

        String word1 = "Loo";
        String word2 =word1 + "camp".toUpperCase();
        System.out.println(word1.toUpperCase() + word1.toLowerCase()); //LOOloocamp

        System.out.println(word1 + word2); // Loop + Loopcamp

    }
}
