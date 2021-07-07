package hit.day28;

import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Vector;

public class ColDemo3V {
	public static void main(String[] args) {
		Vector<String> list=new Vector<>(10,5);//Initial capacity is 10, incremental capacity is 5
		//first fill till 10, then 5 will increment, then after filling 15 , size becomes 20 and so on
		//Vector is legacy class
		//Vector is a combination of lines circles quadis etc in ENglish
		//Vector was introduced when list was not really developed
		//After lists became strong, vector was available but not used so extensively
		//A vector class is by default synchronised
		list.add("Hang");
		list.add("him");
		list.add("hello");
		list.add("world");
		list.add("hi");
		
		System.out.println(list);
		
		list.ensureCapacity(10);
		
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
		
		ListIterator<String> liter=list.listIterator();//in list iter we cannot add after making listIterator
		//list.dd("newvalue"); fails as concurrent .. is not possible
		while(liter.hasNext()) {
			System.out.println(liter.next());
		}
		while(liter.hasPrevious()) {
			System.out.println(liter.previous());
		}
		
		Enumeration<String> en=list.elements();// in enumeration, we can add after getting enumeration
		while(en.hasMoreElements()) {
			System.out.println(en.nextElement());
		}
	}
}
