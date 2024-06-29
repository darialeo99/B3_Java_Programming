package day32_custom_classes;

public class OfferV2 {
    String location;
    String company;
    double salary;
    boolean isFullTime;
    int numberOfPTO;


    public OfferV2(String company, String location) {
        this.company = company;
        this.location = location;
    }

    // OVERLOADED CONSTRUCTOR
    public OfferV2 (String company, String location, double salary) {


//      this.company = company;
//      this.location = location;
        this(company, location);
        this.salary = salary;
    }

    public OfferV2 (String location, String company, double salary, boolean isFullTime, int numberOfPTO) {

//        this.location = location;
//        this.company = company;
//        this.salary = salary;

        this(location,company,salary);
        this.isFullTime = isFullTime;
        this.numberOfPTO = numberOfPTO;
    }

    // BAD CONSTRUCTOR CHAINING EXAMPLE
    // ASSIGNING WRONG VALUES TO WRONG INSTANCE VARIABLES
    public OfferV2(String location, String company, double salary, boolean isFullTime, int numberOfPTO, String name, String lastName) {
        this(name, lastName); // NOT GOOD PRACTICE. WRONG ASSIGNING
        this.isFullTime = isFullTime;
        this.numberOfPTO = numberOfPTO;
    }

    @Override
    public String toString() {

        String info = company + " is located in " + location;

        info += "\n" + (salary > 0 ? salary : "");

        info += "\n" + (isFullTime ? "Full Time" : "Contract");

        info += "\n" + (numberOfPTO > 0 ? numberOfPTO : "");


//        return "Offer{" +
//                "location='" + location + '\'' +
//                ", company='" + company + '\'' +
//                ", salary=" + salary +
//                ", isFullTime=" + isFullTime +
//                ", numberOfPTO=" + numberOfPTO +
//                '}';

        return info;
    }
}
