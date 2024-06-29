package day15_string;

public class IndexOfMethod {
    public static void main(String[] args) {
        String s = "penpen";
        //          012345

        //how can you get the last character
        //System.out.println(s.charAt(s.length() - 1));

        System.out.println(s.indexOf("p"));
        //System.out.println(s.indexOf('p'));
        System.out.println(s.indexOf("pe"));

        System.out.println("-----------------");

        System.out.println(s.indexOf("e"));
        System.out.println(s.indexOf('e'));
        System.out.println(s.indexOf("en"));

        System.out.println("-------------------");

        System.out.println(s.indexOf("n"));
        System.out.println(s.indexOf('n'));
        System.out.println(s.indexOf("pen"));

        System.out.println("-------------------");
        System.out.println(s.indexOf('x')); // -1 ---- will be the output and it means you do not have it in the string
        System.out.println(s.indexOf("x"));
        System.out.println(s.indexOf("PEN")); // -1 ---- will be the output and it means you do not have it in the string

        System.out.println("----------------");
        System.out.println(s.indexOf('p', 4)); // -1
        System.out.println(s.indexOf("pe", 1)); //3


        System.out.println(s.indexOf("pe", 10)); // this will not give EXEPTION it will just say that there is no matching and display -1
        System.out.println(s.indexOf("pn"));







    }
}
