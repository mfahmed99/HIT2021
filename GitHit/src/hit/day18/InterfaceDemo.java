package hit.day18;

public class InterfaceDemo {
	public static void main(String[] args) {
		
	
	AllopathyMedicalCollege stanley=new AllopathyMedicalCollege();
	Doctor aldoc= (Doctor)stanley;// by casting we get user level right and priveleges
	aldoc.doCure();
	Nurse anur= (Nurse)stanley;
	anur.doNursing();
	
	HomeopathyMedicalCollege stmarks=new HomeopathyMedicalCollege();
	Doctor hdoc =(Doctor)stmarks;
	hdoc.doCure();
	Nurse hnur=(Nurse)stmarks;//I will get a exception at this line
	hnur.doNursing();
	
	System.out.println();
	}
}
interface Doctor{
	//There is no compulsion to have a method
	// interfaces with no method are called marker interfaces
	// you can have one or more methods 
	// An interface with only one method is called a functional interface
	public void doCure();
	// interface with more than one method is a normal interface
	//What is special about functional interface
	// Functional interfaces alone can use - Method Expressions and lambdas
	//whereas normal interfaces(more than 1 method) or marker interfaces 
	//cannot use MethodExpressions and Lambda introduced in jdk8
	//Interfaces can also have fields declared
	int i=10;// final and static even if we dont mention
	//fields are by default static and final i.e they are constants
	// interfaces can also have methods with business logic from jdk9
	default public void met() {
		System.out.println("met called..");
	}
	//default methods can be accessed only within the interface
	// they are equivalent to template method in abstract class
	
}

interface Nurse {
	public void doNursing();
}
// interface can extend another interface
interface Surgeon extends Doctor {
	
}
// Implementation class of interface
class AllopathyMedicalCollege implements Doctor, Nurse{
	@Override
	public void doCure() {
		System.out.println("doCure method called as per allopathy...");
	}
	public void doNursing() {
		System.out.println("Nursing allopathy...");
	}
}

class HomeopathyMedicalCollege implements Doctor,Nurse {
	@Override
	public void doCure() {
		System.out.println("doCure method called as per homeopathy");
	}
	public void doNursing() {
		System.out.println("Nursing homeopathy...");
	}
}


/*
 * package hit.day18;
public class InterfaceDemo {
public static void main(String[] args) {
	AlopathyMedicalCollege stanley=new AlopathyMedicalCollege();
	Doctor doctor=(Doctor)stanley;//By casting you get user level rights and previlages
	doctor.doCure();
	Nurse nurse=(Nurse)stanley;
	nurse.doNursing();
	
	HomeoPathyMedicalCollege homeoDoctor=new HomeoPathyMedicalCollege();
	Doctor doctor2=(Doctor)homeoDoctor;
	doctor2.doCure();
	Nurse nurse2=(Nurse)homeoDoctor;//I will get a exception at this line
	nurse2.doNursing();
	
	System.out.println(Doctor.i);
}
}
interface Doctor{
	//there is no compulsion to have a method
	//Interfaces with no methods are called marker interfaces
	//You can have one or more methods
	//A interface with only one method is called Functional Interface
	public void doCure();
	//interface with more than one method is a normal interface
	//What is special about functional interfaces
	//Function interfaces alone can use - Method Expressions and Lambdas.
	//where as marker or normal interfaces (interface with more than one method)
	//cannot use MethodExpressions and Lambda - introduced in jdk8
	//Interfaces can also have fields declared.
	final static int i=10;//even if you dont give it is still final and static
	//Fields are by default static and final. which means they are constants.
	//interfaces can also have methods with business logic from jdk9
	default public void met() {
		System.out.println("met called....");
	}
	//default methods can be accessed only within the interfaces
	//they are equivalent to template method of abstract classes
}
//interface can extend another interface
interface Surgeon extends Doctor{
	
}
interface Nurse{
	public void doNursing();
}
//implementation class of Interface...
class AlopathyMedicalCollege implements Doctor,Nurse{
@Override
public void doNursing() {
	System.out.println("Nursing method called....");
}
	@Override
	public void doCure() {
		System.out.println("do cure method called..as per alopathy.....");
	}
}
class HomeoPathyMedicalCollege implements Doctor{
	@Override
	public void doCure() {
		System.out.println("do cure method called ... as per homoeopathy...");
	}
}

 */ 
