package Lab.Ex1;

import java.util.Scanner;

public class Power {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the number");
		int num = scan.nextInt();
		
		System.out.println("Enter the exponent");		
		int exp = scan.nextInt();
		
		int x = exp;
		long ans = 1;
		 while (exp != 0) {
		 ans = ans * num;
		 exp--;
		 }
		 System.out.println(num + " raised to the power " + x + " is " + ans);

	}

}
