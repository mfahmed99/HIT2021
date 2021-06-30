package hit.day23;

public class OptimisticLock {
	public static void main(String[] args) {
		CounsellingHall university=new CounsellingHall();
		Thread zaki=new Thread(new CounsellingJob(university),"zaki");
		Thread usam=new Thread(new CounsellingJob(university),"usam");
		
		zaki.start();
		usam.start();
	}
}

class CounsellingJob implements Runnable{
	CounsellingHall university;
	public CounsellingJob(CounsellingHall university) {
		this.university=university;
	}
	@Override
	public void run() {
		//synchronized (university) {
			
		
		if(Thread.currentThread().getName().equals("zaki")) {
			university.table1();university.table2();
		}
		else if(Thread.currentThread().getName().equals("usam")) {
			university.water();
		}
		//}
	}
}

class CounsellingHall {
	synchronized public void table1() {// only one thread enter at a time
		System.out.println("Entered table 1..." +Thread.currentThread().getName());
		try {Thread.sleep(2000);}catch(Exception e) {}
	}
	synchronized public void table2() {
		System.out.println("Entered table 2..." +Thread.currentThread().getName());
	}
	public void water() {
		System.out.println("Entered area to drink water..." +Thread.currentThread().getName());
	}
}
