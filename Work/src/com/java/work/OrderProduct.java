package com.java.work;

public class OrderProduct {
	private int productId;
	private int count;
	private double sumPrice;
	public OrderProduct() {
	}
	public OrderProduct(int productId, int count) {
		super();
		this.productId = productId;
		this.count = count;
	}
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public double getsumPrice() {
		return sumPrice;
	}
	@Override
	public String toString() {
		return "OrderProduct [productId=" + productId + ", count=" + count + ", totalPrice=" + this.getsumPrice() + "]";
	}
	
	
}
