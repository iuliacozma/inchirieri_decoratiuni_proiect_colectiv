package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage registerClient) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("register_client.fxml"));
        registerClient.setTitle("Inregistrare Client Nou");
        registerClient.setScene(new Scene(root));
        registerClient.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
