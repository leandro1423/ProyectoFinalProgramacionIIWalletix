package co.edu.uniquindio.poo.walletix.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class AplicacionController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}