
public class BubbleSort {
	
	public static void bubbleSort(int arr[]) {
		for(int turn=0; turn<arr.length-1; turn++) {   //turn<= arr.length-2
			for(int j=0; j<arr.length-1-turn; j++) {
				if(arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
	}
	
	//if array provided is sorted then O(n) time complexity
	public static void bubbleSortedOne(int arr[]) {
		for(int turn=0; turn<arr.length-1; turn++) {  
			int swap = 0;
			for(int j=0; j<arr.length-1-turn; j++) {
				if(arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					swap++;
				}
			}
			if(swap==0) {
				System.out.println("Already Sorted");
				return;
			}
		}
	}
	
	public static void printArr(int arr[]) {
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		int arr[] = {1, 2, 10, 4, 5};
//		bubbleSort(arr);
//		printArr(arr);
		bubbleSortedOne(arr);
		
	}

}
