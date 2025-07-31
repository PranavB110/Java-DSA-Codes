import java.util.*;
public class BinarySearch {
	
	public static int findKey (int array[], int key) {
		
		int start = 0, end = array.length-1;
		
		while (start <= end) {
			int mid = (start + end)/2;
			
			if (array[mid] == key) {
				return mid;
			}
			if (array[mid] < key) {
				start = mid+1;
			}
			else {
				end = mid-1;
			} 
		}
		return -1;
	}

	public static void main(String[] args) {
		int array[] = {2, 4, 5, 6, 8, 10, 13, 15};
		int key = 35;
		int result = findKey(array, key);
		System.out.println("Key is present at index: " + result);


	}

}
