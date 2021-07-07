package hit.day28;

public class GenericsRevision {
	public static void main(String[] args) {
		Child3<Ball> c31=new Child3<>();
		c31.setObj(new Ball());
		c31.getObj().play();
		
		Child3<Sweet> c32=new Child3<>();
		c32.setObj(new Sweet());
		c32.getObj().eat();
		
	}
}

class Ball {
	public void play() {
		System.out.println("Playing with ball...");
	}
}

class Sweet{
	public void eat() {
		System.out.println("Eating the sweet..");
	}
}
//1. Approach 1
// creating association btw child and other two items is
class Child{
	Ball ball;
	public void action() {
		ball.play();
	}
}// the problem is thst with above assosiaction , child is tightly coupled with ball

//2.Approach 2
class Child2{
	Object obj;
	public void action() {
		if(obj instanceof Ball) {
			Ball ball=(Ball)obj;
			ball.play();
		}
		else if(obj instanceof Sweet) {
			Sweet sweet=(Sweet)obj;
			sweet.eat();
		}
	}
}// the problem with this is though the object looks loosely coupled
//but the if-else-if ladder makes it tightly coupled
//the code is open for modification - which is considered bad code

//3. Approach 3
class Child3<T>{
	T obj;
	public void setObj(T obj) {
		this.obj=obj;
	}
	public T getObj() {
		return this.obj;
	}
}