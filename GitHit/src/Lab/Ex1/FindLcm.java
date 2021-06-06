package Lab.Ex1;

import java.util.Scanner;

public class FindLcm {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter first number");
		int n1 = scan.nextInt();
		
		System.out.println("Enter second number");		
		int n2 = scan.nextInt();
		 
		int lcm = (n1 > n2) ? n1 : n2;
		
		while(true) 
		{
			 if( lcm % n1 == 0 && lcm % n2 == 0 ) 
			 {
			 System.out.println("The LCM of " + n1 + " and " + n2 + " is " + lcm );
			 break;
			 }
		 ++lcm;
		 }
		 

	}

}
