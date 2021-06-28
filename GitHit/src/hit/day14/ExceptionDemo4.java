package hit.day14;
import hit.day14.InvalidCardException;

public class ExceptionDemo4 {

	public static void main(String[] args) {
		//String cardValidity=args[0];
		ATM atmUser=new ATM();
		try {
			atmUser.insertCard("valid");
		} catch(InvalidCardException ice) {
			System.out.println(ice);
			System.out.println("Action or logic... invalid card");
		}
		System.out.println("Normal Transaction...");
	}

}

class ATM {
	public void insertCard(String cardValidity) throws InvalidCardException {// caller of method should compulsory handle exception
		if(cardValidity.equals("valid")) {
			System.out.println("I will process the card...");
		}
		else {
				throw new InvalidCardException("You have inserted an invalid card");
			
			}
	}
	
}


	/*
	 * package hit.day14;
public class ExceptionDemo4 {
	public static void main(String[] args) {
		ATM atmUser=new ATM();
		try {
			atmUser.insertCard("invalid");
		}catch(InvalidCardException ice) {
			System.out.println(ice);
			System.out.println("Action or logic ....for invalid card...");
		}
		System.out.println("normal transaction....");
		
	}
}
class ATM{
	public void insertCard(String cardValidity)throws InvalidCardException {
		if(cardValidity.equals("valid")) {
			System.out.println("I will process the card....");
		}
		else {
				throw new InvalidCardException("You have inserted a invalid card....");	
			}
		}
}
	 */
