package hit.day11;

public class ConsInherDemo {

}

class Shoe {
	int i;
	public Shoe() {
		System.out.println("Cons of shoe called...");
	
	}
	
	public Shoe(int i) {
		System.out.println("parametric cons of shoe called........");
	}
	
	public void met() {
		System.out.println("parent show class method called");
	}
}

class LeatherShoe extends Shoe {
	// therre is no concept of overriding in constructor
	//always the parent class default cons is called
	public LeatherShoe(int i) {
		super(343);// super class constructor- should be fisrst line of constructor
		super.i=10;//super can refer to super class method
		super.met();
		System.out.println("Cons of leather shoe called");
	}
}
// both constructors will be called in case 
// next we overload contructor
// by default non parametric contructor will be called
// to call parameteric cons use super nad it shpuld be first line of cons


/** package hit.day10;
public class ConsInherDemo {
	public static void main(String[] args) {
		Shoe shoe=new LeatherShoe(100);
	}
}
class Shoe{
	int i;
	public Shoe() {
		System.out.println("cons of shoe called....");
	}
	public Shoe(int i) {
		System.out.println("parametric constructor of shoe called....");
	}
	public void met() {
		System.out.println("parent shoe class method called...");
	}
}
class LeatherShoe extends Shoe{
	//there is no concept of over riding in constructor
	//always the parent class default constructor is called...
	public LeatherShoe(int i) {
		super(343);//super class constructor - should be the first line in the constructor
		super.i=100;//super can refer to super class variable
		super.met();//super can refer to super class method
		System.out.println("cons of leather shoe called....");
	}
}

*/