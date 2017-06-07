package controller;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import model.User;
import model.UserDB;
import view.LoggedInJavaFXView;
import view.RegistrationJavaFXView;
import javafx.scene.control.TextField;
import javafx.scene.control.Label;

import java.io.IOException;

/**
 * Created by Rene on 6/4/2017.
 */
public class SignInController {

    @FXML
    private TextField uName;
    @FXML
    private PasswordField pass;
    @FXML
    private Label signInFailed;
    @FXML
    private Label pleaseRegister;

    public void authenticate() {
        signInFailed.setVisible(false);
        pleaseRegister.setVisible(false);
        boolean didNotfindMatch = true;

        //If the list isn't empty, check username and password.
        if (!(UserDB.getUsers().isEmpty())){

            for (int i = 0; i < UserDB.getUsers().size(); i++) {

                if ((uName.getText().equals(UserDB.getUsers().get(i).getUsername()))
                        && (pass.getText().equals(UserDB.getUsers().get(i).getPassword()))){
                    try {
                        didNotfindMatch = false;
                        openLoggedInJavaFXView(UserDB.getUsers().get(i));
                    } catch (IOException e) {
                        System.out.println(e.getMessage());
                        System.out.println("Exception thrown by openLoggedInJavaFXView");
                    }
                }
            }
            if(didNotfindMatch){
                signInFailed.setVisible(true);
            }
        }
        //If the list is empty, ask them to register.
        else{
            pleaseRegister.setVisible(true);
        }
    }

    public void openRegistrationJavaFXView() throws IOException {
        System.out.println("Open Registration View");
        try{
            RegistrationJavaFXView register = new RegistrationJavaFXView();
            register.registrationJavaFXView();
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }

    }

    public void openLoggedInJavaFXView(User currentUser) throws IOException {
        System.out.println("Open Logged In view");
        try{
            LoggedInJavaFXView logIn = new LoggedInJavaFXView();
            logIn.loggedInJavaFXView(currentUser);
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }

}
