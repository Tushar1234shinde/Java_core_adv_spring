package com.getter_setter;

public class Student {

	int id;
	String name;
	double marks;
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
	public double getMarks() {
		return marks;
	}
	public void setMarks(double marks) {
		this.marks = marks;
	}
 public void showstudent() {
	 System.out.println("name="+name+"\nId="+id+"\nmarks="+marks);
 }

}
