import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import java.sql.*;

public class main extends Application {
    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Hello JavaFX");
        Label label = new Label("Hello, JavaFX!");
        StackPane root = new StackPane();
        root.getChildren().add(label);
        primaryStage.setScene(new Scene(root, 300, 200));
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
