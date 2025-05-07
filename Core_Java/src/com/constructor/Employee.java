package com.constructor;

public class Employee {
	int eid;
	String name;
	double salary;
	String department;
	public Employee() {
		eid=55;
		name="PQR";
		salary=45000;
		department="fronend department";
	}
	public Employee(int eid, String name, double salary, String department) {
		
		this.eid = eid;
		this.name = name;
		this.salary = salary;
		this.department = department;
	}
	public void display() {
		System.out.println("Employee id="+eid+", Name="+name+", Salary="+salary+", Department="+department);
	}
}
