package day10_if_statements;

public class ifElseExample {
    public static void main(String[] args) {


//        int score = 75;
//        if (score >= 75){
//            System.out.println("Passing the exam!");
//        }
//
//        if (score < 75){
//            System.out.println("Failing the exam");
//        }
//


        int score = 70;

        if (score >= 75) {
            System.out.println("Passing");
        }else{
            System.out.println("Failing");
        }

        // if score is > 90 --- print exelent else keep working
        // what happens is score is

        if (score > 90){ //70
            System.out.println("Excellent");
        }else{
            System.out.println("Keep working");
        }

        int year = 2020;
        boolean isLockDown = year == 2020 || year == 2021;
        if(isLockDown){
            System.out.println("Stay at home");//!isLockDown will convert it to true
        }else{
            System.out.println("Go outside");
        }



    }



}