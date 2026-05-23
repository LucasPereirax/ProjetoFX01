package com.senai.controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;

import java.util.ArrayList;
import java.util.List;

public class ConversorController2 {

    @FXML private TextField valorText;
    @FXML private TextField resultadoText;
    @FXML private ComboBox conversaoCbox;

    @FXML
    void initialize(){
        List<String> listaConversoes = new ArrayList<>();

        listaConversoes.add("BRL -> USD");
        listaConversoes.add("USD -> BRL");
        listaConversoes.add("BRL -> EUR");
        listaConversoes.add("EUR -> BRL");

        conversaoCbox.setItems(FXCollections.observableArrayList(listaConversoes));
        conversaoCbox.getSelectionModel().selectFirst();
    }


    @FXML
    private void converter(){
        double dolar = 5.03;
        double euro = 5.86;
        Double valor = Double.parseDouble(valorText.getText());
        String selecao = conversaoCbox.getValue().toString();
        if("BRL -> USD".equals(selecao)){
            double conversao = valor / dolar;
            resultadoText.setText(String.format("USD %.2f", conversao));
        } else if ("USD -> BRL".equals(selecao)){
            double conversao = valor * dolar;
            resultadoText.setText(String.format("R$ %.2f", conversao));
        } else if ("BRL -> EUR".equals(selecao)){
            double conversao = valor / euro;
            resultadoText.setText(String.format("EUR %.2f", conversao));
        } else if ("EUR -> BRL".equals(selecao)){
            double conversao = valor * euro;
            resultadoText.setText(String.format("R$ %.2f", conversao));
        }
    }
}
