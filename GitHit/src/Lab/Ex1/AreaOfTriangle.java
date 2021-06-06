package Lab.Ex1;

import java.util.Scanner;

public class AreaOfTriangle {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter base length of Traingle");
		double b = scan.nextDouble();
		
		System.out.println("Enter height of Triangle");
		double h = scan.nextDouble();
		
		double area = b * h / 2;
		
		System.out.println("Area of the Triangle is "+area);
	}

}
