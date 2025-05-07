package com.additionOfNumber;

public class Arithmatic_operation {

	public int a=20;
	public int b=5;
	
	
	public void add() {
		System.out.println("Addition ="+(a+b));
	}
	
	public void add(int a,int b) {
		System.out.println("Two Parameterized numbers Addition ="+(a+b));		
	}
	
	public void add(int a,int b,int c) {
		System.out.println("Three Parameterized numbers Addition ="+(a+b+c));		
	}
	
	public void sub() {
		System.out.println("Substraction ="+(a-b));
	}
	
	public void sub(int a,int b) {
		
		System.out.println("Parameterized Substraction ="+(a-b));
	}
	
	public void div() {
		System.out.println("Division ="+(a/b));
	}
	
	public void div(int a,int b) {
		System.out.println("Parameterized Division ="+(a/b));
	}
	
	public void mult() {
		System.out.println("Multiplication ="+(a*b));
	}
	
	public void mult(int a, int b) {
		System.out.println("Parameterized Multiplication ="+(a*b));
	}
	
	public void mod() {
		System.out.println("Remender(..modulus..) ="+(a%b));
	}
	
	public void mod(int a,int b) {
		System.out.println("Parameterized Remender ="+(a%b));
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Arithmatic_operation ar1=new Arithmatic_operation();
		ar1.add();
		ar1.add(2,3);
		ar1.add(2,3,5);
		ar1.sub();
		ar1.sub(10,9);
		ar1.div();
		ar1.div(33,3);
		ar1.mult();
		ar1.mult(25,25);
		ar1.mod();
		ar1.mod(23,3);
	}

}
