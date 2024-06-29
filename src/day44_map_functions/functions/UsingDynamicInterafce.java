package day44_map_functions.functions;

public class UsingDynamicInterafce {

    public static void main(String[] args) {

        DynamicInterface <String> printEachChar = (str) -> {

            for (int i = 0; i < str.length(); i++) {
                System.out.println(str.charAt(i));

            }

        };

        printEachChar.test("loopcamp");

        System.out.println("---------------------------");

        DynamicInterface <Integer> printNumber5Times = (n) -> {

            for (int i = 0; i < 5; i++) {
                System.out.println(n);

            }
        };

        printNumber5Times.test(7);



    }
}
