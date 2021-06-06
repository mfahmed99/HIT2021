package Lab.Ex1;

import java.util.Scanner;

public class PrimeCheck {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter first number");
		int num1 = scan.nextInt();
		
		int n1 = num1;
		int div =0;
		
		for(int i = 2; i <= num1/2 ; i++)
		{
		 n1 = num1 % i;
		 if(n1==0)
		 	{ 	System.out.println("It is not a Prime Number");
		 		div++;
		 		break;
		 	}
		 
		}
		if (div==0) System.out.println("It is a Prime Number");
			

	}

}
