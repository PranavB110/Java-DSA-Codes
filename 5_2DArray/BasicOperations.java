import java.util.*;
public class BasicOperations {
	
	//Max and Min element
	public static void searchMax(int matrix[][]) {
		int n = matrix.length, m = matrix[0].length;
		int maxNum = Integer.MIN_VALUE; int cellI = 0, cellJ = 0;
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
				if(matrix[i][j] > maxNum) {  //for smaller    matrix[i][j] < maxNum
                  maxNum = matrix[i][j];
                  cellI = i; cellJ = j;
				}
			}
		}
		System.out.println(maxNum+" is max number "+"found at ("+cellI+", "+cellJ+")th cell");
	}
	
	//print rows
	public static void displayRows(int matrix[][], int row) {
		int n = row, m = matrix[0].length;
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		int matrix[][] = new int[3][3];
		int n = matrix.length, m = matrix[0].length;
		
		//input
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				System.out.print("Enter cell ("+i+", "+j+")th element:");
				matrix[i][j] = sc.nextInt();
			}
		}
		
		//output
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}
		

		searchMax(matrix);
		System.out.print("Enter the ROW NUMBER to print eg. 1,2...: ");
		int r = sc.nextInt();
		displayRows(matrix, r);
		
	}

}
