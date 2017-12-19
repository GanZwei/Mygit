package com.java.work;

import java.util.List;

public class Order extends OrderProduct{
	private int id;
	private String name;
	private int totalPrice;
	private List<OrderProduct> op;
	private int userid;
	private int addressid;
	private int time;
	
	public Order() {
		super();
	}

	public Order(int id, String name, List<OrderProduct> op,int addressid) {
		super();
		this.id = id;
		this.name = name;
		this.op = op;
		this.addressid = addressid;
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

	public int getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(int totalPrice) {
		this.totalPrice = totalPrice;
	}

	public List<OrderProduct> getOp() {
		return op;
	}

	public void setOp(List<OrderProduct> op) {
		this.op = op;
	}

	public int getUserid() {
		return userid;
	}

	public int getAddressid() {
		return addressid;
	}

	public void setAddressid(int addressid) {
		this.addressid = addressid;
	}

	public int getTime() {
		return time;
	}

	public void setTime(int time) {
		this.time = time;
	}
	

	@Override
	public String toString() {
		return "Order [id=" + id + ", name=" + name + ", totalPrice=" + totalPrice + ", op=" + op + ", userid=" + userid
				+ ", addressid=" + addressid + ", time=" + time + "]";
	}
	
	
}
