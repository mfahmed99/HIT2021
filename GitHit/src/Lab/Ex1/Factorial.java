package Lab.Ex1;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a number");
		int num = scan.nextInt();
		
		int ans = 1;
		
		for (int i = num ; i > 0 ; i-- )
		{
			ans = ans * i;
		}
		
		System.out.println("The factorial of the number is "+ ans);
	}

}
