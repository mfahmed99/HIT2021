package Assgn;

import java.util.Date;

public class AICTD2 {
	public static void main(String[] args) throws Exception {
		VaccinationCenter vc= new VaccinationCenter();
		System.out.println(new Date());
		System.out.println("Before coming to class...");
		JobKala kala=new JobKala(vc);
		kala.doJob();
		System.out.println("Take class for 7-9 Golden Touch batch..."+ new Date());
	}
}

interface Token {
	VaccinationCenter vc=new VaccinationCenter();
	public void doJob();
	
}

class JobKala implements Token{
	VaccinationCenter vc;
	public JobKala(VaccinationCenter vc) {
		this.vc=vc;
	}
	@Override
	public void doJob() {
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
		Thread.sleep(5000);
		System.out.println("Token recieved..."+new Date());
	}
}
