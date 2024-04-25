package day16_loops;

public class replaceMethod {
    public static void main(String[] args) {

        String s = "java is a language";
        s = s.replace('a', 'e');
        System.out.println(s);

        String day = "Today is Wednesday. We will do practice. It is Wednesday";
        day = day.replace("Wednesday", "Today");
        day = day.replace("Wednesday", "Sunday"); // No Sunday in the day String
        System.out.println(day);

        int firstDot = day.indexOf(".");
        int lastDot = day.lastIndexOf(".");

        String middle = day.substring(firstDot + 1, lastDot).trim(); // or we can do +2 to reach to the word directly, or to use .trim() while using +1 (we wil trim the space later)
        System.out.println(middle);

        String word = "loop";
        word = word.replaceFirst("o", "u"); // changes the first occurence only
        System.out.println(word);

    }
}
