package com.example.grocery;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to First JavaFX Application!");
    }

    @FXML
    protected void postButtonClick() {
        welcomeText.setText("Hey I am Pathum!");
    }
}