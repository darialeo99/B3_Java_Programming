package day15_string;

public class MergeStrings {
    public static void main(String[] args) {
        /*

    two Strings: hard code to have 3 characters each
    merge the Strings together

    ex:
        abc
        xyz

        output: axbycz

 */


        String str1 = "abc";
         //            012
        String str2 = "xyz";
        //             012
        String merged = "";

        //merged = merged + str1.charAt(0) + str2.charAt(0);
        //merged += str1.chatAt(0);
        //merged += str2.chatAt(0);

        merged += "" + str1.charAt(0) + str2.charAt(0); // merged = merged + "" + str1.charAt(0) + str2.charAt(0);
        merged += "" + str1.charAt(1) + str2.charAt(1);
        merged += "" + str1.charAt(2) + str2.charAt(2);

        System.out.println(merged);




    }
}
