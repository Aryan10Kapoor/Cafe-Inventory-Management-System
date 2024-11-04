import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author kapoo
 */
public class CafeManagementSystem extends Application {
    
    @Override
    public void start(Stage stage) throws Exception {
        // Load the FXML file using a relative path
        Parent root = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
        
        Scene scene = new Scene(root);
        
        stage.setScene(scene);
        stage.setTitle("Cafe Management System"); // Optional: Set the window title
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
