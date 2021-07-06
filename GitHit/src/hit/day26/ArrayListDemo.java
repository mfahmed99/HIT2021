package hit.day26;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;


public class ArrayListDemo {

	public static void main(String[] args) {
		//Arrays
		String s[]=new String[4];
		s[0]="hello";
		//s[1]=new Stone();// cannot be done
		//Arrays are homogenous i.e they can accept only one type which was declared 
		// array size is fixed - u cannot change array size during runtime
		
		//reading array
		for(int i=0;i<s.length;i++) {
			System.out.println(s[i]);
		}
		// new for loop - faster than conventional
		for(String str:s) {
			System.out.println(str);
		}
			
		List list=new ArrayList();
		
		list.add("hello world");
		list.add("hai");
		list.add(120);
		list.add(new Stone());
		//collections are heterogeneous - viz then can accept any object type
		// u can add as many objects as u want...
		
		for (int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		
		// new for loop
		for(Object o:list) {
			System.out.println(o);
		}
		//but collections provide more methods to read
		Iterator iter=list.iterator();// like an index to find something
		// faster than for loop
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		// cursor created by iterator are forward only cursor and its fail fast- once read cannot be reused
		// List iterator has the advantage of moving the cursor back and forth
		
		ListIterator listIter=list.listIterator();
		
		// list.add("aaaaaaaaaaaaaaaaaa"); u will get concurrent modification exception
		// if u add something to the main collection after creating the iterator
		
		while(listIter.hasNext()) {
			System.out.println(listIter.next());
		}
		while(listIter.hasPrevious()) {
			System.out.println(listIter.previous());
		}
	}
}

class Stone {
	
}
