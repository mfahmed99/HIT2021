package hit.day23;
// sopl are interrupting thread and hence no order in every execution
// ISOLATION achieved in JAVA by keyword synchronized()
// synchronized used only when a thread is critical
//threads are dependent on OS, Java threads was tried based on Linux and Unix
public class TwoThreadDemo {

	public static void main(String[] args) {
		ReservationCounter central=new ReservationCounter();
		Thread usam=new Thread(new TicketBooking(central, 1000),"usam");
		Thread zaki=new Thread(new TicketBooking(central, 500),"zaki");
		
		usam.start();
		zaki.start();

	}

}

class TicketBooking implements Runnable{
	ReservationCounter central=new ReservationCounter(); int amnt;
	public TicketBooking(ReservationCounter central, int amnt) {
		this.central=central;
		this.amnt=amnt;
		
	}
	@Override
	public void run() {
		synchronized (central) {// used to ISOLATE threads so that  we don't get incorrect output 
		central.bookTicket(amnt);
		central.getChange();
		}
	}
}

class ReservationCounter{
	int amnt;
	public void bookTicket( int amnt) {
		this.amnt=amnt;
		Thread t=Thread.currentThread();
		String name=t.getName();
		System.out.println("Ticket booked by Mr. "+name);
		System.out.println("Amount brought by " + name + " is: "+amnt);
		//try { Thread.sleep(5000);}catch(Exception e) {}
	}
	public void getChange() {
		Thread t=Thread.currentThread();
		String name=t.getName();
		System.out.println("Amount returned to " + name + " is: "+((this.amnt)-100));
	}
}
