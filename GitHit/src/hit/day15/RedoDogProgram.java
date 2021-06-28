package hit.day15;

public class RedoDogProgram {

}

abstract class DogExceptions extends Exception {
	
}

class DogBiteException extends DogExceptions {
	String msg;
	public DogBiteException(String msg) {
		this.msg=msg;
	}
	public String toString() {
		return this.msg;
	}
}

class DogBarkException extends DogExceptions {
	String msg;
	public DogBarkException(String msg) {
		this.msg=msg;
	}
	public String toString() {
		return this.msg;
	}
}

abstract class Item {
	public abstract void execute() throws DogExceptions;
}

class Stick extends Item {
	public void execute() throws DogBiteException {
		throw new DogBiteException("You beat I bite....");
	}
}

class Stone extends Item {
	public void execute() throws DogBarkException{
		throw new DogBarkException("I bark and chase... ");
	}
}

class Dog {
	
}

class Kid {
	public void interactWithDog() {
		
	}
}

