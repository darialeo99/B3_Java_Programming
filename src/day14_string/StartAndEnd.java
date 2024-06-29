package day14_string;

public class StartAndEnd {
    public static void main(String[] args) {

        String str = "Loopcamp";

        System.out.println(str.startsWith("Loop"));
        System.out.println(str.startsWith("loop"));

        System.out.println(str.startsWith("Loopcamp"));
        System.out.println(str.startsWith("Loopcamp!"));

        String str2 = "Loop";
        System.out.println(str.startsWith(str2)); // does the str start with tr2 which is Loop
        System.out.println(str.startsWith(" Loop")); // false
        System.out.println(   "Loop");
        System.out.println(str.startsWith(    "Loop"));




        String sentence = "today it was a Java day";
        System.out.println(sentence.startsWith("today it was aJava day"));


        System.out.println(sentence.endsWith(" Java "));
        System.out.println(sentence.endsWith("y"));


        System.out.println(sentence.startsWith( "today it was a Java day"));
        System.out.println(sentence.endsWith( "today it was a Java day"));

        boolean result1 = str.startsWith("Loop");
        boolean result2 = str.endsWith("camp");



    }
}
