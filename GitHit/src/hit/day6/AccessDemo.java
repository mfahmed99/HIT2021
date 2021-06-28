package hit.day6;

public class AccessDemo {
	public int pub;
	protected int pro;
	int nomod;
	private int pri;
	
	void met() {
		System.out.println(pub);
		System.out.println(pro);
		System.out.println(nomod);
		System.out.println(pri);
		
	}
}
class AccessDemoSubClass extends AccessDemo { //I have vreated a subclass
	
	void met() {
		System.out.println(pub);
		System.out.println(pro);
		System.out.println(nomod);
		//System.out.println(pri);// pri is not visible

	}
}

class AccessDemoNonSubClass {
	void met() {
		AccessDemo obj=new AccessDemo();
		System.out.println(obj.pub);
		System.out.println(obj.pro);
		System.out.println(obj.nomod);
		//System.out.println(obj.pri); // pri not available
	}
}

/**package hit.day4;
import hit.day6.AccessDemo;
public class AccessDemoDiffPackSubClass extends AccessDemo{
	void met() {
		System.out.println(pub);
		System.out.println(pro);
		System.out.println(nomod);
		System.out.println(pri);
	}
}
//private is class scope
//no modifier is package scope
//protected is relationship(inheritance) scope
//public is global scope
class AccessDemoDiffPackageNonSubClass {
	
	void met() {
		AccessDemo obj=new AccessDemo();
		System.out.println(obj.pub);
		System.out.println(obj.pro);
		System.out.println(obj.nomod);
		System.out.println(obj.pri);
	}
}
*/