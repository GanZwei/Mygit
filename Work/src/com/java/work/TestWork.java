package com.java.work;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestWork {

	@Test
	public void test() {
		Product p1=new Product(101, "��Ƭ", 4.0, 15);
		Product p2=new Product(102, "ţ��", 5, 25);
		Product p3=new Product(201, "ϴ��ˮ", 30, 10);
		Product p4=new Product(202, "����", 10, 30);
		Product p5=new Product(103, "��Ҷ", 15, 20);
		List<Product> p=new ArrayList<Product>();
		p.add(p1); p.add(p2);
		p.add(p3); p.add(p4);
		p.add(p5); 
		Address a1=new Address(11,"����","1378954","�Ĵ��ɶ�������");
		Address a2=new Address(12,"����","1378954","�Ĵ��ɶ���ţ��");
		Address a3=new Address(21,"����","9532356","�Ĵ��ɶ�������");
		Address a4=new Address(22,"����","9532356","�Ĵ��ɶ��ɻ���");
		List<Address> m1=new ArrayList<Address>();
		List<Address> m2=new ArrayList<Address>();
		
		m1.add(a1);  m1.add(a2);
		User u1=new User(1, "����", "12345", m1);
		m2.add(a3);  m2.add(a4);
		User u2=new User(2, "����", "54321", m2);
		OrderProduct op1=new OrderProduct(101, 3);
		OrderProduct op2=new OrderProduct(103, 2);
		OrderProduct op3=new OrderProduct(201, 10);
		OrderProduct op4=new OrderProduct(102, 6);
		OrderProduct op5=new OrderProduct(202, 5);
		OrderProduct op6=new OrderProduct(102, 10);
		List<OrderProduct> lop1=new ArrayList<OrderProduct>();
		lop1.add(op1); lop1.add(op2);
		
		List<OrderProduct> lop2=new ArrayList<OrderProduct>();
		lop2.add(op3); lop2.add(op1);
		
		List<OrderProduct> lop3=new ArrayList<OrderProduct>();
		lop3.add(op1); lop3.add(op4); lop3.add(op3);
		
		List<OrderProduct> lop4=new ArrayList<OrderProduct>();
		lop4.add(op3); lop4.add(op1); lop4.add(op2);
		
		List<OrderProduct> lop5=new ArrayList<OrderProduct>();
		lop5.add(op4); lop5.add(op1);lop5.add(op6);lop5.add(op5);
		
		Order o1=new Order(1, "ʳ��", lop1, 11);
		Order o2=new Order(1, "����", lop2, 12);
		Order o3=new Order(1, "ʳ��", lop3, 12);
		Order o4=new Order(1, "ʳ��", lop4, 21);
		Order o5=new Order(1, "ʳ��", lop5, 21);
	}
public void find(int id){
		
	}
}
