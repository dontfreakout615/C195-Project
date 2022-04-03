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

public class EditAppointment implements Initializable {

    Stage stage;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {


        System.out.println("I am initialized");
    }

    public void toAppointmentsScreen (ActionEvent actionEvent) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/view/Appointments.fxml"));
        Stage primaryStage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        Scene appointmentsScene = new Scene(root, 575, 475);
        primaryStage.setTitle("Appointments");
        primaryStage.setScene(appointmentsScene);
        primaryStage.show();
    }
}

