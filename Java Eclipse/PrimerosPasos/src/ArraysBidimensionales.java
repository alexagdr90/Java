/**
 * 
 */

/**
 * @author Alex
 *
 */
public class ArraysBidimensionales {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] matrix=new int[4][5];
		
		matrix[0][0]=15;
		matrix[0][1]=1;
		matrix[0][2]=5;
		matrix[0][3]=125;
		matrix[0][4]=152;
		
		matrix[1][0]=105;
		matrix[1][1]=115;
		matrix[1][2]=152;
		matrix[1][3]=153;
		matrix[1][4]=154;
		
		matrix[2][0]=105;
		matrix[2][1]=215;
		matrix[2][2]=152;
		matrix[2][3]=125;
		matrix[2][4]=2215;
		
		matrix[3][0]=1305;
		matrix[3][1]=1533;
		matrix[3][2]=153;
		matrix[3][3]=135;
		matrix[3][4]=315;
		
		//System.out.println("Valor almacenado en la posicion 2, 3: "+matrix[2][3]);
		
		for(int i=0;i<4;i++) {
			System.out.println();
			for(int j=0;j<5;j++) {
				System.out.print(matrix[i][j]+" ");
			}
		}
	}

}
