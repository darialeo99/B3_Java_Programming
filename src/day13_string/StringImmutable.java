package day13_string;
public class StringImmutable {
    public static void main(String[] args) {

        String str1 = "loop";
        str1 = str1 + "camp";

        System.out.println(str1);

        String str2 = "loop";
        str2 = "java";
        System.out.println(str2);
    }
}
