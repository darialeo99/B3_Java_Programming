package day05_variables;

public class RecapVariables {
    public static void main(String[] args) {
         // Declare variables

        byte numberOfCoffeeCups;
        double totalPriceOfCoffee;
        int totalNumberOfStudentsInClass;

        //We can not use the variables because they do not have a VALUE yet
//
//        System.out.println(numberOfCoffeeCups);
//        System.out.println(totalPriceOfCoffee);
//        System.out.println(totalNumberOfStudentsInClass);

        // Assign value

        numberOfCoffeeCups = 2;
        totalPriceOfCoffee = 10.25;
        totalNumberOfStudentsInClass = 100;

        System.out.println(numberOfCoffeeCups);
        System.out.println(totalPriceOfCoffee);
        System.out.println(totalNumberOfStudentsInClass);

        // print out like this: numberOfCoffeeCups * totalNumberOfStudentsInClass

        System.out.println(numberOfCoffeeCups + "*" + totalNumberOfStudentsInClass);
        // we used concatenation to print out the values of two variables in a given format above

        //Declare and Assign
        double temperature = 30.5;
        int javaDay = 5;
        System.out.println("\nToday the temperature was" + temperature);
        System.out.println("It is Day " + javaDay + " in Java class");




        /*
            hell1@ - can not have any special characters other than $_ digit

            12test - can not start with numbers

            $public valid

            _34hello -valid

            staticTest - valid

            static - not valid

            Package - valid because it's starts from capital P however not recommended because not following camelCase pattern

         */


    }
}
