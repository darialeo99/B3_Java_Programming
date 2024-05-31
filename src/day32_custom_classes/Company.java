package day32_custom_classes;

public class Company {
    public static void main(String[] args) {

        Employee empl1 = new Employee("Tom", "SDET");
        System.out.println(empl1);

        Employee empl2 = new Employee("Micky", "QA" , 123, 120_000.00);
        System.out.println(empl2);

        System.out.println();

        empl1.goToMeeting();
        empl2.goToMeeting();
    }
}
