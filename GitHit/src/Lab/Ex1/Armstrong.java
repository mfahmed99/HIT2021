package Lab.Ex1;

import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a number");
		int num = scan.nextInt();
		
		int nod = 0;
		int n1 = num;
		
		while(n1 >= 1)
		{
			n1 = n1 / 10;
			nod++;
		}
		
		n1 = num;
		int rem, ans = 0;
		while (n1 != 0)
		 {
		 rem = n1 % 10;
		 ans += Math.pow(rem, nod);
		 n1 /= 10;
		 }
		
		if(ans == num)
			 System.out.println("The number is an Armstrong number.");
		else
			 System.out.println("The number is not an Armstrong number.");
	}

}
