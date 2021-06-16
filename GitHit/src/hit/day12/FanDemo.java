package hit.day12;

import java.util.Scanner;

/*
 * Solve this code by
 * eliminating the if-else-if condition in BadFan to make it GoodFan
 * hint - use inheritance and association to solve this problem
 */
public class FanDemo {
	public static void main(String[] args) {
		/**BadFan shaitan=new BadFan();
		Scanner scan=new Scanner(System.in);
		while(true) {
			System.out.println("Press a key and enter to pull chain...");
			scan.next();
			shaitan.pull();
		} */
		
		GoodFan gf=new GoodFan();
		On on=new On();
		MediumSpeed ms=new MediumSpeed();
		HighSpeed hs=new HighSpeed();
		Off off=new Off();
		
		gf.s=on;
		gf.pullSwitch();
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

class GoodFan {
	Switch s;
	public void pullSwitch() {
		System.out.println(s);
	}
}

class Switch {
	
}

class On extends Switch {
	
}

class MediumSpeed extends Switch {
	
}

class HighSpeed extends Switch {
	
}

class Off extends Switch {
	
}
