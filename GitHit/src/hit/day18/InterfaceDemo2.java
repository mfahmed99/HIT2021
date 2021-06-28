package hit.day18;

public class InterfaceDemo2 {
	public void myMet() {
		System.out.println("My met called....");
	}
	public static void main(String[] args) {
	Teacher teacher=new InterfaceDemo2()::myMet;// this technique is called Method Expression
	// Method expression works only on functional interfaces
	teacher.doTeach();
	
	teacher=new InterfaceDemo2()::myMet2;
	}
	
	public void myMet2() {
		System.out.println("Another my MEt 2 called...");
	}
}

interface Teacher {
	public void doTeach();
}

/**
package hit.day18;
public class InterfaceDemo2 {
	public static void mySomeMethod() {
		System.out.println("my some method is called...");
	}
	
	public void myAnotherMethod() {
		System.out.println("my another logic is called...");
	}
	public static void main(String[] args) {
		Teacher teacher=InterfaceDemo2::mySomeMethod;//this technique is called Method Expression
		//Method expressions work only on functional interfaces
		teacher.doTeach();
		
		teacher=new InterfaceDemo2()::myAnotherMethod;
		teacher.doTeach();
	}
}
//any interface with one method is called functional interface..
//advantage - u can use method expressions and lambda techniques
interface Teacher{
	public void doTeach();
	//public void doTalk();
}
*/