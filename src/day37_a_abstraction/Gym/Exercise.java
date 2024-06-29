package day37_a_abstraction.Gym;

public abstract class Exercise {

    String name;

    //static int count;

    // constructor
    public Exercise(String name) {
        this.name = name;
    }

    // abst method
    public abstract void performExercise();

    // abst method that has a return type and accept thing
    public abstract int burnCalories (int minutes);
}
