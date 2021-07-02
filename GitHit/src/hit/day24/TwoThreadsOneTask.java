package hit.day24;

public class TwoThreadsOneTask {

	public static void main(String[] args) {
		Canon bazooka=new Canon();
		ShootingTask st=new ShootingTask(bazooka);
		
		Thread naina=new Thread(st,"naina");
		Thread shabbir=new Thread(st,"shabbir");
		
		naina.start();
		shabbir.start();
	}

}

class ShootingTask implements Runnable {
	Canon gun;
	public ShootingTask(Canon gun) {
		this.gun=gun;
	}
	@Override
	public void run() {
	 	Thread t=Thread.currentThread();
	 	if(t.getName().equals("naina")) {
	 		for (int i=0;i<5;i++) {	
	 			gun.fill();
	 		}
	 	}
	 	else if(t.getName().equals("shabbir")) {
	 		for(int i=0;i<5;i++) {
	 			gun.shoot();
	 		}
	 	}
		
	}
}
//wait and notify can be used inside a monitor
//monitor means, when u create a synchronised block(pessimistic or optimistic), it is called monitor
//when u call Wait on a thread inside a monitor, remember another thread cCAN enter monitor
// whereas when u call LLEEP on a thread inside a monitor, remember another thread CANNoT enter the monitor

class Canon{
	boolean flag;
	synchronized public void fill() {
		Thread t=Thread.currentThread();
		String name=t.getName();
		if(flag) {
			try {wait();}catch(Exception e) {}
		}
		System.out.println(name+ " fills the canon...");
		flag=true;
		notify();
	}
	synchronized public void shoot() {
		Thread t=Thread.currentThread();
		String name=t.getName();
		if(!flag) {
			try {wait();}catch(Exception e) {}
		}
		System.out.println( name+" shoots the canon..");
		flag=false;
		notify();
	}
}