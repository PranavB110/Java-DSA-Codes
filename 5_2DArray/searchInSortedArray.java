
public class searchInSortedArray {

	public static boolean searchKey(int matrix[][], int key) {
		//considering right top is special cell (0, m-1)
		int row = 0, col = matrix[0].length-1;
		while(row<matrix.length && col>=0) {
			if(matrix[row][col]==key) {
				System.out.println("Key found at ("+row+", "+col+")th cell");
				return true;
			}
			else if(matrix[row][col]>key) {
				col--;
			}
			else {
				row++;
			}
		}
		System.out.println("Key not found!");
		return false;

	}
	
	public static void main(String[] args) {
	     int matrix[][] = {{1, 2, 3, 4},
	    		           {5, 6, 7, 8},
	    		           {9, 10, 11, 12},
	    		           {13, 14, 15, 16}};
	     int key = 100;
	     
	     searchKey(matrix, key);

	    }

}
