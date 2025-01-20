package com.example.template.state;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionAndServices {
    private ConnectionAndServices instance = null;
    private Connection connection;
    
    public ConnectionAndServices getConnectionAndServices() {
        if (instance == null) {
            instance = new ConnectionAndServices();
        }
        return instance;
    }
    
    private ConnectionAndServices() {
        // Create the connection
        String url = "jdbc:postgresql://localhost:5432/"; // put the name of the db
        String user = "postgres";
        String password = "MibtBcwn?1";
        
        try {
            this.connection = DriverManager.getConnection(url, user, password);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    
    public Connection getConnection() {
        return connection;
    }
}
