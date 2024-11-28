package controllers;

import util.Connect;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserController {
    
    private Connection connection;

    public UserController() {
        this.connection = Connect.getInstance().getConnection();
    }

    private boolean Register(String username, String password, String phoneNumber, String address, String role) {
        String insertData = "INSERT INTO User (username, password, phoneNumber, address, role) VALUES (?, ?, ?, ?, ?)";
        String checkData = "SELECT * FROM User WHERE username = ?"; 
        
        try (PreparedStatement stmt = connection.prepareStatement(checkData)) {
            stmt.setString(1, username);

            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) return false; 
            }
        } catch (SQLException e) {
            System.err.println("Error checking existing user: " + e.getMessage());
            return false; 
        }

        // Proceed to insert new user
        try (PreparedStatement stmt = connection.prepareStatement(insertData)) {
            stmt.setString(1, username);
            stmt.setString(2, password);
            stmt.setString(3, phoneNumber);
            stmt.setString(4, address);
            stmt.setString(5, role);
            
            stmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Failed to Register");
            e.printStackTrace();
            return false;
        }
        
        return true;
    }
    
    private boolean Login(String username, String password) {
        String sql = "SELECT * FROM User WHERE username = ? AND password = ?";
        
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setString(1, username);
            stmt.setString(2, password);
            
            try (ResultSet rs = stmt.executeQuery()) { 
                return rs.next(); 
            }
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
}
