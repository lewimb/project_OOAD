package model;

import java.util.UUID;

public class Transaction {
	
	private String itemId;
	private String userId;
	private String id;
	
	public Transaction(Item item,User user) {
		this.itemId = item.getId();
		this.userId = user.getId();
		this.id = UUID.randomUUID().toString();
	}

	public String getItemId() {
		return itemId;
	}

	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	
	
	
}
