import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage escenario) throws Exception {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/Vistas/reto3.fxml"));
        Parent root = fxmlLoader.load();
        Scene scene = new Scene(root);

        escenario.setTitle("Reto 3");
        escenario.setScene(scene);
        escenario.show();
        
    }
}