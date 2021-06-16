package hit.day4;

import hit.day6.AccessDemo;

public class AccessDemoDiffPackSubClass extends AccessDemo {
	void met() {
	System.out.println(pub);
	System.out.println(pro);
	System.out.println(nomod);
	System.out.println(pri);
	}
}	
//private is class scope
// no mid is package scope
//

class AccessDemoDiffPackageNonSubClass {
	AccessDemo obj=new AccessDemo();
	void met() {
	System.out.println(obj.pub);
	System.out.println(obj.pro);
	System.out.println(obj.nomod);
	System.out.println(obj.pri);
	}
}	