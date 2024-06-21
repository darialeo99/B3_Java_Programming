package day41_collection.recap;

import java.util.ArrayList;

public class RecapTry {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        list.add("java");
        list.add("api");
        list.add("ci/cd");


        try {
            System.out.println(list.get(1)); // user will give index

            String s = null;
            s = s.toLowerCase();


        } catch (IndexOutOfBoundsException e) {

            System.out.println(e.getMessage());
//            e.printStackTrace();
            System.out.println("IndexOutOfBoundsException");

        } catch (NullPointerException e) {

            System.out.println("No object Found");
            //e.printStackTrace();
            System.out.println(e.getMessage());
        }

        System.out.println(list);

        System.out.println("Done");

         try {
             Thread.sleep(2);
         }catch (InterruptedException | IllegalArgumentException e ) { // compile time exception (sleep)   and runtime (-2) //
             System.out.println("Number is wrong");
         } finally {
             System.out.println("This will always run");
         }

        System.out.println("FINAL");


    }
}
