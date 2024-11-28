package model;

import java.util.UUID;

public class Item {

	private String id;
	private String name;
	private String size;
	private String price;
	private String category;
	private String status;
	private String wishlist;
	private String offerStatus;
	
	public Item(String name, String size, String price, String category, String status, Wishlist wishlist,
			String offerStatus) {
		super();
		this.id = UUID.randomUUID().toString();
		this.name = name;
		this.size = size;
		this.price = price;
		this.category = category;
		this.status = status;
		this.wishlist = wishlist.getId();
		this.offerStatus = offerStatus;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getWishlist() {
		return wishlist;
	}

	public void setWishlist(String wishlist) {
		this.wishlist = wishlist;
	}

	public String getOfferStatus() {
		return offerStatus;
	}

	public void setOfferStatus(String offerStatus) {
		this.offerStatus = offerStatus;
	}
	

	
}
