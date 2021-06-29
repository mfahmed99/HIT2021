package hit.day22;

public class ThreadDemo3 {
	public static void main(String[] args) {
		Thread t=new Thread(new Job());
		t.start();// .start used to call run method
		
	}
}

class Job implements Runnable {
	@Override
	public void run() {
		System.out.println("Thread execution logic...");
		
	}
}