package day37_a_abstraction.Gym;

public class Running extends Exercise{

    public Running(String name) {
        super(name);
    }

    public void performExercise () {
        System.out.println("Running " + name);
    }

    @Override
    public int burnCalories(int minutes) {

        return minutes * 5;
    }
}
