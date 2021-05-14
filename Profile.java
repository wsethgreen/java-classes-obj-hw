import java.util.ArrayList;

public class Profile {
    
    // Create a "profile" class to house data similar to what you would find 
    // on a standard profile created for a website.

    private String email;
    private String phoneNum;
    private String password;
    public boolean loggedIn = true;


    // Empty Constructor
    public Profile() {

    }

    // Constructor with only two variables
    public Profile(String email, String password) {
        this.email = email;
        this.password = password;
    }

    // Constructor with all variables
    public Profile(String email, String phoneNum, String password) {
        this.email = email;
        this.phoneNum = phoneNum;
        this.password = password;
    }

    // getters

    public String getEmail() {
        return email;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public String getPassword() {
        return password;
    }

    // setters
    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    // Method that returns a boolean
    public boolean isLoggedIn() {
        return loggedIn;
    }

    //Method that returns a string
    public String greeting() {
        return "Welcome to this website!";
    }

}
