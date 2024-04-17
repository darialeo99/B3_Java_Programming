package day08_scanner_logical_operators;

public class Discount {
    public static void main(String[] args) {
        /*
    Task
        declare and assign
            is it the weekend
            are you a teacher
            are you a police officer
            are you a firefighter

         Do you get a discount?
            Must be a weekend day and you must be one of the given professions
 */
        boolean isWeekend = false;
        boolean isTeacher = false;
        boolean isOfficer = true;
        boolean isFireFighter = false;

        //NOTE:   && has HIGHER Priority than ||

        boolean isEligibleForDiscount = isWeekend && (isTeacher || isOfficer || isFireFighter); // since we have patanthesis java still goes through the whole expression, but
                                                                                                  // if we do not have paranthesis it would not bother to through the if's obvious true or false
        //                                              false   || true      || false
        //                                              true                 // false
        //                                                         true
        //                              true &&         true
        //                                     true

        System.out.println(" It is eligible: " + isEligibleForDiscount);

    }
}
