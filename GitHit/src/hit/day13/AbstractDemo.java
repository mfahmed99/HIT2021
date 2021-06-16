package hit.day13;

public class AbstractDemo {

	public static void main(String[] args) {
		// you cannot create an object of abstract class
		//new Parent();//Throws an error
		Child ch=new Child();
		ch.yourSayHello();
		ch.mySayHello();
	}

}
/*
 * final variables cannot be changed
 * final classes cannot be inherited
 * final methods cannot be overriden
 * 
 * When an abstract class extends another abstract class,(grandparent extended by parent
 * the child class need not override the parent aabstrat class method
 * But the final child class it is mandatory to override the abstract method
 */

abstract class GrandParent {
	abstract public void met(); 
}
abstract class Parent extends GrandParent {
	//condition 2 - Can I have a constructor inside abstract class
	// answer : yes you can
	
	public Parent() {
		System.out.println("Parent abstract class cons called..");
	}
	public abstract void yourSayHello();
	final public void mySayHello() {//Final methods cannot be overriden
		System.out.println("Say hello as per the abstract class norms");
	}
}
//Abstract classes can have non abstract methods

//When you create object of child class , parent (abstract class) cons get called
class Child extends Parent {
	public void met() {
		
	}
	public Child() {
		System.out.println("Child class of abstrat parent object created hence cons called");
	}
	@Override
	public void yourSayHello() {
		System.out.println("say hello as per the child logic..dr norms..");
	}
	
	//public void mySayHello() {
	//	System.out.println("Write my own logic...");
	//}
}