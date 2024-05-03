package day20_nested_loops;

public class UniqueCharacters {
    public static void main(String[] args) {

        String str = "AABCDFGWOF&#($";
        
        // Find only the unique characters

        int count;

        for (int i = 0; i < str.length(); i++) {

            char eachLetter1 = str.charAt(i); // String eachLetter str.substring(i , i + 1);
            count = 0;

            for (int j = 0; j < str.length() ; j++) {

                char eachLetter2 = str.charAt(j); // String eachLetter str.substring(i , j + 1);

                if (eachLetter1 == eachLetter2){ // eachLetter1.equals(eachLetter2) {
                    count++;
                }



            }

            if (count == 1){
                System.out.print(eachLetter1);
            }
            
        }



    }
}
