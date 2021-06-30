package hit.day22;
/**
 * Objectives of this exercise
 * How to make two threads work on a single object...
 * How to create two threads and assign two jobs
 * How to control threads
 * @author mfahm_hdcxpui
 *
 */
public class ThreadDemo4 {
	public static void main(String[] args) {
		Thread t=Thread.currentThread();
		t.setName("Furqan");
		System.out.println("Reservation started by..."+t.getName());
	
		ReservationCounter central = new ReservationCounter();
		
		Thread zaki=new Thread(new BookingJob(central,1000),"zaki");
		Thread usam=new Thread(new BookingJob(central,500),"usam");
		
		zaki.start();
		usam.start();
		
	}
}

class BookingJob implements Runnable {
	ReservationCounter central; int amnt;
	public BookingJob(ReservationCounter rc, int amnt) {
		this.central=rc;
		this.amnt=amnt;
	}
	
	
	@Override
	public void run() {
		central.bookTicket(amnt);
		central.giveChange(amnt);
		
	}
}

class ReservationCounter {
	int amnt;
	public void bookTicket(int amnt) {
		Thread t= Thread.currentThread();
		this.amnt=amnt;
		String name=t.getName();
		System.out.println(name+" has come to book the ticket...");
		System.out.println(name+ "brought..."+amnt);
		
	}
	
	public void giveChange(int amnt) {
		Thread t=Thread.currentThread();
		this.amnt=amnt;
		String name=t.getName();
		System.out.println("Change given to..."+name);
		System.out.println(name+" takes..."+(amnt-100));
	}
}
