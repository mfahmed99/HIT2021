package hit.day22;
/**
 * Threading
 * Critical path -  The max limit or time within which we need to complete a task
 * Asynchronous Work / execution - we use threads. Synchronous means we do it, asynch means we get it done by someone
 * A layer of indirection is also achieved thru threading
 */
public class ThreadDemo1 {
	public static void main(String[] args) throws Exception {
		// by default java runs a main thread
		Thread t=Thread.currentThread();
		t.setName("This is my main thread");
		t.setPriority(10);
		System.out.println("Now Thread sleeps for 5 seconds");
		Thread.sleep(5000); //5000 milliseconds
		met();
		System.out.println(t);
		// >>Thread[main,5,main]
		//>>Thread[ name,priority,group ] priority is 1-10  1 is low, 10 is highest
		// thread always runs in sequence but we can disrupt the sequence
		//sleep delays the execution
		for(int i=0;i<5;i++) {
			System.out.println(i);
			Thread.sleep(1000);
		}
	}
	
	static void met() throws Exception {
		System.out.println("method is called...");
		Thread.sleep(5000);
	}
}
