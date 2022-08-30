package co.edu.unbosque.trabajo1_ing_sof_2_p1;

import java.io.IOException;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;


public class HelloApplication extends Application {



    @Override
    public void start(Stage primaryStage) {

        try {
            //Cargo la vista
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("persona-vista.fxml"));

            // Cargo la ventana
            Pane ventana = (Pane) fxmlLoader.load();

            // Cargo el scene
            Scene scene = new Scene(ventana);

            // Seteo la scene y la muestro
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

}