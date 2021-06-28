package hit.day14;

public class ExceptionDemo1 {

	public static void main(String[] args) {
		System.out.println("Before Exception...");
		//Integer.parseInt - will convert string to a number
		int num=0;
		try {
			num=Integer.parseInt(args[0]);//the program gets terminated at this point
			System.out.println("Immediate line after exception...");
		}catch(Exception e){
			if (e instanceof ArithmeticException){
				System.out.println("Logic to handle arithmetic exception");
				num++;
			}
			else if (e instanceof ArrayIndexOutOfBoundsException) {
				num=1;
			}
			else if (e instanceof NumberFormatException) {
				num=1;
			}
			
		}
		int i=1/num;
		System.out.println("Value of i is...:"+num);
		System.out.println("After exception...");
	}

}// we want to eliminate if-else-if
/*
 * There are two thing we have to do for exception handling
 * 
 * 1. Stop the abryupt termination of your application - VV IMp - Relief
 * 2. Give alternate flow - Optional - Rehabilitation
 */

