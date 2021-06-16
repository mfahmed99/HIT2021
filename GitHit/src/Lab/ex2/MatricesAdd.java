package Lab.ex2;

public class MatricesAdd {

	public static void main(String[] args) {
		int m1[][] = { {1,4,7} , {8,5,2} , {9,6,3}};
		int m2[][] = {{9,6,3} , {2,5,8} , {1,4,7}};
		int m3[][] = new int[3][3];
		for(int i = 0 ; i < 3; i++) {
			for(int j = 0 ;j<3; j++) {
				m3[i][j] = m1[i][j] + m2[i][j];
				System.out.println(" "+m3[i][j]);
			}
			System.out.println("\n");
		}
	}

}
