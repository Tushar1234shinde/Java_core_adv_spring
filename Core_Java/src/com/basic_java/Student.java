package com.basic_java;

public class Student {

	int sid;
	String name;
	double fees;
	int std;
	
	public void initialise(){
		sid=12;
		name="Tushar Shinde";
		fees=75000;
		std=6;
	}
	
	public void display() {
		System.out.println("Student id="+sid+", Name="+name+", Salary="+fees+", Class="+std);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student s1;
		s1=new Student();
		
		s1.initialise();
		s1.display();
		System.out.println("*******************************************************");
		Student s2;
		s2=new Student();
		s2.sid=13;
		s2.name="Govind Bhau";
		s2.fees=60000;
		s2.std=9;
		s2.display();
		
		
	}


}
