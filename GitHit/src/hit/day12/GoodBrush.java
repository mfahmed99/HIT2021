package hit.day12;

import java.util.Scanner;

/*
 * Bad is code which is open for modification and closed for extension
 * Good - code which is closed for modification and open for extension
 * Whenever we find if-else-if conditions. apply these steps
 * 1. Convert the condition into classes
 * 2. Group them under a hierarchy
 * 3. Create an association btw the using class (PaintBrush) and the hierarchical class
 * 4. 
 * OOA principles used
 * 
 */
public class GoodBrush {

	public static void main(String[] args) {
		GoodPaintBrush brush=new GoodPaintBrush();
		RedPaint rp=new RedPaint();
		BluePaint bp=new BluePaint();
		GreenPaint gp=new GreenPaint();
		
		brush.p=gp;
		brush.doPaint();
		
	}

}

class GoodPaintBrush{ // in this the code is not modified whnever new paint is chosen
	Paint p;
	public void doPaint() {
		System.out.println(p);
	}
}

class Paint{
	
}

class RedPaint extends Paint{
	
}

class BluePaint extends Paint{
	
}

class GreenPaint extends Paint{
	
}



class BadPaintBrush {// in this paint brush the code gets modified whenever new color is chosen
	public static void main(String[] args) {
		PaintBrush brush=new PaintBrush();
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter choice of color 1=red 2=blue 3=green 4=pink");
		int choice = scan.nextInt();
		brush.doPaint(choice);
	}
	
	public void doPaint(int choice) {
		if (choice==1) {
			System.out.println("Red color...");
		}
		else if (choice==2){
			System.out.println("Blue color.......");
		}
		else if (choice==3) {
			System.out.println("Green color....");
		}
		else if (choice==4) {
			System.out.println("Pink color...");
		}
	}	
}

/**package hit.day12;
/*
 * bad - code which is open for modification and closed for extension - bad brush
 * good - code which is closed for modification and open for extension -good brush
 * 1. Whenever you find if-else-if conditions then apply this solution
 * 1. Convert the condition into classes
 * 2. Group them under a hierarchy
 * 3. create a association between the using class (PaintBrush) and the hierarchial class(Paint)
 *  ooa principles used
 *  1. Inheritance 2. Association
 *  what we achieved -
 *  1. open close principle
 *  2. Object Reusability
 
public class GoodBrush {
	public static void main(String[] args) {
		GoodPaintBrush brush=new GoodPaintBrush();
		RedPaint rp=new RedPaint();
		BluePaint bp=new BluePaint();
		GreenPaint gp=new GreenPaint();
		
		brush.rp=gp;
		brush.doPaint();
	}
}
class GoodPaintBrush{// in this paintbrush the code is not modified whenever a new color is chosen
	Paint rp;
	public void doPaint() {
		System.out.println(rp);
	}
}
class BadPaintBrush{// in this paintbrush the code gets modified whenever a new color is chosen
	public void doPaint(int choice) {
		if(choice==1) {
			System.out.println("red colour...");
		}
		else if(choice==2) {
			System.out.println("blue colour...");
		}
		else if(choice==3) {
			System.out.println("green colour...");
		}
	}
}
class Paint{
	
}
class RedPaint extends Paint{
	
}
class BluePaint extends Paint{
	
}
class GreenPaint extends Paint{
	
}
 */
