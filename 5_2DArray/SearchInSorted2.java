
public class SearchInSorted2 {
	//O(n+m) time complexity

	public static boolean searchKey(int matrix[][], int key) {
		//considering left bottom is special cell (n-1, 0)
		int row = matrix.length-1, col = 0;
		while(row>=0 && col<matrix[0].length) {
			
			if(matrix[row][col]==key) {
				System.out.println("Key found at ("+row+", "+col+")th cell");
				return true;
			}
			else if(matrix[row][col]>key) {
				row--;
			}
			else {
				col++;
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
	     int key = 6;
	     
	     searchKey(matrix, key);

	    }

}
