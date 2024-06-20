package day40_exception.catch_order;

public class TryWithInheritance {

    // we go from SMALL to BIG ones.

    public static void main(String[] args) {

        try {

            int [] a = {1,2,3,4,5};
            System.out.println(a[9]); // IndexOutofBoundsException

        } catch(IndexOutOfBoundsException e) {

        } catch (RuntimeException e) {

        } catch (Exception e) {

        }

//        /**
//        * Parent exception class can not be before child exception class
//         * Because the Parent Exception will catch whatever Child would catch as well
//         * So, Child Exception class will never be reached
//         /*

        // All possible references of IndexOutofBoundsException class

        //  IndexOutofBoundsException e = new IndexOutofBoundsException();

        //  RunTimeException e = IndexOutofBoundsException();

        // Exception e = new IndexOutofBoundsException();

    }
}
