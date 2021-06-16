package hit.day7;

import java.util.Scanner;

public class SimpleDemo2 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Input a number");
		int num=scan.nextInt();
		
		System.out.println("Input when to stop");
		int num2=scan.nextInt();
		
		for(int i=0 ; i<num ;i++) {
			if(i%2==0) {
				System.out.println("The even number in the series .." +i);
			}
			else if(i==num2) {
				System.out.println("Job over....");
				break;
			}
		}
	}

}
