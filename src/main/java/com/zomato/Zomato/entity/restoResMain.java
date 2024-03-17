package com.zomato.Zomato.entity;

import java.util.Map;

public class restoResMain {
	Map<Integer, resta> data;
	String message;
	boolean result;
	
	public restoResMain() {
		super();
		
	}

	public restoResMain(Map<Integer, resta> data, String message, boolean result) {
		super();
		this.data = data;
		this.message = message;
		this.result = result;
	}

	public Map<Integer, resta> getData() {
		return data;
	}

	public void setData(Map<Integer, resta> data) {
		this.data = data;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public boolean isResult() {
		return result;
	}

	public void setResult(boolean result) {
		this.result = result;
	}

	@Override
	public String toString() {
		return "restoResMain [data=" + data + ", message=" + message + ", result=" + result + "]";
	}

	
}
