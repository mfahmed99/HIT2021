package hit.day25;

public class GarbageDemo {
	public static void main(String[] args) {
		Runtime r=Runtime.getRuntime();
		System.out.println("Free memory..."+r.freeMemory());
		GrandFather dada=new GrandFather();
		System.out.println("After dada object created..."+r.freeMemory());
		
		String s="Hello";
		String temp=s;
		String s2=s+" world";
		
		System.out.println(temp);
		
		StringBuffer sb=new StringBuffer("Hello");
		StringBuffer sbtemp=sb;
		sb.append(" world");
		System.out.println(sbtemp);
	}
	
}

class GrandFather {
	//String age;
	//StringBuffer age=new StringBuffer();
	StringBuilder age=new StringBuilder();
	public GrandFather() {
		for(int i=0;i<10000;i++) {
			//age=new String("100"+i);
			age.append("aaa"+i);
		}
	}
}
