package hit.day14;

import java.util.Scanner;

public class ExceptionDemo5 {
	public static void main(String[] args) {
		Dog tom=new Dog();
		Child boy=new Child();
	//	Scanner scan=new Scanner(System.in);
	//	System.out.println("Please enter item..stick or biscuit");
	//	String item=scan.next();
	//	boy.playWithDog(tom,item);
		Item item=new Stick();
		boy.playWithDog(tom, item);
		
	}
}

class DogBiteException extends Exception {
	String msg;
	public DogBiteException(String msg) {
		this.msg=msg;
	}
	@Override
	public String toString() {
		return "Exception is ...+msg";
	}

}

class DogHappyException extends Exception {
	String msg;
	public DogHappyException(String msg) {
		this.msg=msg;
	}
	@Override
	public String toString() {
		return "Exception is ...+msg";
	}

}

class Dog{
	//public void play(String item) throws DogBiteException,DogHappyException {
	//	if(item.equals("stick")) {
	//		throw new DogBiteException("You beat I bite...");
	//	}
	//	else if (item.equals("biscuit")) {
	//		throw new DogHappyException("I love biscuits...");
	//	}
	//}
	
	public void play(Item item) throws DogBiteException,DogHappyException {
		item.execute();
		}
}

class Child {
	public void playWithDog(Dog tom, Item item) {
		
	}
}
/*
 * When u override, you annot throw an exception
 * Which is not thrown in parent
 */

abstract class Item {//When we have inheritance, we cannot throw exeption which is not thown in parent
	public abstract void execute() throws DogBiteException,DogHappyException; 
}

class Stick extends Item {
	public void execute() throws DogBiteException {
		throw new DogBiteException("You beat I bite..."); 
	}
}

class Biscuit extends Item {
	public void execute() throws DogHappyException {
		throw new DogHappyException ("I love biscuits....");
		
	}
}


/*
 * package hit.day14;
import java.util.Scanner;
public class ExceptionDemo5 {
	public static void main(String[] args) {
		Dog tiger=new Dog();
		Child baby=new Child();
		Scanner scan=new Scanner(System.in);
		System.out.println("please enter a item..Stick/Biscuit");
		String item=scan.next();		
		baby.playWithDog(tiger, item);
	}
}
class DogExceptions extends Exception{
	
}
class DogBiteException extends DogExceptions{
	String msg;
	public DogBiteException(String msg) {
		this.msg=msg;
	}
	@Override
	public String toString() {
		return "Exception is...:"+msg;
	}
}
class DogHappyException extends DogExceptions{
	String msg;
	public DogHappyException(String msg) {
		this.msg=msg;
	}
	@Override
	public String toString() {
		return "Exception is...:"+msg;
	}
}
class Dog{
	public void play(String item)throws DogBiteException,DogHappyException {
		if(item.equals("stick")) {
			throw new DogBiteException("You beat I bite.....");
		}
		else if(item.equals("biscuit")) {
			throw new DogHappyException("I love biscuits....");
		}
	}
}
class Child{
	public void playWithDog(Dog tiger,String item) {
		try{
			tiger.play(item);
		}catch(DogBiteException dbe) {
			System.out.println(dbe);
		}catch(DogHappyException dhe) {
			System.out.println(dhe);
		}
	}
}
 */



