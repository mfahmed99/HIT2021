package hit.day22;

import java.util.Date;
/**
 * Threads are created using class called thread
 */
public class ThreadDemo2 {
	public static void main(String[] args) throws Exception {
		VaccinationCenter vc= new VaccinationCenter();
		System.out.println(new Date());
		System.out.println("Before coming to class...");
		Thread kala= new Thread(new JobToKala(vc),"kala");
		kala.start();// this is used to call run method
		//vc.getToken();
		System.out.println("Take class for 7-9 Golden Touch batch..."+ new Date());
		
	}
}

class JobToKala implements Runnable {// this is template  nad we compulsory need to override run method
	VaccinationCenter vc;
	public JobToKala(VaccinationCenter vc) {
		this.vc=vc;
	}
	@Override
	public void run() {
		System.out.println("The job given to kala is executed from this metod");
		try {
			vc.getToken();
		} catch(Exception e){
			e.printStackTrace();
		}
	}
}

class VaccinationCenter {
	public void getToken() throws Exception{
		Thread t=Thread.currentThread();
		
		System.out.println("Standing in queue for token...");
		Thread.sleep(10000);
		System.out.println("Token recieved..."+new Date());
	}
}