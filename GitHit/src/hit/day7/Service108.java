package hit.day7;

public class Service108 {
	void help(Police p) {
		System.out.println("Caller is policeman... connect witj control room");
	}
	void help (AccidentVictim a) {// only accepts victim input
		System.out.println("The caller is accident victim... connect doctor");
	}
	void help (Object o) {// Object o accepts any input
		if(o instanceof Police) {
			System.out.println("Police...");
		}
		// Overloading >>> if else if as if else if creates ladder in memory and hinders performance
		else if (o instanceof AccidentVictim) {
			System.out.println("Accident Victim....");
		}
		else if(o instanceof Helper) {
			System.out.println("Write condition of Helper");
		}
		System.out.println("The caller is helper... Connect to needy");
	}
	public static void main(String[] args) {
		Service108 obj108=new Service108();
		Police captain=new Police();
		AccidentVictim ac=new AccidentVictim();
		Helper ramaswamy= new Helper();
		
		obj108.help(ramaswamy);
		
	}

}


class Police{
	
}

class AccidentVictim {
	
}

class Helper {
	
}
/**package hit.day7;
public class Service108 {
void help(Police p) {
	System.out.println("the caller is a police man... let connect with control room");
}
void help(AccidentVictim a) {
	System.out.println("the caller is a accident victim...let connect with doctor...");
}
void help(Helper h) {
	System.out.println("the caller is a helper....let us help him....");
}
//void help(Object o) {
//	if(o instanceof Police) {
//		System.out.println("police...");
//	}
//	else if(o instanceof AccidentVictim) {
//		System.out.println("accident victim...");
//	}
//	else if(o instanceof Helper) {
//		System.out.println("write logic for helper...");
//	}
//}

public static void main(String[] args) {
	Service108 obj108=new Service108();
	Police captain=new Police();
	AccidentVictim ac=new AccidentVictim();
	Helper ramasamy=new Helper();
	
	obj108.help(ramasamy);
}
}
class Police{

}
class AccidentVictim{

}
class Helper{

}





*/