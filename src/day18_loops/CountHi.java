package day18_loops;

public class CountHi {
    public static void main(String[] args) {

        String str = "aaahiahiccchhi"; // hi --> 3 times

        //            0123456...
        int count = 0;

        for (int index = 0; index < str.length()-1; index++){

            if (str.charAt(index) == 'h' && str.charAt(index + 1) == 'i'){
                count++;
            }


        }

        System.out.println(count);




    }
}
