package day12_switch_statements;

public class Diver {
    public static void main(String[] args) {
            /*
    create a class Diver

    You are diving in the ocean. Your oxygen tank has a certain level (number)

    declare and assign a int variable about the oxygen level in the tank and print a message based on the oxygen level:

        Above 90 - Your tank is full
        Above 80 - Still okay
        Above 70 - Don't go too far
        Above 60 - Start to head back
        Above 50 - Be careful now you at at 50%
     */
        // If you want to fo with this order, you can apply the range with your logic
//        if (oxygenLevel > 50 && oxygenLevel <= 60) {
//            System.out.println("Be careful");
//        } else if  (oxygenLevel > 60 && oxygenLevel <= 70) {
//            System.out.println("Start to head back");
//        }



    // you need to be careful with your code logic, going from smaller to bigger number for Oxygen level

        int oxygenLevel = 80;


        if (oxygenLevel >90){
            System.out.println("The tank is full");
        }else if (oxygenLevel > 80){
            System.out.println("You re still okay");

        }else if (oxygenLevel > 70){
            System.out.println("Dont go too far");
        }else if (oxygenLevel > 60){
            System.out.println("Start to head back");
        }else if (oxygenLevel > 50){
            System.out.println("Be careful now you at 50%");
        }else {
            System.out.print("Your level is very dangerous now");
        }
    }
}
