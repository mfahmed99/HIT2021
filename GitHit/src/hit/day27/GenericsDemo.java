package hit.day27;

public class GenericsDemo {
	public static void main(String[] args) {
		Paint paint=new RedPaint();
		Powder powder=new RosePowder();
		
		BadPaintBrush2 brush=new BadPaintBrush2();
		
		brush.obj=powder;
		brush.execute();
		
		GoodBrush<Paint> brush2=new GoodBrush<>();
		brush2.setObj(paint);
		
		Paint mypaint=brush2.getObj();
		mypaint.color();
		
		GoodBrush<Powder> brush3=new GoodBrush<>();
		brush3.setObj(new RosePowder());
		
		Powder myPowder=brush3.getObj();
		myPowder.doMakeup();
	}
}

abstract class Paint {
	public abstract void color();
}

class RedPaint extends Paint{
	@Override
	public void color() {
		// TODO Auto-generated method stub
		System.out.println("red color...");
	}
}
class BluePaint extends Paint{
	@Override
	public void color() {
		// TODO Auto-generated method stub
		System.out.println("Blue color...");
	}
}

abstract class Powder{
	public abstract void doMakeup();
}

class WhitePowder extends Powder{
	@Override
	public void doMakeup() {
		// TODO Auto-generated method stub
	System.out.println("Applying powder...");	
	}
}

class RosePowder extends Powder {
	@Override
	public void doMakeup() {
		// TODO Auto-generated method stub
		System.out.println("rose powder applied... ");
	}
}

class BadPaintBrush2 {// made paint brush generic
	Object obj;// by declaring object reference, we can consume any object
	public void execute() {// even though this opens up many possibilities, it has if-else-if
		if(obj instanceof Paint) {// which was the main reason why we made it in the first place
			Paint paint=(Paint)obj;
			paint.color();
		}
		if(obj instanceof Powder) {
			Powder powder=(Powder)obj;
			powder.doMakeup();
		}
	}
}

class BadPaintBrush1 {// this paint brush was specific
	Paint paint;// by declaring specific type, we can consume only object of htat type coz Java is strongly typed language
	public void doPaint() {
		System.out.println(paint);
	}
}

class BadPaintBrush {
	public void doPaint(int i) {
		if(i==1) {
			RedPaint rp=new RedPaint();
			System.out.println("red paint...."+rp);
		}
		else if(i==2) {
			BluePaint bp=new BluePaint();
			System.out.println("blue paint...:"+bp);
		}
	}
}

class GoodBrush<T>{
	T obj;
	public void setObj(T obj) {
		this.obj=obj;
	}
	public T getObj() {
		return obj;
	}
}