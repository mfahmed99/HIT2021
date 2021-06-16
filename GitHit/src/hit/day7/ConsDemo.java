package hit.day7;

public class ConsDemo {
	public ConsDemo() {
		System.out.println("Cons is called.......");
	}
	
	public ConsDemo(int i) {
		System.out.println("Overloaded cons called.......");
	}
	
	public ConsDemo(String s) {
		System.out.println("String cons called........");
	}
	public ConsDemo(int i, String s) {
		System.out.println("Multiparameter cons called ......");
	}
	
	public static void main(String[] args) {
		ConsDemo obj=new ConsDemo(1,"buhbye");
		ConsDemo obj1=new ConsDemo("buhbye");
		ConsDemo obj2=new ConsDemo(1);
		ConsDemo obj3=new ConsDemo();
		// the name of the concept is - Virtual Method Invocation(VMI)
		//only one constructor can be called when one object is created
		obj.met();
		obj.met(0);
	}
	
	//METHOD OVERLOADING
	
	void met() {
		System.out.println("Method without parameter called");
	}
	void met(int i) {
		System.out.println("method with cinstructor called");
	}

}
 /**package hit.day7;
//Constructor overloading..
public class ConsDemo {
	public ConsDemo() {
		System.out.println("cons called...");
	}
	
	public ConsDemo(int i) {
		System.out.println("overloaded cons called...");
	}
	
	public ConsDemo(String s) {
		System.out.println("string constructor called...");
	}
	
	public ConsDemo(int s,String str) {
		System.out.println("multi parameter constructor called...");
	}
	public static void main(String[] args) {
		ConsDemo obj1=new ConsDemo(100,"hello");
		ConsDemo obj2=new ConsDemo();
		
		obj2.met();
		obj2.met(1);
		//the name of the concept is - Virtual Method Invocation (VMI)
		//only one constructor can be called when one object is created...
	}
	
	void met() {
		System.out.println("method without parameter called...");
	}
	void met(int i) {
		System.out.println("method with parameter called...");
	}
}*/