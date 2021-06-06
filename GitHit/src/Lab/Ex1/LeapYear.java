package Lab.Ex1;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter Year");
		int year = scan.nextInt();
		
		if (year %4 == 0 || ( year % 100 ==0 && year % 400 == 0))
		{
			System.out.println("The year "+ year +" is a Leap Year");
		}
		
		else  System.out.println("The year "+ year + " is not a Leap Year");
	}

}
