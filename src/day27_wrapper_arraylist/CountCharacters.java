package day27_wrapper_arraylist;

/*
Given a string count the # of uppercase letter, lowercase, numbers and other characters
 */

public class CountCharacters {
    public static void main(String[] args) {

        // Wrapper classes are located in java .lang package, so they are automatically imported into java

        String str = "aP3d572&*jd@jdJU";

        int upper = 0;
        int lower = 0;
        int digits = 0;
        int others = 0;

        for (int i = 0; i < str.length(); i++) {

            char each = str.charAt(i);

            // Character is the wrapper class for char that allow us to solve this problem more simple instead of using char(ASCII table) ranges.

            if (Character.isUpperCase(each)){
                upper++;
            }else if (Character.isLowerCase(each)){
                lower++;
            }else if (Character.isDigit(each)){
                digits++;
            }else{
                others++;
            }

        }

        System.out.println("Uppercase letters count: " + upper);
        System.out.println("Lowercase letters count: " + lower);
        System.out.println("Digit letters count: " + digits);
        System.out.println("Other letters count: " + others);


        System.out.println(Integer.MAX_VALUE); //These are not methods. These are constants which we will learn later
        System.out.println(Integer.MIN_VALUE);

        System.out.println(Double.MAX_VALUE);



    }
}
