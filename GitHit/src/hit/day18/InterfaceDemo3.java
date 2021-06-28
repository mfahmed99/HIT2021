package hit.day18;

public class InterfaceDemo3 {

	public static void main(String[] args) {
		// Lambda
		Student stud1=()->{
			System.out.println("learning method logic...");
		};
		stud1.learn();
		
		Driver driver=(String s)->{
			System.out.println("The driver logic is...");
			System.out.println("The value supplied is..."+s);
		};
		driver.drive("the light machine");
	
		Pilot pilot=(name,speed)->{
			System.out.println("Piolt logic called");
			System.out.println("Pilot name is..."+name);
			System.out.println("Pilot speed is "+speed);
			
		};
		
		pilot.fly("MFA", 1000);
	}

}
interface Student{
	public void learn();
}

interface Driver{
	public void drive(String s);
}

interface Pilot {
	public void fly(String name,int speed);
}
/**
 * package hit.day18;
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
New
8:49
package hit.day18;
public class InterfaceDemo3 {
	public static void main(String[] args) {
		//Lambda
		Student student=()->{
			System.out.println("learning method logic...");
			};
			
		student.learn();
	
		Driver driver=(String s)->{
			System.out.println("The driver logic iss....");
			System.out.println("The value supplied is...:"+s);
		};
		
		driver.drive("the light machine..");
		
		Pilot pilot=(name,speed)->{
			System.out.println("The pilot name is...:"+name);
			System.out.println("The speed is...:"+speed);
		};
		
		pilot.fly("kranthi",1000);
	}
}
interface Student{
	public void learn();
//	public void doubts();
}
interface Driver{
	public void drive(String s);
}
interface Pilot{
	public void fly(String name,int speed);
}
 */
