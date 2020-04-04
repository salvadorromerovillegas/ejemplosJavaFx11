package salvacode.ejemplosjavafx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * JavaFX App
 */
public class App extends Application {

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fL = new FXMLLoader(App.class.getResource("listaejemplos.fxml"));
        Scene scene = new Scene(fL.load(), 800, 600);
        stage.setScene(scene);
        stage.show();
    }   

    public static void main(String[] args) {
        launch();
    }

}