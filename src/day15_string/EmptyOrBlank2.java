package day15_string;

public class EmptyOrBlank2 {
    public static void main(String[] args) {

        String str = "new example";
        System.out.println(str.isEmpty()); // It has characters. So --- > false

        str = " ";
        System.out.println(str.isEmpty()); // it still has an empty character. So --- > false

        str = ""; // _, #, G, g, 1
        System.out.println(str.isEmpty()); // IT IS COMPLETELY EMPTY ----> No SINGLE CHARACTER -- > So, --> TRUE


        System.out.println(str.length()); // 0

        // (0 == 0 )
        if (str.length() == 0) {
            System.out.println("No characters");
        }


        str = "";
        System.out.println("Is Empty: " + str.isEmpty());
        System.out.println("Is Blank: " + str.isBlank()); // Possible update in Java -- > Normally it checks for empty space.

        str ="Hello World!"; // here we have characters other than the EMPTY SPACE
        System.out.println(str.isBlank()); // false



        str = " "; // ONLY EMPTY SPACE
        System.out.println(str.isBlank()); // TRUE
        System.out.println(str.isEmpty()); // FALSE

        str = "        ";
        System.out.println(str.isBlank());



    }
}