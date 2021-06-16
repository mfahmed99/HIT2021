package hit.day7;

import java.util.Scanner;

public class SimpleDemo3 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
			
		System.out.println("Input a number");
		int num=scan.nextInt();
		
		System.out.println("Input when to stop");
		int num2=scan.nextInt();
		
		while(true) {
			if(num%2==0) {
				System.out.println("Even number..."+num);
			}
			else if(num==num2) {
				System.out.println("Break the loop......."+num);
				break;
			}
			num--;
		}
		
	}

}
