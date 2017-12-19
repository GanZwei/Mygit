package com.java.work;

public class Person {
	private String  name;
	private int age;
	private String addres;
	
	public Person(String name, int age, String addres) {
		this.name = name;
		this.age = age;
		this.addres = addres;
	}
	
	public Person() {
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAddres() {
		return addres;
	}
	public void setAddres(String addres) {
		this.addres = addres;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", addres=" + addres + "]";
	}

}
