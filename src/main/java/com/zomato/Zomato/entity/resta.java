package com.zomato.Zomato.entity;

public class resta {
	boolean availablaity;
	String photoUrl;
	String price;
	String restaurentId;
	String restaurentName;
	
	public resta() {
		super();
		// TODO Auto-generated constructor stub
	}

	public resta(boolean availablaity, String photoUrl, String price, String restaurentId, String restaurentName) {
		super();
		this.availablaity = availablaity;
		this.photoUrl = photoUrl;
		this.price = price;
		this.restaurentId = restaurentId;
		this.restaurentName = restaurentName;
	}

	public boolean isAvailablaity() {
		return availablaity;
	}

	public void setAvailablaity(boolean availablaity) {
		this.availablaity = availablaity;
	}

	public String getPhotoUrl() {
		return photoUrl;
	}

	public void setPhotoUrl(String photoUrl) {
		this.photoUrl = photoUrl;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getRestaurentId() {
		return restaurentId;
	}

	public void setRestaurentId(String restaurentId) {
		this.restaurentId = restaurentId;
	}

	public String getRestaurentName() {
		return restaurentName;
	}

	public void setRestaurentName(String restaurentName) {
		this.restaurentName = restaurentName;
	}

	@Override
	public String toString() {
		return "resta [availablaity=" + availablaity + ", photoUrl=" + photoUrl + ", price=" + price + ", restaurentId="
				+ restaurentId + ", restaurentName=" + restaurentName + "]";
	}

	
	
}
