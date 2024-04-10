package com.example.choicebox2;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;

import java.net.URL;
import java.util.ResourceBundle;

public class HelloController implements Initializable {
    @FXML
    private ChoiceBox<String> myChoiceBox;

    @FXML
    private Label myLabel;

    private String[] books = {"Dam Mi","Bach Hop","Linda"};


    @Override
    public void initialize(URL location, ResourceBundle resources) {
        myChoiceBox.getItems().addAll(books);
    }
}