package com.senai.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;

public class MediaController {

    @FXML
    private Label resultado;

    @FXML
    private TextField nota1;

    @FXML
    private TextField nota2;

    @FXML
    private void calcular() {
        String primeiraNota = nota1.getText();
        String segundaNota = nota2.getText();

        Double nota1_convert = Double.parseDouble(primeiraNota);
        Double nota2_convert = Double.parseDouble(segundaNota);

        double media = (nota1_convert + nota2_convert) / 2;
        if (media >= 7){
            resultado.setStyle("-fx-text-fill: blue; -fx-font-size: 15");
        }else{
            resultado.setStyle("-fx-text-fill: red; -fx-font-size: 15");

        }
        resultado.setText(String.valueOf(media));
    }
}
