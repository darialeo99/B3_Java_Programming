package day33_b_encapsulation.login;

public class UseLogin {
    public static void main(String[] args) {

        Login person1 = new Login("loopcamp", "loopAcademy1234!");

        // Since those Instance variables are "private" I can not access them directly

        //System.out.println(person1.username);
        //System.out.println(person1.password); // direct

        System.out.println(person1.getPassword("loopcamp")); // indirect access
        person1.setPassword("loopcamp!");
        System.out.println(person1.getPassword("loopcamp"));




    }
}
