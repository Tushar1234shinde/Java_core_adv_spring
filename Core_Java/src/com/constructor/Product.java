package com.constructor;

public class Product {
	int pid;
	String brand;
	double price;
	String p_name;
	public Product() {
		pid=23;
		brand="hp";
		price=25000;
		p_name="laptop";
	}
	public Product(int pid, String brand, double price, String p_name) {
		super();
		this.pid = pid;
		this.brand = brand;
		this.price = price;
		this.p_name = p_name;
	}
	public void display() {
		System.out.println("Product id="+pid+", Brand Name="+brand+", Price="+price+", Product Name="+p_name);
	}
	
}
