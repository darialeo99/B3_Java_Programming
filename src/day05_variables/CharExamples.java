package day05_variables;

public class CharExamples {
    public static void main(String[] args) {

        //declare and assign value to char datatype variable
        char letterOne = 'a';
        char letterTwo = 'Z';
        char letterThree = '9';
        char letterFour = '%';

        System.out.println(letterOne);
        System.out.println(letterTwo);
        System.out.println(letterThree);
        System.out.println(letterFour);

        System.out.println(letterOne +  letterTwo); //aZ ---> 97 + 90 = 187 , this is int datatype

        char letter = 74; // J   this is char datatype
        System.out.println(letter);

        System.out.println(letterOne + letterTwo + letterThree + letterFour); // 97 + 90 + 57 + 37, it's addition of ASCI table values , so it's int type
        System.out.println(letterOne + " " + letterTwo + " " + letterThree + " " + letterFour); // This is concatentation, not addition, so it prints out the actual ASCI table names of values

        System.out.println("chars:" + letterOne + letterTwo + letterThree + letterFour);
    }
}
