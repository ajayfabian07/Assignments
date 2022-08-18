package com.te;

public class Employee {
	int eid; // instance variable
	String emp_name; // instance variable
	double salary; // instance variable
	int age;//instance variable
	String designation;//instance variable
	static String ORGANISATION="TECHNO ELEVATE";//Global Variable or static Variable
	static {
		System.out.println("Static Block Executed");
	}
	
	public void display() {
		System.out.println("Employee ID is :" +eid);
		System.out.println(emp_name);
		System.out.println(salary);
		System.out.println(age);
		System.out.println(designation);
		
	}
	public static void main(String[] args) {//args is a local variable declared within the method block
		Employee employee=new Employee();
		employee.eid=100;
		employee.emp_name="Ram";
 		//System.out.println(employee.eid + " " + employee.emp_name + " " + employee.age);
		System.out.println(ORGANISATION);
 		employee.display();
 		//employee.main();
 		main(5);

	}
//	public void main() {
//		System.out.println("Test"); //method overloading from non static to static
//	}
	public static void main(int a) {
		System.out.println("Test1");//method overloading from static to static
		
	}
}
