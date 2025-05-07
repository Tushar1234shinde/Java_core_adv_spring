package com.basic_java;

public class product {

	int pid;
	String brand;
	double price;
	String p_name;
	
	public void initialise(){
		pid=12;
		brand="TS company";
		price=75000;
		p_name="Laptop";
	}
	
	public void display() {
		System.out.println("Product id="+pid+", Brand Name="+brand+", Price="+price+", Product Name="+p_name);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		product p1;
		p1=new product();
		
		p1.initialise();
		p1.display();
		System.out.println("*******************************************************");
		product p2=new product();
		p2.pid=13;
		p2.brand="Hp";
		p2.price=60000;
		p2.p_name="Laptop";
		p2.display();
		
		
	}
}
