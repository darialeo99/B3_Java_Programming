package day40_exception.learn_exception;

public class Forth {

    public static void main(String[] args) {

        try {

            System.out.println("Start");
            Thread.sleep(-200);  // IllegalArgumentException
            System.out.println("End"); // will not print this, since once the exception is called on line 10, the code jumps into line 14


        }catch (Exception e) {
           // e.printStackTrace();
            System.out.println(e.getMessage());// to get specific message what kind of exclusion was it
        }

        System.out.println("END-2"); //

    }
}
