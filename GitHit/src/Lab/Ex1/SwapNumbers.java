package Lab.Ex1;

import java.util.Scanner;

public class SwapNumbers {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter first number");
		int num1 = scan.nextInt();
		
		System.out.println("Enter second number");		
		int num2 = scan.nextInt();
		
		System.out.println("--Before Swap--");
		System.out.println("The first number = " + num1);
		System.out.println("The second number = " + num2);
		
		num1 = num1 - num2;
		num2 = num1 + num2;
		num1 = num2 - num1;
		
		System.out.println("--After Swap--");
		System.out.println("The first  number = " + num1);
		System.out.println("The second number = " + num2);
	}

}
