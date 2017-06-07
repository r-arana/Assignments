package view;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import model.User;

import java.net.URL;
import java.util.ResourceBundle;


/**
 * Created by Rene on 6/3/2017.
 */
public class LoggedInJavaFXView{


    public void loggedInJavaFXView(User currentUser) throws Exception {
        Stage createLoggedInStage = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("LoggedIn.fxml"));
        createLoggedInStage.setTitle("Welcome.");
        createLoggedInStage.setScene(new Scene(root, 700, 500));
        createLoggedInStage.show();

        System.out.print("Name: " + currentUser.getFirstName() + " ");
        System.out.println(currentUser.getLastName());
        System.out.println("SSN: " + currentUser.getSocialSecurityNumber());
        System.out.println("DOB: " + currentUser.getDateOfBirth());
        System.out.println("Gender: " + currentUser.getGender());
        System.out.println("Phone Number: " + currentUser.getPhoneNumber());
        System.out.println("Email: " + currentUser.getEmail());
        System.out.println("Username: " + currentUser.getUsername());
        System.out.println("Password: " + currentUser.getPassword());
        System.out.println("Picture path: " + currentUser.getProfilePicturePath());
    }

}
