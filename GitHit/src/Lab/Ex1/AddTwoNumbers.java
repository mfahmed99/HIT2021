package Lab.Ex1;

import java.util.Scanner;

public class AddTwoNumbers {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter first number");
		int num1 = scan.nextInt();
		
		System.out.println("Enter second number");		
		int num2 = scan.nextInt();
		 System.out.println("Sum of the numbers: "+(num1 + num2));

	}

}
