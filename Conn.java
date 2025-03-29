package bank.management.system;

import java.sql.*;

public class Conn {
    Connection connection;  // Instance variable
    public Statement statement;    // Instance variable

    public Conn() {
        try {
            // Load MySQL Driver (Optional for newer versions, but good practice)
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establish Connection
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bankSystem", "root", "2006");

            // Initialize the Statement object
            statement = connection.createStatement();
            System.out.println("Database Connected Successfully!");
        } catch (Exception e) {
            System.out.println("Database Connection Failed!");
            e.printStackTrace();
        }
    }

    // Getter method to access the Statement object (optional)
    public Statement getStatement() {
        return statement;
    }
}
