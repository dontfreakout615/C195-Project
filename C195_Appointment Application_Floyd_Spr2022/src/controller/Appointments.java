package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class Appointments implements Initializable {

    Stage stage;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {


        System.out.println("I am initialized");
    }

    public void toAddAppointmentScreen (ActionEvent actionEvent) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/view/AddAppointment.fxml"));
        Stage primaryStage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        Scene addAppointmentScene = new Scene(root, 440, 500);
        primaryStage.setTitle("Add Appointment");
        primaryStage.setScene(addAppointmentScene);
        primaryStage.show();
    }

    public void toEditAppointmentScreen (ActionEvent actionEvent) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/view/EditAppointment.fxml"));
        Stage primaryStage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        Scene editAppointmentScene = new Scene(root, 440, 500);
        primaryStage.setTitle("Edit Appointment");
        primaryStage.setScene(editAppointmentScene);
        primaryStage.show();
    }

    public void toCustomersScreen (ActionEvent actionEvent) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/view/Customers.fxml"));
        Stage primaryStage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        Scene customersScene = new Scene(root, 575, 475);
        primaryStage.setTitle("Customers");
        primaryStage.setScene(customersScene);
        primaryStage.show();
    }
}
