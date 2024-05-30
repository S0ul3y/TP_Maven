/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package contact.liste;

/**
 *
 * @author DIAW-TECH
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class connexion {

    private static final String URL = "jdbc:mysql://localhost:3306/contact";
    private static final String USER = "root"; // Changez par votre nom d'utilisateur
    private static final String PASSWORD = ""; // Changez par votre mot de passe

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }

    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            try (Connection connection = getConnection()) {
                System.out.println("Connection successful!");
            }
        } catch (ClassNotFoundException e) {
            System.err.println("MySQL JDBC Driver not found: " + e.getMessage());
            e.printStackTrace();
        } catch (SQLException e) {
            System.err.println("Connection failed: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
