package day24_methods;

public class CreditScore {
    public static void main(String[] args) {

        getCreditScore();
        int score = getCreditScore();
        System.out.println(score); // 800

        System.out.println(getCreditScore() + 50); // 850

        boolean result = isGoodCreditScore(800);
        System.out.println(result);
        System.out.println(isGoodCreditScore(820));
        System.out.println(isGoodCreditScore(720));


    }

    public static int  getCreditScore (){

        return 800;

    }

    // Create a method that accepts credit score and return true if it is higher or equal 800
    // otherwise return false

    public static boolean isGoodCreditScore(int score){
        //boolean result;

        if(score>=800){
            return true;
        }else{
            return false;
        }

    }

}
