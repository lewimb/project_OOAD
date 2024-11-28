package model;

import java.util.ArrayList;
import java.util.UUID;

public class Wishlist {
	private String id;
	private ArrayList<String> itemId;
	private String userId;
	
	public Wishlist(ArrayList<Item> item, User user) {
		super();
		this.id = UUID.randomUUID().toString();
		this.itemId = new ArrayList<String>();
		
		for (Item item1 : item) {
			this.itemId.add(item1.getId());
		}
		
		this.userId = user.getId();
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public ArrayList<String> getItemId() {
		return itemId;
	}

	public void setItemId(ArrayList<String> itemIds) {
		this.itemId = itemIds;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	
	
	
}
