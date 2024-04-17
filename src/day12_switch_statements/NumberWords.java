package day12_switch_statements;

public class NumberWords {
    public static void main(String[] args) {
        /*
    Take a number and print the number as the word version
    1 -> one
    2 -> two
    ...
 */

        int num = 3;

        // Approach 1
//        if (num == 1){
//            System.out.println("One");
//        }else if (num == 2){
//            System.out.println("Two");
//        }

        // Approach 2 // switch does not support relational operators (<,>, ==, !=) so it has its own limitations. It only checks the EXACT value is equal
        // Switch statement can only work with these data types: String, char, short, int, byte

        switch (num){
            case 1: // exact values can not be duplicate , we can not have case 1 and case 1 in the same switch. But we can do case 2 and after case 1
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
            case 3:
                System.out.println("Three");
                break;
            case 4:
                System.out.println("Four");
                break;
            case 5:
                System.out.println("Five");
            default:
                System.out.println("The number is not between 1 and 5");
        }
    }
}
