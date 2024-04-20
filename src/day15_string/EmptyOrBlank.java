package day15_string;

public class EmptyOrBlank {
    public static void main(String[] args) {

        String str = "new example";
        System.out.println(str.isEmpty()); // It has characters. So ----> false

        str = " "; // it does have 1 empty space --- so we have 1 character (even "SPACE" in Java is a character)
        System.out.println(str.isEmpty()); // it still has an empty character0. So ---> false

        str =""; // 0 characters the container is empty
        System.out.println(str.isEmpty()); // IT IS COMPLETELY EMPTY ----> NOT EVEN a single character ---> So, ---> TRUE


        System.out.println(str.length());

        // (0 == 0)
        if(str.length() == 0){
            System.out.println("No characters");
        }


        // str = "";
       // System.out.println(str.isBlank());

        str = "Hello Words!"; // here we have characters other than EMPTY SPACE
        System.out.println(str.isBlank());

        str = " "; // ONLY EMPTY SPACE
        System.out.println(str.isBlank());

        str = "            ";
        System.out.println(str.isBlank());

        //isBlank checks is it has empty characters and returns TRUE if it does have empty space


    }
}
