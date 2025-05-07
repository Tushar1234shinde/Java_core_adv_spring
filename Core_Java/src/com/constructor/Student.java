package com.constructor;

public class Student {
	int id;
	String name;
	double marks;
	public Student() {
		id=12;
		name="Tushar";
		marks=99;
	}
	public Student(int id, String name, double marks) {
		
		this.id = id;
		this.name = name;
		this.marks = marks;
	}
	 public void showstudent() {
		 System.out.println("name="+name+"\nId="+id+"\nmarks="+marks);
	 }
}
