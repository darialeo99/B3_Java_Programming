package day25_methods;

import my_utilities.StringUtil1;

/*
    Fix Format

    create a method will accept a String and return a String in proper format. Proper format is:
    First character starting as uppercase and the rest as lowercase

    Ex:
    Input:
        jamES

    Output:
        James

 */
public class FixFormat {
    public static void main(String[] args) {

        String str = "MIcKy";
         // I called fixFormat() method which is in the same class

        System.out.println(StringUtil1.FixFormat("loopCAMP"));


    }

    public static String FixFormat (String str){

        String result = "";

        //result = (str.charAt(0) + "").toUpperCase() + str.substring(1).toLowerCase();  //with CharAt() method
        result = str.substring(0,1).toUpperCase() + str.substring(1).toLowerCase();  // substring method

        return result;

    }

}
