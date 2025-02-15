module com.example.template {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires net.synedra.validatorfx;
    requires eu.hansolo.tilesfx;
    requires java.sql;
    requires java.desktop;

    opens com.example.template.controllers to javafx.fxml;
    opens com.example.template.domain to javafx.base;
    opens com.example.template to javafx.fxml;
    
    exports com.example.template.controllers;
    exports com.example.template;
}