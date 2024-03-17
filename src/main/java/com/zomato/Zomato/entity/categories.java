package com.zomato.Zomato.entity;

import java.util.Arrays;

public class categories {
//	public String message;
//	public Boolean result;
//	public String[] data;
//	
//	
//	public categories(String message, Boolean result, String[] data) {
//		super();
//		this.message = message;
//		this.result = result;
//		this.data = data;
//	}
//
//
//	public categories() {
//		super();
//	}
//
//
//	public String getMessage() {
//		return message;
//	}
//
//
//	public void setMessage(String message) {
//		this.message = message;
//	}
//
//
//	public Boolean getResult() {
//		return result;
//	}
//
//
//	public void setResult(Boolean result) {
//		this.result = result;
//	}
//
//
//	public String[] getData() {
//		return data;
//	}
//
//
//	public void setData(String[] data) {
//		this.data = data;
//	}
//
//
//	@Override
//	public String toString() {
//		return "categories [message=" + message + ", result=" + result + ", data=" + Arrays.toString(data) + "]";
//	}

	
	private boolean availability;
    private String photoUrl;
    private double price;
    private int Id;
    private String shopName;
    
    
	public categories() {
		super();
		// TODO Auto-generated constructor stub
	}


	public categories(boolean availability, String photoUrl, double price, int id, String shopName) {
		super();
		this.availability = availability;
		this.photoUrl = photoUrl;
		this.price = price;
		Id = id;
		this.shopName = shopName;
	}


	public boolean isAvailability() {
		return availability;
	}


	public void setAvailability(boolean availability) {
		this.availability = availability;
	}


	public String getPhotoUrl() {
		return photoUrl;
	}


	public void setPhotoUrl(String photoUrl) {
		this.photoUrl = photoUrl;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	public int getId() {
		return Id;
	}


	public void setId(int id) {
		Id = id;
	}


	public String getShopName() {
		return shopName;
	}


	public void setShopName(String shopName) {
		this.shopName = shopName;
	}


	@Override
	public String toString() {
		return "service [availability=" + availability + ", photoUrl=" + photoUrl + ", price=" + price + ", Id=" + Id
				+ ", shopName=" + shopName + "]";
	}
	
	
}
