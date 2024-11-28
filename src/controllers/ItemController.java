package controllers;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;

import model.Item;
import util.Connect;

public class ItemController {

	Connection connection;
	
	private ItemController() {
		this.connection = Connect.getInstance().getConnection();
	}
	
	public Vector<Item> getAllItem(){
		Vector<Item> items = new Vector<>();
		String sql = "SELECT * FROM Item";
		
		try (PreparedStatement stmt = connection.prepareStatement(sql)) {

            try (ResultSet rs = stmt.executeQuery()) {
            	String id = rs.getString("id");
                String name = rs.getString("name");
                String size = rs.getString("size");
                String price = rs.getString("price");
                String category = rs.getString("category");
                String status = rs.getString("status");
                String wishlist = rs.getString("wishlist");
                String offerStatus = rs.getString("offerStatus");
            	
//            	Item item = new Item(name, size, price, category, status, wishlist, offerStatus);
//                items.add(item);
            }
        } catch (SQLException e) {
            System.err.println("Error checking existing user: " + e.getMessage());
            return null; 
        }

		
		return items;
	}
	
}
