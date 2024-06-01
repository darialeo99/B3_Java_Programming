package day33_b_encapsulation.login;

public class Login {

    private String username;
    private String password;

    public Login (String username, String password) {
        this.username = username;
        //this.password = password;
        setPassword(password);
    }

    public void setPassword (String password) {
        if (password.length() >= 8 && password.contains("!") ) {
            this.password = password;


        }
    }


    public String getPassword (String username) {

        if (username.equals(this.username)){
            return password;
        }

        return "Wrong username";
    }

}
