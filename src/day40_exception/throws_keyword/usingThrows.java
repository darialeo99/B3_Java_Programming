package day40_exception.throws_keyword;

public class usingThrows {

    public static void main(String[] args) throws InterruptedException {

        Thread.sleep(200); // Compile Exception + possible RunTime Exception

        // If I do not want to handle the COMPILE Exception - I have a chance to AVOID it
        // I can add the exception into method signature


        test(); // I ignored (handled) it in the main method as well that's why it does not complain
                // Since we are also ignoring it by main method signature we are not required to handle COMPILE TIME Exception in here

    }

    public static void test () throws InterruptedException {
        Thread.sleep(200);
    }

    public static void test2 ()  {
        //test();
        //main();
    }

}
