package com.constructor;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("\n");
		System.out.println("________________Employee Details____________________");
Employee e1,e2,e3;
e1=new Employee();

e1.display();
System.out.println("*************************************************");

e2=new Employee();
e2.eid=23;
e2.name="ABC";
e2.salary=25000;
e2.department="web dev";
e2.display();
System.out.println("*************************************************");

e3=new Employee();
e3.eid=13;
e3.name="XYZ";
e3.salary=29000;
e3.department="backend dev";
e3.display();
System.out.println("*************************************************");
System.out.println("\n\n");



System.out.println("_______________Product Details____________________");
Product p1,p2,p3;
p1=new Product();
p1.display();
System.out.println("*************************************************");

p2=new Product();
p2.pid=11;
p2.brand="lenovo";
p2.price=60000;
p2.p_name="laptop";
p2.display();
System.out.println("*************************************************");


p3=new Product();
p3.pid=12;
p3.brand="Asus";
p3.price=70000;
p3.p_name="laptop";
p3.display();
System.out.println("*************************************************");

System.out.println("\n\n");



System.out.println("_______________Student Details____________________");
Student s1,s2,s3;
s1=new Student();
s1.showstudent();
System.out.println("*************************************************");

s2=new Student();
s2.id=50;
s2.name="Pritam";
s2.marks=89;
s2.showstudent();
System.out.println("*************************************************");


s2=new Student();
s2.id=51;
s2.name="Nishant";
s2.marks=87;
s2.showstudent();
System.out.println("*************************************************");
	}

}
