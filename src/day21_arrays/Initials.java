package day21_arrays;

public class Initials {
    public static void main(String[] args) {

        /*
Initials
        • Given an array of classmate’s names, first name and last separated by a space, print the initials of everyone
            Ex:
            Input:
                [ “James Bond”, “Eve Rell”, “Anna Johnson” ]
            Output:
                JB ER AJ
 */

        String [] names = {"James Bond " , "Eve Rell " , "Anna Johnson "};

        for (int i = 0; i < names.length ; i++) {
            String eachFullName = names[i].trim();
            String eachLastName = eachFullName.substring(eachFullName.indexOf(" ")).trim(); //
            // String eachLastName = eachFullName.substring(eachFullName.indexOf(" ") + 1);


            System.out.println(eachFullName);
            System.out.println(eachLastName);

            // Getting the first characters of Fullnames and lastnames

            String initial = (eachFullName.charAt(0)+ "").toUpperCase()+ (eachLastName.charAt(0) + "").toUpperCase();
            System.out.println(initial);

            //System.out.println((names[i].trim().charAt(0)+"").toUpperCase() + (names[i].trim().substring(eachFullName.indexOf(" ")).trim().charAt(0)+"").toUpperCase());


        }





    }
}
