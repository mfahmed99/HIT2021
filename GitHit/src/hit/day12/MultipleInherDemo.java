package hit.day12;
/*
 * Why Inheritance? Inher is a concect of Obj oriented analysis
 * Inheritance creates "KindOf" relationship
 * 1. Object Reusability
 * 2. create a part whole heirarchy
 * 3. composition
 * 4. eliminate if -else-if condition statements
 * 5. Polymorphic queries - 90%
 * 6. Code reusability  - 1%
 * 
 */
public class MultipleInherDemo {
	public static void main(String[] args) {
		Furqan obj=new Furqan();
		
	}
}

class LivingObject{
	
}
class Human extends LivingObject {//Java supports multi level inheritance but not multiple inheritance
	
}

class Dracula {
	
}

class Dog {
	
}
// code reusability is not the objective of inheritance
//it has many advantages
class Furqan extends Human//,Dracula,Dog {//Java doesnt allow multiple inheritance
{	
}

