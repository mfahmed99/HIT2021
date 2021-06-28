package hit.day14;

public class ExceptionDemo2 {
	public static void main(String[] args) {
		System.out.println("Before Exception...");
		//Integer.parseInt - will convert string to a number
		int num=0;
		try {
			num=Integer.parseInt(args[0]);//the program gets terminated at this point
			System.out.println("Immediate line after exception...");
		}
		catch(ArithmeticException ae){
				System.out.println("Logic to handle arithmetic exception");
				num++;
			}
			catch (ArrayIndexOutOfBoundsException aoe) {
				num=1;
			}
			catch (NumberFormatException e) {
				num=1;
			}
			catch(Exception e) {// put global exception at end always
				// if put on top, then it will capture the exception and code shows 
				//
				System.out.println("Global exception handling common code...");
				num=1;
			}
		finally {// can be attached to try catch block
			System.out.println("Finally called...");
			num=1;
		}
		
		int i=1/num;
		System.out.println("Value of i is...:"+num);
		System.out.println("After exception...");
	
	}
}

//we want to eliminate if-else-if
/*
* There are two thing we have to do for exception handling
* 
* 1. Stop the abryupt termination of your application - VV IMp - Relief
* 2. Give alternate flow - Optional - Rehabilitation
* Finally
* Finally is a block of code which gets ececuted at all times
* Whetehr an xcption arises or not, Finally is executed
* Whether an exception is handled or not
* FInally is executed

*
*
*
*
*
*
*
*
*
*package hit.day14;
public class ExceptionDemo2 {
	public static void main(String[] args) {
		System.out.println("Before Exception....");
		//Integer.parseInt - will convert a string to a number
		int num=0;
		try {
			num=Integer.parseInt(args[0]);
			int i=1/num;//the program gets terminated at this point....
			System.out.println("immediate line after exception...");
		}		
//		catch(ArithmeticException ae) {
//				System.out.println("logic to handle arithmetic exception");
//			//	num=1;
//			}
		catch(ArrayIndexOutOfBoundsException aoe) {
			//	num=1;
			}
//		catch(Exception e) {
//			System.out.println("global exception handling code...common code");
//			//num=1;
//		}
		finally {
			System.out.println("finally called...");
			num=1;
		}
		int i=1/num;
		System.out.println("value of i is...:"+num);
		System.out.println("After Exception....");
	}
}
/*
 *There are two things u have to do for exception handling
 *
 * 1.  Stop the abrupt termination of your application. - very important - Relief
 * 2.  Give a alternate flow- optional - we will talk about it later. - Rehabilitation
 * Finally
 * Finally is a block of code which gets executed at all times.
 * - Whether an exception arises or not, finally is executed
 * - whether an exception is handled or not, finally is executed..
 *
*/
*/