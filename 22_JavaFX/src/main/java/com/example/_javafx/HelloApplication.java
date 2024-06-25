package com.example._javafx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        //FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        //Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        //stage.setTitle("Hello!");
        //stage.setScene(scene);
        //stage.show();

        // Create UI controls
        Label label = new Label("Enter your name:");
        TextField textField = new TextField();
        Button button = new Button("Say Hello");
        Label messageLabel = new Label();

        // Set button action
        button.setOnAction(event -> {
            String name = textField.getText();
            messageLabel.setText("Hello, " + name + "!");
        });

        // Create layout and add UI controls
        VBox layout = new VBox(10);
        layout.getChildren().addAll(label, textField, button, messageLabel);

        // Create scene and set it on the stage
        Scene scene = new Scene(layout, 300, 200);
        stage.setScene(scene);
        stage.setTitle("JavaFX Demo");
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}