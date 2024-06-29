package day40_exception.learn_exception;

public class SecondTryTwo {

    public static void main(String[] args) {


        try {

            String s = null;

            // s = "loop";
            System.out.println(s.length());

            int[] a = {1, 2, 3, 4, 5};
            System.out.println(a[0]);


        } catch (RuntimeException e) {

            System.out.println("Either Null pointer Exception or Array Index out Of Bound Exception is caught");
        }

        System.out.println("Done");


    }
}

