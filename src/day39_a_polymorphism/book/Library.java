package day39_a_polymorphism.book;

public class Library {
    public static void main(String[] args) {

        JavaTextBook book1 = new JavaTextBook();
        book1.name = "JAVA OCA";
        book1.size = 30.0; // mg
        book1.isFun = true;

        book1.read();
        book1.open();
        book1.dowbload();

        Ebook book2 = new JavaTextBook();
        book2.name = "JAVA OCA";
        book2.size = 30.0; // mg
        //book2.isFun = true; // Ebook does not have access to isFun variable

        ((JavaTextBook)book2).isFun = true;  // After DOWNCASTING to the class JavaTextBook which has access to isFun, I am also to reach it
        book2.read();
        book2.open();
        book2.dowbload();


        Book book3 = new JavaTextBook();
        book3.name = "JAVA OCA";
        //book3.size = 30.0; // Book does not have access to size var
        //((EBook)book3).size = 30.0; // After DOWNCASTING to the class EBook which has access to size, I am able to reach it.
        ((JavaTextBook)book3).size = 30.0; // After DOWNCASTING to the class JavaTextBook which has access to size from parent, I am able to reach it.
        //book3.isFun = true; // EBook does not have access to isFun var
        ((JavaTextBook)book3).isFun = true; // After DOWNCASTING to the class JavaTextBook which has access to isFun, I am able to reach it.
        book3.read();
        //book3.open();
        //book3.download();



        Downloadable book4 = new JavaTextBook();
        //book4.name = "JAVA OCA";
        //book4.size = 30.0; // Book does not have access to size var
        //book4.isFun = true; // EBook does not have access to isFun var
        //book4.read();
        //book4.open();
//        book4.download();
//
//
//        System.out.println("---------------------");
//        System.out.println(book1 instanceof JavaTextBook);
//        System.out.println(book2 instanceof JavaTextBook);
//        System.out.println(book2 instanceof EBook);
//        System.out.println(book2 instanceof Book);
//        System.out.println(book4 instanceof JavaTextBook);
//        System.out.println(book4 instanceof Animal);






    }
}
