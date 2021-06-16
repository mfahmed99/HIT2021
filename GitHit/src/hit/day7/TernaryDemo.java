package hit.day7;

public class TernaryDemo {

	public static void main(String[] args) {
		// ? - ternary operator
		String result=(30<20)?"10 is not greater than 20":"10 is greater than 20";
		//(expression) ? "true" : "false"
		System.out.println(result);
		int i=10;
		String number=(i%2==0)?"Even number":"Odd number";
	}

}

/**package hit.day7;
public class TernaryDemo {
public static void main(String[] args) {
	// ? - ternary operator
	String result=(30<20)?"10 is lesser than 20":"10 is not lesser than 20";
	int i=11;
	String number=(i%2==0)?"Even number...":"odd number...";
	
	System.out.println("Number is...:"+number);
	//(expression)  ?  "true": "false";
}
}*/