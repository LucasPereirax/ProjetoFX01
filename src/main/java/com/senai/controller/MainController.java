package com.senai.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;

import java.awt.*;

public class MainController {
    int i = 0;

    @FXML
    Label label;

    @FXML
    VBox vbox;

    @FXML
    private void onClick(){
        i++;
        Label label2 = new Label();
        label2.setText("Label "+i);
        label2.setStyle("-fx-font-size: 20px; -fx-font-weight: bold; -fx-text-fill: red;");
        vbox.getChildren().add(label2);
    }
}
