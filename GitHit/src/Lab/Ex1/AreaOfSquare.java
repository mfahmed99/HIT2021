package Lab.Ex1;

import java.util.Scanner;

public class AreaOfSquare {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter side of Square");
		double s = scan.nextDouble();
		
		double area = s * s ;
		
		System.out.println("Area of Square is "+area);

	}

}
