package hit.day22.rev;
// Parallel processing
//1. Performance 2. Asynchronous programming
// We create thread using thread class and using Executor framework
public class ThreadRevision {
	public ThreadRevision() {
		Thread t=new Thread(new ThreadJob(),"goldentouch");
		t.start();
	}
	public static void main(String[] args) {
		//How to capture the main thread
		//All java programs run in main thread by default
		new ThreadRevision();
		Thread t=Thread.currentThread();
		System.out.println(t);
		// lazy for loop
		for (int i=0;i<5;i++) {
			// execution of child thread depends on whther main htread has interruption or not
			// interruption can happen with .sleep or sysout( same not guaranteed everytime)
			try {
				Thread.sleep(1000);
			} catch(Exception e) {}
			System.out.println(i);	
			
		}
		
		
	}
}

class ThreadJob implements Runnable {
	@Override
	public void run() {
		Thread t=Thread.currentThread();
		System.out.println("Child thread is executed..."+t.getName());
	}
}
