package Lab.ex2;

import java.util.Scanner;

public class Student {
	String name;
	String city;
	int age;
	
	void printData() {
		System.out.println("The name of the student is "+name);
		System.out.println("The age of the student is "+age);
		System.out.println("The student lives in "+city);
	}
}

class StudentData {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		Student s1 = new Student();
		System.out.println("Enter the Student's name");
		s1.name = scan.next();
		
		System.out.println("Enter the Student's age");
		s1.age = scan.nextInt();
		
		System.out.println("Enter the Student's city of residence");
		s1.city = scan.next();
		
		s1.printData();		
		
		
		Student s2 = new Student();
		System.out.println("Enter the Student's name");
		s2.name = scan.next();
		
		System.out.println("Enter the Student's age");
		s2.age = scan.nextInt();
		
		System.out.println("Enter the Student's city of residence");
		s2.city = scan.next();
		
		s2.printData();
	
	}
}
