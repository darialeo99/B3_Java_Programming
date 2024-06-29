package day41_collection.bank;
// Any class which is child class on Exception is Compile / checked exception [except Runtime Exception]
// Any class which is child class on RuntimeException runtime / unchecked exception
public class NotEnoughBalanceException extends RuntimeException {

    // this is unchecked exception because it extends RunTimeException class

// we are creating the layered NotEnoughBalanceException reaches out to RuntimeException
    public NotEnoughBalanceException(String message) {
        super(message); // sending it to the parent class RuntimeException
    }
}
