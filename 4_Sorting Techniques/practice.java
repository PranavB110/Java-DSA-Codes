//print in descending  order
import java.util.*;
import java.util.Collections;
public class practice {
    
	//bubble sort
	public static void bubblesort(int arr[]) {
		for(int turn=0; turn<arr.length-1; turn++) {
			for(int j=0; j<arr.length-1-turn; j++) {
				if(arr[j]<arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1]= temp;
				}
			}
		}
	}
	
	//selection sort
	public static void selectionSort(int arr[]) {
		for(int i=0; i<arr.length-1; i++) {
			int maxPos = i;
			for(int j=i+1; j<arr.length; j++) {
				if(arr[maxPos]<arr[j]) {
                    maxPos = j;
				}
			}
			int temp = arr[maxPos];
			arr[maxPos] = arr[i];
			arr[i] = temp;
		}
	}
	
	//insertion Sort
	 public static void insertionSort(int arr[]) {
	        for (int i = 1; i < arr.length; i++) {
	            int curr = arr[i];
	            int prev = i - 1;
	            
	            while (prev >= 0 && arr[prev] < curr) {
	                arr[prev + 1] = arr[prev];
	                prev--; 
	            }

	            arr[prev + 1] = curr;
	        }
	    }
	 
	    public static void inbuilt(Integer arr[]) {
	        Arrays.sort(arr, Collections.reverseOrder());
	    }
	
	public static void print(Integer arr[]) {
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}
	public static void main(String[] args) {
	Integer arr[] = {3, 6, 2, 1, 8, 7, 4, 5, 3, 1};
//	bubblesort(arr);
//	selectionSort(arr);
//	insertionSort(arr);
	inbuilt(arr);
	print(arr);
	

	}

}
