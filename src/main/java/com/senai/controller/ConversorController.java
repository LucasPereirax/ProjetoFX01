package com.senai.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class ConversorController {
    @FXML
    private TextField valor_real;
    @FXML
    private Label informa_moeda;
    @FXML
    private Label valor_final;

    @FXML
    private void dolar(){
        double valorDolar = 5.03;
        Double valorReal = Double.parseDouble(valor_real.getText());
        if (valorReal <= 0 || valorReal == null){
            informa_moeda.setText("O valor não pode ser convertido, pois é nulo ou menor que zero!");
        }else{
            double valorFinal = valorReal/valorDolar;
            informa_moeda.setText("O valor de R$"+ valorReal+ " convertido em dólar é:");
            valor_final.setText(String.format("US$ %.2f", valorFinal));
        }
    }

    @FXML
    private void euro(){
        double valorEuro = 5.86;
        Double valorReal = Double.parseDouble(valor_real.getText());
        if (valorReal <= 0 || valorReal == null){
            informa_moeda.setText("O valor não pode ser convertido, pois é nulo ou menor que zero!");
        }else{
            double valorFinal = valorReal/valorEuro;
            informa_moeda.setText("O valor de R$"+ valorReal+ " convertido em euro é:");
            valor_final.setText(String.format("€ %.2f", valorFinal));
        }
    }

    @FXML
    private void libra(){
        double valorLibra = 6.77;
        Double valorReal = Double.parseDouble(valor_real.getText());
        if (valorReal <= 0 || valorReal == null){
            informa_moeda.setText("O valor não pode ser convertido, pois é nulo ou menor que zero!");
        }else{
            double valorFinal = valorReal/valorLibra;
            informa_moeda.setText("O valor de R$"+ valorReal+ " convertido em libra é:");
            valor_final.setText(String.format("£ %.2f", valorFinal));
        }
    }


    public void converter(ActionEvent actionEvent) {

    }
}
