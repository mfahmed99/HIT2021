package hit.day7;

public class IfElseIf {

	public static void main(String[] args) {
		int i=21;
		if(i>20) {
			System.out.println("i is greater than 20");
		}
		else if(i==10) {
			System.out.println("i is equal to 10");
		}
		else {
			System.out.println("i is lesser than 20");
		}
		
		IfElseIf obj=new IfElseIf();
		String result=obj.met(i);
		System.out.println("The result is "+result);
		
		boolean b=false;
		obj.met3(b);
		
		String s="Hello";
		obj.met4(s);
	}
	
	String met(int i) {
			if(i==10 || i<10) {
				return "Equal to 10 or lesser than 10";
			}
			else 
				return "Not equal to 10";
		}
	
	String met2(int i) {
		if(i%2==0 && i>20) {
			return "Condition satisfied";
		}
		else 
			return "Condition not satisfied";
	}
	
	void met3(boolean valid) {
		if(valid==true ) {
			System.out.println("the value of valid is true");
		}
		else {
			System.out.println("The value of valid is false");
		}
	}
	
	void met4(String s) {
		if(s.equals("hello")) {// when string is compared we cannot use == but use s.equals and use s.equalignorecase to ignore capital small letter differences 
			System.out.println("The string is hello");
		}
		else {
			System.out.println("Not equal to hello");
		}
	}
		
}
// if else creates ladder of structure harmful for performance
//it creates static binding i.e makes program rigid



/**package hit.day7;
public class IfElseDemo {
public static void main(String[] args) {
	int i=18;
	if(i>20) {
		System.out.println("i is less than 20");
	}
	else if(i==10) {
		System.out.println("i is equal to ten....");
	}
	else
	{
		System.out.println("i is greated than 20");
	}
	
	IfElseDemo obj=new IfElseDemo();
	String result=obj.met(i);
	System.out.println("The result is..:"+result);
	
	boolean b=false;
	obj.met3(b);
	
	String str="hello";
	obj.met4(str);
}

String met(int i) {
	if(i==10 || i<20) {
		return "Condition satisfied...";
	}
	else {
		return "condition is not satisfied";
	}
}
String met2(int i) {
	if(i%2==0 && i>20) {
		return "Condition satisfied...";
	}
	else {
		return "condition is not satisfied";
	}
}
void met3(boolean valid) {
	if(valid) {
		System.out.println("the value of vaid is true....");
	}
	else {
		System.out.println("the value of valid is false....");
	}
}

void met4(String s) {
	if(s.equalsIgnoreCase("Hello")) {
		System.out.println("the value of string is hello...");
	}
	else {
		System.out.println("not equal......");
	}
}
}
*/