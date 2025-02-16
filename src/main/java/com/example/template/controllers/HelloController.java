package com.example.template.controllers;

import com.example.template.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloController {
    private Stage stage;
    private Scene scene;
    private Parent root;
    private String text;

    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick(ActionEvent e) throws IOException {
        System.out.println(text);
        root = FXMLLoader.load(HelloApplication.class.getResource("main-view.fxml"));
        stage = (Stage) ((Button) e.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    
    @FXML
    public void initialize() {
    }
    
    public void setData(String data) {
        this.text = data;
        welcomeText.setText(data);
    }
    
    
}