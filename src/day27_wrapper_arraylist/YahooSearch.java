package day27_wrapper_arraylist;

public class YahooSearch {
    public static void main(String[] args) {

        // About 7,080,000 search results

        String result = "About 7,080,000 search results";
        String [] arr = result.split(" "); // ["About",  "7,080,000" ,  "search",  "results"];

        String resultStr = arr[1].replaceAll(","  , ""); // "7,080,000" -----> "7080000"
        //resultStr = result.replace(",", "");

        long resultNum = Long.parseLong(resultStr);


        // Your task: After searching make sure the number is bigger or equal than 0

        if (resultNum >= 0){
            System.out.println("TEST CASE PASSED - POSITIVE TEST CASE");
        }else{
            System.out.println("TEST CASE FAILED");

        }



        System.out.println("After searching for \"Apartments\" + I see " + resultNum);
        System.out.println("Next year, After searching for \"Apartments\"" + " I will most liekly see " + (resultNum + 1_000_000) + " results");

        //TODO: about 16,820,000,000 results (0.54 seconds)
        // Make sure the tie is between 0 and 2 seconds






    }
}
