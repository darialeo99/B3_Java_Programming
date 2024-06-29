package day19_nested_loops;

public class Month {
    public static void main(String[] args) {

        /*
        Go through a whole month, by looping through each week and each day
         */


        for (int Week = 1; Week <= 4 ; Week++) {

            System.out.println("Week : " + Week );

            for (int day = 1 ; day <=7 ; day++) {
                System.out.println("\tDay: " + day);

            }

        }



    }
}
