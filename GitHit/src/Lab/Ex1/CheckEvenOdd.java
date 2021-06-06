package Lab.Ex1;

import java.util.Scanner;

public class CheckEvenOdd {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a number");
		int num1 = scan.nextInt();
		
		if ( num1 % 2 == 0 )
			 System.out.println("The number is Even");
		else
			 System.out.println("The number is Odd");

	}

}
