package Lab.Ex1;

import java.util.Scanner;

public class QuotientAndRemainder {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter first number");
		int num1 = scan.nextInt();
		
		System.out.println("Enter second number");		
		int num2 = scan.nextInt();
		
		int quotient = num1 / num2;
		int remainder = num1 % num2;
				 
		System.out.println("The Quotient is: " + quotient);
		System.out.println(" The Remainder is: " + remainder);
	
	
	
	}

}
