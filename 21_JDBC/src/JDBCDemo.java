// 21_JDBC/JDBCDemo.java
/*
 * JDBC and Database Connectivity
 * This program demonstrates how to connect to a MySQL database using JDBC, execute queries, and handle results.
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBCDemo {
    private static final String URL = "jdbc:mysql://localhost:3306/testdb";
    private static final String USER = "root";
    private static final String PASSWORD = "password";

    public static void main(String[] args) {
        try {
            // Load MySQL JDBC Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establish a connection to the database
            Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("Connected to the database.");

            // Create a statement object to execute SQL queries
            Statement statement = connection.createStatement();

            // Execute a SQL query to create a table
            String createTableSQL = "CREATE TABLE IF NOT EXISTS users ("
                    + "id INT AUTO_INCREMENT PRIMARY KEY, "
                    + "name VARCHAR(50), "
                    + "email VARCHAR(50))";
            statement.executeUpdate(createTableSQL);
            System.out.println("Table 'users' created.");

            // Insert data into the table using PreparedStatement
            String insertSQL = "INSERT INTO users (name, email) VALUES (?, ?)";
            PreparedStatement preparedStatement = connection.prepareStatement(insertSQL);
            preparedStatement.setString(1, "John Doe");
            preparedStatement.setString(2, "john@example.com");
            preparedStatement.executeUpdate();
            System.out.println("Data inserted into 'users' table.");

            // Execute a SQL query to retrieve data
            String selectSQL = "SELECT * FROM users";
            ResultSet resultSet = statement.executeQuery(selectSQL);

            // Process the result set
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                String email = resultSet.getString("email");
                System.out.println("ID: " + id + ", Name: " + name + ", Email: " + email);
            }

            // Close the resources
            resultSet.close();
            preparedStatement.close();
            statement.close();
            connection.close();
            System.out.println("Disconnected from the database.");
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }
}
