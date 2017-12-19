package com.java.work;

public class Product {
	private  int id;
	private String name;
	private double price;
	private int unit;
	public Product(int id, String name, double price, int unit) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.unit = unit;
	}
	public Product() {
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getUnit() {
		return unit;
	}
	public void setUnit(int unit) {
		this.unit = unit;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + ", unit=" + unit + "]";
	}
	
	
}
