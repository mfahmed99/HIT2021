package hit.day13;

import java.util.Scanner;

/*
 * 1. Convert the condition to classes
 * 2. Group them under one hierarchy
 * 3. Create an association between the using class and hierarchy class
 * 
 * Design Patterns - STrategy Pattern
 * 
 * a strategy to remove if-else-if condition
 * a strategy to implement open-close principle
 */
public class GoodFanDemo {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		//BadFan shaitan=new BadFan();
		GoodFan khaitan = new GoodFan();
		while(true) {
			System.out.println("Press a key and enter to pull chain...");
			scan.next();
			//shaitan.pull();
			khaitan.pull();
		}
		
	
	}
}
/*Paintbrush followed uni-directional relationship
 * Whereas fan follows bi-directional relationship
 */
class GoodFan {
	State state=new SwitchOffState();
	public void pull() {
		state.pull(this);
	}
}

abstract class State {
	public abstract void pull(GoodFan gf); // makes this method compulsory to be OVERRIDEn in child classes
	// if we miss writing this method in child class, we get compilation error
	//
}

class SwitchOffState extends State {// condition class grouped under a category
	public void pull(GoodFan fan) {
		System.out.println("Switch On state...");
		fan.state = new SwitchOnState();
	}
}

class SwitchOnState extends State {
	public void pull(GoodFan fan) {
		System.out.println("Medium Speed state...");
		fan.state = new MediumSpeedState(); 
	}
}	

class MediumSpeedState extends State {
	public void pull(GoodFan fan) {
		System.out.println("High Speed state...");
		fan.state = new HighSpeedState(); 
	}
}

class HighSpeedState extends State {
	public void pull(GoodFan fan) {
		System.out.println("Switch Off state...");
		fan.state = new SwitchOffState();
	}
}

class BadFan {
	int state=0;
	public void pull() {
		if (state==0) {
			System.out.println("Switch on state");
			state=1;
		}
		else if (state==1){
			System.out.println("Medium speed State");
			state=2;
		}
		else if (state==2) {
			System.out.println("High speed State");
			state=3;
		}
		else if (state==3) {
			System.out.println("Switch Off state");
			state=0;
		}
	}
}



