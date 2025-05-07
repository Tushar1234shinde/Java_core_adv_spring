package com.employee.constructor;

public class employee_constructor {
int id;
String name,designation,department;
double salary;

	public employee_constructor(int id,String name,String designation,String department,double salary) {
		this.id=id;
		this.name=name;
		this.salary=salary;
		this.designation=designation;
		this.department=department;
	}
	
	public void display() {
		System.out.println("Employee Id="+id+"\nEmployee Name="+name+"\nEmployee Salary="+salary+"\nDesignation="+designation+"\nDepartment="+department);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		employee_constructor ec= new employee_constructor(2,"Tushar","Team_leader","Software department",45000);
		ec.display();
	}

}
