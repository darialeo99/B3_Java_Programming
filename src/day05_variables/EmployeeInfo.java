package day05_variables;

public class EmployeeInfo {
    public static void main(String[] args) {


//        String firstName;
//        String lastName;
//        String companyName;
//        String jobTitle;
//
        // As long as the variables share the SAME datatype, we can declare then like this as well
        String firstName, lastname, companyName, jobTitle;

        int age, pto; // Paid Time Off - days for vacation

        boolean isFullTime, isMarried;


        double Salary;

        char suite, gender;

        firstName = "Daria";
        lastname = "Leon";
        companyName = "LoopAcademy";
        jobTitle = "IT analyst";
        age = 24;
        pto = 21;
        Salary = 120_000.00; // 120,000.00 - instead of comma we can use underscore
        isFullTime = true;
        isMarried = false;
        suite = 'A';
        gender = 'F';

        String fullDetails = "Employment Information for: " + firstName + " " + lastname + "\n\tGender: " + gender + "\n\tJob Title: " + jobTitle;

    }
}
