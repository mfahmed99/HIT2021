package hit.day27;

import java.util.ArrayList;
import java.util.List;

public class GenericsInCollection {
	public static void main(String[] args) {
		List list=new ArrayList();
		List<String> lst=new ArrayList<>();// u are using generic collection of jdk to make it specific
		//making specific can avoid runtime exception
		// now lst only accept string values
		list.add("aaaaaa");
		list.add(new Box());
		list.add(12345);
		
		lst.add("aaaaaa");
		//lst.add(new Box()); these two will give compile time exception
		//lst.add(12345);
		
		//process this collection
		
		//String s=(String)list.get(1); 
		//String s2=(String)list.get(2);// no compile time error in this but runtime error as 2 is not a string
		// to avoid runtime error, we should know h=which type of object it is while writing code which is not always possible
		
		for(Object ob:list) {
			if(ob instanceof String) {
				String ss=(String)ob;
				System.out.println(ss);
			}
			else if(ob instanceof Box) {
				Box bb=(Box)ob;
				System.out.println(ob);
			}
		}
	
	}
}

class Box {
	
}
