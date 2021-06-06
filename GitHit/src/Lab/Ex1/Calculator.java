package Lab.Ex1;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
				 
		 System.out.println("Choose an operator: +, -, *, or /");
		 char op = scan.next().charAt(0);
		
		 System.out.println("Enter first number");
		 double num1 = scan.nextDouble();
		 
		 System.out.println("Enter second number");
		 double num2 = scan.nextDouble();
		 
		 double ans;
		 
		 switch (op) {
		 
		 	case '+':{	ans = num1 + num2;
		 				System.out.println(num1 + " + " + num2 + " = "+ ans);
		 				break;}
		 
		 	case '-':{ 	ans = num1 - num2;
		 				System.out.println(num1 + " - " + num2 + " = "+ ans);
		 				break;}
		 
		 	case '*':{	ans = num1 * num2;
		 				System.out.println(num1 + " * " + num2 + " = "+ ans);
		 				break;}
		 						
		 	case '/':{	ans = num1 / num2;
		 				System.out.println(num1 + " / " + num2 + " = "+ ans);
		 				break;}
		 	default:{
		 		System.out.println("Invalid operator input");
		 		break;}
		 }
		 

	}

}
