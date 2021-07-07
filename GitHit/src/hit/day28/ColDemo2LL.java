package hit.day28;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ColDemo2LL {

	public static void main(String[] args) {
		//ArrayList is suitable for storage
		// LinkedList is used to declare list once
		//used while networking and communication
		//we transfer objects from one place to another, we transfer them thru linkedlist
		//if data is being transferred thru network, due to latency we may get incomplete data
		//if error has occurred or data is incomplete, the data will have a missing link
		//Using LL which indicates that something is missing
		//This problem is called repundiation problem
		List<String> list=new LinkedList<String>();
		
		list.add("Hang");
		list.add("him");
		list.add("hello");
		list.add("world");
		list.add("hi");
		
		System.out.println(list.get(0));// gets me hello
		System.out.println(list.size());// gives size as 3
		System.out.println(list.contains("hola"));// checks whether entered thing is contained in list and gives true if found
		System.out.println(list);
		Collections.sort(list);// Collections is a utility which gives us some operations on, lists
		System.out.println(list);
		System.out.println(list.isEmpty());//checks whether list is empty
		list.remove(0);// can pass index or value to be removed from list
		System.out.println(list);
		list.set(1, "newval");// used to replace existing one at that place
		System.out.println(list);
		Object s[]=list.toArray();
		
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		
		for(String str:list) {
			System.out.println(str);
		}
		
		Iterator<String> iter=list.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		System.out.println(iter.hasNext());
		
		ListIterator<String> liter=list.listIterator();
		while(liter.hasNext()) {
			System.out.println(liter.next());
		}
		while(liter.hasPrevious()) {
			System.out.println(liter.previous());
		}
	}
		
}


