package hit.day6;

public class ArraysDemo {
	// int, float, long, short, byte, double...
	int i=10;
	//Syntax
	int marks[]= {10,20,30,40};//This is an array
	int score[]=new int[5];// An array created with 5 columns
	//if u want ro do some operation on variable then method is compulsory
	void met() {
		score[0]=100;
		score[1]=80;
		score[2]=90;
		score[3]=100;
		score[4]=50;
		//score[5]=100;
	}
	public static void main(String[] args) {
		new ArraysDemo().met();
		ArraysDemo obj=new ArraysDemo();
		obj.met();
		for(int i=0;i<5;i++) {
			System.out.println(obj.marks[i]);
		}
	}
}
