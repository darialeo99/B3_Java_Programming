package day36_inheritance.taxi;

public class LyftXL extends Lyft {

    //String driver;

    // connecting the super constructor/ my parent class which I can call
    public LyftXL(String driver) {
        super(driver);

    }

    @Override
    public double calculateRate (int miles) {
        return super.calculateRate(miles) * 1.1;
    }

    // super.calculateRate(miles) - > calls the method in the Lyft class (parent class)
    // then we multiply it with 1.1;


}
