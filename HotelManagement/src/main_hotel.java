import javafx.application.Application;
import java.awt.EventQueue;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import java.sql.*;

public class main_hotel {
    public static void main(String[] args) {
        // Database connection details
        String databaseUrl = "jdbc:mysql://localhost:3306/hoteldatabase";
        String username = "root";
        String password = "123456789";

        Connection connection = null;

        try {
            // Establish a database connection
            connection = DriverManager.getConnection(databaseUrl, username, password);
            System.out.println("hello world");
            if (connection != null) {
                System.out.println("Connected to the database!");
                // You can perform database operations here.
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            // Close the database connection when done
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }

        // Create an instance of the AppWindow class and display the GUI
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    AppWindow window = new AppWindow();
                    window.getFrame().setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
}

