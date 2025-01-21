package com.example.template.controllers;

import com.example.template.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.scene.control.Button;

import java.io.IOException;

public class MainController {
    private Stage stage;
    private Scene scene;
    private Parent root;
    
    @FXML
    private TextField textBar;
    
    
    public void handleChangePageAction(ActionEvent e) throws IOException {
        String text = textBar.getText();
        FXMLLoader loader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        root = loader.load();
        HelloController controller = loader.getController();
        controller.setText(text);
        
        stage = (Stage) ((Button) e.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
}
