package com.method_overloading;

public class Arithmatic {
	public void mul(int a,int b) {
		System.out.println("Multiplication of integers="+(a*b));
	}
	public void mul(float a,float b) {
		System.out.println("Multiplication of float="+(a*b));
	}
	public void mul(double a,double b) {
		System.out.println("Multiplication of double="+(a*b));
	}
	public void mul(float a,double b) {
		System.out.println("Multiplication of float and double="+(a*b));
	}
}
