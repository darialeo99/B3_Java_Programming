package day41_collection.bank;
// Any class which is child class on Exception is Compile / checked exception [except Runtime Exception]
// Any class which is child class on RuntimeException runtime / unchecked exception
public class InvalidCredentialsException extends Exception {

    public InvalidCredentialsException(String message) {
        super(message);
    }




}
