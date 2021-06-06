package Lab.Ex1;

import java.util.Scanner;

public class AreaOfRectangle {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the length of Rectangle:");
		double l = scan.nextDouble();
		
		System.out.println("Enter the breadth of Rectangle:");
		double b = scan.nextDouble();
		
		double area = l*b;
		System.out.println("Area of Rectangle is: "+area);

	}

}
