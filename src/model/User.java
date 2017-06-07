package model;

import java.io.Serializable;
import java.nio.file.Path;

/**
 * Created by Rene on 6/4/2017.
 */
public class User extends Person implements Serializable{

    private String username;
    private String email;
    private String password;
    private String phoneNumber;
    private String profilePicturePath;


    public User(String newFirstName, String newLastName, String newGender, String ssn, String dob, String username, String email, String password, String phoneNumber, String profilePicturePath) {
        super(newFirstName, newLastName, newGender, ssn, dob);
        this.username = username;
        this.email = email;
        this.password = password;
        this.phoneNumber = phoneNumber;
        this.profilePicturePath = profilePicturePath;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getProfilePicturePath() {
        return profilePicturePath;
    }

    public void setProfilePicture(Path profilePicture) {
        this.profilePicturePath = profilePicturePath;
    }

    public String getUsername(){
        return username;
    }

    public String getEmail(){
        return email;
    }

    public String getPassword(){
        return password;
    }

    public String getPhoneNumber(){
        return phoneNumber;
    }
}
