
public class LargestNoInArray {
	
	public static int findLargest (int arr[]) {
		
		int largest = Integer.MIN_VALUE;      //min value consider as largest for simplification
		int smallest = Integer.MAX_VALUE;     //max value consider as smallest
		
		//Largest
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > largest ) {
				largest = arr[i];
			}
		}
		
		//Smallest
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < smallest ) {
				smallest = arr[i];
			}
		}
		
		System.out.println("Smallest number is: " + smallest);
		return largest;
	}

	public static void main(String[] args) {
	    int numbers[] = {5, 67, 89, 23, 45, 56, 65, 11, 34, 78};
	    
	    int num = findLargest(numbers);
	    System.out.println("Largest number is "+num);

	}

}
