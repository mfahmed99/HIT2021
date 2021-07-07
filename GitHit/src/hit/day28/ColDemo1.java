package hit.day28;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ColDemo1 {
	public static void main(String[] args) {// performance is hindered if we keep adding to collection
		// so we can declare initial capacity to improve performance
		List<String> list=new ArrayList<>(10);// So we are declaring size initially here
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
