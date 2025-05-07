package com.basic_java;

public class employee {

	int eid;
	String name;
	double salary;
	String department;
	
	public void initialise(){
		eid=12;
		name="Tushar Shinde";
		salary=75000;
		department="Developer Department";
	}
	
	public void initialise1(int id,String nm,double sal,String dp){
		eid=id;
		name=nm;
		salary=sal;
		department=dp;
	}
	
	public void display() {
		System.out.println("Employee id="+eid+", Name="+name+", Salary="+salary+", Department="+department);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		employee emp1;
		emp1=new employee();
		
		emp1.initialise();
		emp1.display();
		System.out.println("*************************************************");
		
		employee emp2;
		emp2=new employee();
		emp2.eid=13;
		emp2.name="Govind Bhau";
		emp2.salary=60000;
		emp2.department="Testing";
		emp2.display();
		
		System.out.println("*************************************************");
		
		employee emp3 =new employee();
		emp3.initialise1(4, "Shinde", 456786, "backend");
		emp3.display();
	}

}
