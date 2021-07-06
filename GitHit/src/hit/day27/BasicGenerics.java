package hit.day27;

public class BasicGenerics {
	public static void main(String[] args) {
		Ball obj=new Ball();
		Sky sky=new Sky();
		
		//Accept accept=new Accept();
		//accept.obj=sky; GIVES exception but sjows no error at compile time
		//accept.obj=obj;
		
		//accept.process();
		
		RightAccept<Ball> raccept=new RightAccept<>();
		raccept.setT(obj);;
		
		RightAccept<Sky> raccept2=new RightAccept<>();
		raccept2.setT(sky);
		
		Ball ball=raccept.getT();
		
		Sky s=raccept2.getT();
	}
}

class Ball {
	
}

class Sky{
	
}

class RightAccept<T> {
	T obj;
	public T getT() {
		return obj;
	}
	public void setT(T obj) {
		this.obj=obj;
	}
}

class Accept {
	Object obj;// declaring object like this is actually a bad practice as it can accept anything
	// and create runtime problems
	public void process() {
		if(obj instanceof Ball) {
			Ball ball=(Ball)obj;
			System.out.println(ball);
		}
		else if(obj instanceof Sky) {
				Sky sky=new Sky();
				System.out.println(sky);
		}
	}
}
