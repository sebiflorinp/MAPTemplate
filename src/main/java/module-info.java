module com.example.template {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires net.synedra.validatorfx;
    requires eu.hansolo.tilesfx;
    requires java.sql;

    opens com.example.template to javafx.fxml;
    exports com.example.template;
}