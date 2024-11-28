package model;

import java.util.UUID;

public class User {
	private String id;
	private String username;
	private String password;
	private String phoneNumber;
	private String Address;
	private String role;
	
	public User(String username, String password, String phoneNumber, String address) {
		super();
		this.username = username;
		this.password = password;
		this.id = UUID.randomUUID().toString();
		this.phoneNumber = phoneNumber;
		Address = address;
		this.role = "Guest";
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}	
	
	
}
