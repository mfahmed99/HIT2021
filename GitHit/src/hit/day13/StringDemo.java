package hit.day13;
// String is a class and not a variable type inn JAva
// int , boolean, long, char etc are primitive type whereas steing is complex type
// String can also be crated like a primitive data type is created
public class StringDemo {

	public static void main(String[] args) {
		String s="hello";//recommended approach by default // Whole entry will be in stack
		String s1= new String("hello");// Entry"hello" will be in HEap and reference s1 will be in stack
		// there is no compulsion of which type of declaration to be used so we can use 1st approach
		System.out.println(s==s1);
		System.out.println(s.hashCode());
		System.out.println(s1.hashCode());
		System.out.println(s.equals(s1));// if hashcode is same then result will be true
		// STring objects are non mutable
		
		String temp="hello new temp world..." + s;
		// + is a concatenation operator for strings
		System.out.println(temp);
		System.out.println(s);
		
		String mystore =s;
		s=s + " new value";
		System.out.println(s);
		System.out.println(mystore);
		// string is non mutable..
		// once we declare string value, the value cannot be changed
		// when u change , then new copy of string is created
		// So be very careful when u use operations like concat/split/reverse etc on a string in indefinite loop
		
		char c=s.charAt(2);
		System.out.println(c);
		
		System.out.println(s.substring(2,4));
		System.out.println(s.equals(mystore));
		System.out.println(mystore==s1);
		System.out.println(mystore.equals(s1));
	}

}
