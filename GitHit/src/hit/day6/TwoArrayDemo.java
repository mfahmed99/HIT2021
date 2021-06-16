package hit.day6;

public class TwoArrayDemo {

	public static void main(String[] args) {
		int arr[] = {1,4,7,9};
		int marks[]=new int[5];// the length of array is 5 columns
		marks[1]=1000;
		for(int i=0;i<marks.length;i++) {
			System.out.println(marks[i]);
		}
		//you cannot resize an array
		
		for (int i:marks) {// new for loop which got intriduced in jdk file
			System.out.println("Value is "+i);
		}
		//2D array
		
		int twod[][] = {
				{22,44,33,55},
				{21,31,41,51}
		};
		
		int [][]twod1=new int[2][4];//two rows and four columns
		
		for(int i=0;i<twod.length;i++) {
			for(int k=0;k<twod[i].length;k++) {
				System.out.println(twod[i][k]+"     ");
			}
		}
		
		for(int i[]:twod) {
			for(int j:i) {
				System.out.println(j+".......");
			}
			System.out.println();
		}
		
		int unevenarr[][]= { //uneven multidimensional array
				{12,34,56},
				{56,23},
				{55,88,99,12}
		};
		
		int unevenarray2[][]= new int[3][];
		unevenarray2[0]=new int[3];
		unevenarray2[1]=new int[5];
		unevenarray2[2]=new int[2];
		
		for(int i[]:unevenarray2) {
			for(int k:i) {
				System.out.println(k+"+++++++");
				
			}
			System.out.println();
		}
		
		
	}

}

/** package hit.day6;
public class TwoDArrayDemo {
	public static void main(String[] args) {
		int arr[]= {1,4,7,9};
		int marks[]=new int[5];// the length of the array is 5 columns
		marks[1]=1000;
		for(int i=0;i<marks.length;i++) {
			//System.out.println(marks[i]);
		}
		
		for(int i:marks) {//new for loop which got introduced in jdk 5
			System.out.println("Value is..:"+i);
		}
		//you cannot resize an array
		
		//two dimensional array
		
		int twod[][]= {
				{22,44,33,55},
				{21,31,41,51}
		};
		
		int [][]twodd=new int[3][4];//two rows and four columns..
		twodd[1][1]=10000;
		
		for(int i=0;i<twod.length;i++) {//outer for loop - 3 times
			for(int k=0;k<twod[i].length;k++) {//inner for loop - run 12 times
		//		System.out.print(twod[i][k]+"    ");
			}
			//System.out.println();
		}
		for(int i[]:twod) {
			for(int j:i) {
				System.out.print(j+"..........");
			}
			System.out.println();
		}
		
		int unevenarr[][]= {//uneven multidimensional array
				{12,34,56},
				{56,23},
				{55,88,99,12}
		};	
		
		int unevenarray2[][]=new int[3][];
		unevenarray2[0]=new int[3];
		unevenarray2[1]=new int[5];
		unevenarray2[2]=new int[2];
		
		for(int i[]:unevenarray2) {
			for(int k:i) {
				System.out.print(k+"+++++");
			}
			System.out.println();
		}
		
	}
}
*/


