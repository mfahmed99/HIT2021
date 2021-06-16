package Lab.ex2;

import java.util.Scanner;

public class Employee {
	long eid;
	String ename;
	
	public Employee(long id, String name) {
		System.out.println("Constructor was called");
		eid = id;
		ename=name;
	}
	void printEmployeeData() {
		System.out.println("Employee ID: "+eid);
		System.out.println("Employee Name: "+ename);
	}
	
	public static void main(String[] args) {
		Employee obj1 = new Employee(147852369, "Furqan");
		Employee obj2 = new Employee(369852147, "ABC");
		obj1.printEmployeeData();
		obj2.printEmployeeData();
				
	}

}
