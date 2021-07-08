package hit.day28;
//homework - stack and queue

import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class ColDemo4 {
	//SetCollection is the list used
	//to avoid duplication
	//for storing large data
	//Automatically has index
	//array list stores data in same memory location, when limit reached of single block, it will say no more space
	//it wont occupy other clusters
	//Vector used when we want RandomAccess
	//In Set
	//2 types Hash set and Tree set, tree set being much faster
	//Tree set sorts using bubble sort contents in order and everytime add or deletion is made
	//rearrangement is made thus more speed
	public static void main(String[] args) {
		
		//Set<String> set=new HashSet<String>();
		Set<String> set=new TreeSet<String>(new MyComparator());//arranged in order
		set.add("hello");
		set.add("hi");
		set.add("hello");// wont add as we cannot have duplicates
		set.add("world");
		set.add("earth");
		
		System.out.println(set);
		set.add("zebra");
		set.add("AllMight");
		
		System.out.println(set);
		
		Iterator iter=set.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		
		for(String s:set) {
			System.out.println(s);
		}
	}
}

class MyComparator implements Comparator<String> {
	@Override
	public int compare(String o1, String o2) {
		
		//return o1.compareTo(o2) ;// ascending order sorting of set elements
		return o2.compareTo(o1);// descending order sorting of elements
	}
}
