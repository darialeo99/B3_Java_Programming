package day40_exception.learn_exception;

public class FirstTry {

    public static void main(String[] args) {

        System.out.println("First print out");

        String str = "Loopcamp";
        //            01234567

        try {

            System.out.println(str.charAt(9));

        } catch (Exception e) {
            e.printStackTrace();
            //e.printStackTrace();
            System.out.println(e.getMessage());

            //System.out.println("Exception is caught");


        }


        System.out.println("Last print out");
    }
}
