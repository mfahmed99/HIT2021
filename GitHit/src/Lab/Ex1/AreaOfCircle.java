package Lab.Ex1;

import java.util.Scanner;

public class AreaOfCircle {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter radius of the Circle");
		double r = scan.nextDouble();
		
		double area = Math.PI * r * r;
		
		System.out.println("The area of the Circle is "+area);
	}

}
