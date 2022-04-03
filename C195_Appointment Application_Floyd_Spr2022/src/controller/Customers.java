package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.Optional;
import java.util.ResourceBundle;

public class Customers implements Initializable {

    Stage stage;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {


        System.out.println("I am initialized");
    }

    public void toAddCustomerScreen (ActionEvent actionEvent) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/view/AddCustomer.fxml"));
        Stage primaryStage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        Scene addCustomerScene = new Scene(root, 438, 500);
        primaryStage.setTitle("Add Customer");
        primaryStage.setScene(addCustomerScene);
        primaryStage.show();
    }

    public void toEditCustomerScreen (ActionEvent actionEvent) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/view/EditCustomer.fxml"));
        Stage primaryStage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        Scene customersScene = new Scene(root, 425, 500);
        primaryStage.setTitle("Edit Customer");
        primaryStage.setScene(customersScene);
        primaryStage.show();
    }

    public void toAppointments (ActionEvent actionEvent) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/view/Appointments.fxml"));
        Stage primaryStage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        Scene appointmentsScene = new Scene(root, 575, 475);
        primaryStage.setTitle("Appointments");
        primaryStage.setScene(appointmentsScene);
        primaryStage.show();
    }

    public void logoutButtonClicked(ActionEvent actionEvent) {

        Alert exitConfirmation = confirmMessage("Confirmation Needed", "Are you sure you want to logout?");

        if(exitConfirmation.getResult() == ButtonType.CANCEL) {
            exitConfirmation.close();
        } else {

            stage = (Stage) ((Button) actionEvent.getSource()).getScene().getWindow();
            stage.close();
        }
    }

    public Alert confirmMessage(String header, String content) {
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setHeaderText(header);
        alert.setContentText(content);
        Optional<ButtonType> choice = alert.showAndWait();

        return alert;
    }
}
