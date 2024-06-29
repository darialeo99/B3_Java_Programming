package day18_loops;

public class PrintEachChar {
    public static void main(String[] args) {

        String str = "loopcamp";  // the length of the word is 8, so we need to do str.length -1 since we do not have the 8th character, we have only from 0-7
        //            01234567

        System.out.println(str.charAt(0));
        System.out.println(str.charAt(1));
        System.out.println(str.charAt(2));
        System.out.println(str.charAt(3));


        System.out.println("This is with the loop");

        for (int i = 0; i <= str.length() - 1 ; i++) {  // or i < str.length()
                                                        // [7 <=8 -1] --- [7 < 8]
            //System.out.println(str.indexOf("x")); we will get -1 error since we do not have "x" in the loopcamp
            System.out.println(str.charAt(i));

        }

        // i < = str.length() - 1 ---> 7 < = 8 - 1
        // i < str.length()  ----> 7 < 8





    }
}
