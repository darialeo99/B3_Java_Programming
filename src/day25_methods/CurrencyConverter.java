package day25_methods;
/*
create a method that will accept a currency type(String) and a currency amount (double)[as dollars] and convert the currency from dollars to a different type

    Use the following information to convert from given dollars to the desired currency type

    1 dollar = 0.91 euro
    1 dollar = 121.03 yen
    1 dollar = 14.85 lira
    1 dollar = 1,217.52 won
    1 dollar = 181.45 rupee

    Note: Don't worry about decimal formats, focus on method

    Ex:
        Input:
            euro, 100

        Output:
            91

    Ex:
        Input:
            yen, 50

        Output:
            6051.5
 */
public class CurrencyConverter {
    public static void main(String[] args) {

        System.out.println(convert("Lira", 100));
        // convert(100, "euro");  this is not valid because order of arguments have to match the order of the parameters


    }

    public static double convert (String currency, double amount){

        double result = 0;
        switch (currency.toLowerCase()){ // everything will be in lower case no matter what user gives me in main method line 32
            case "euro":
                result = amount * 0.92;
                break;
            case "yen":
                result = amount * 154.37;
                break;
            case "lira":
                result  = amount * 32.17;
                break;
            case "won":
                result = amount * 1_353.43;
                break;
            case "rupe":
                result = amount * 83.40;
                break;
            default:
                System.out.println("The is no matching currency");
        }




        return result;
    }
}
