package com.example.laboratorio.controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.stage.Stage;

public class MainViewController {
    private LoginViewController loginController;
    private Stage stage;
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    void elementView(ActionEvent event) {

    }

    @FXML
    void loanView(ActionEvent event) {

    }

    @FXML
    void personView(ActionEvent event) {

    }

    @FXML
    void reportView(ActionEvent event) {

    }



    public void init( Stage stage, LoginViewController loginViewController) {
    this.loginController = loginViewController;
    this.stage = stage;
    }
}
