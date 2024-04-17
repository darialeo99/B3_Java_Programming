package day08_scanner_logical_operators;

public class Letters {
    public static void main(String[] args) {

        // Task: define a character. Print the next four characters
        char letter = 'G';

        System.out.println("Original character " + letter);

        System.out.println("Next 4 characters: ");
        System.out.println(++letter);
        //System.out.println(letter + 1);
        System.out.println(++letter);
        System.out.println(++letter);
        System.out.println(++letter);
    }
}
