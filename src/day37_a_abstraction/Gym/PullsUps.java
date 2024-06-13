package day37_a_abstraction.Gym;

public class PullsUps extends Exercise{

    public PullsUps (String name) {
        super (name);
    }

    public void performExercise () {
        System.out.println("doing pull ups " + name);
    }

    @Override
    public int burnCalories(int minutes) {
        return minutes * 15;
    }
}
