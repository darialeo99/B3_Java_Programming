package day10_if_statements;

public class ifWithoutBrackets {
    public static void main(String[] args) {

        if (4 > 2) {
            System.out.println("Hello");
            System.out.println("Bye");
        }

        if (1 > 2)
            System.out.println("hello2"); // you can do this ONLY if you have ONE statement
        System.out.println("Bye2");

        if (10 % 5 == 0) {
            System.out.println("divisible");
        } else {
            System.out.println("not divisible");
        }

        if (10 % 5 == 0)
            System.out.println("divisible");
        else
            System.out.println("not divisible");
        System.out.println("Testing"); // This does not have anything to do with if else above


        // we can not have just else condition by itself since there is a question else what?
        //else {
        //     System.out.println(:Bye3);
        //}


        if (5 < 2)
            System.out.println("Loopcamp");
        else {
            System.out.println("Loopcamap2");
            System.out.println("Loopcamp3");

        }
    }

}
