
public class LinearSearch {
	
	public static void LinearSearch (int arr[], int n) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == n) {
				System.out.println("Number "+ n +" is present at "+ i +"th index");
				return;
			}
		} 
	
		System.out.println("Number not found");
	}
	
	public static void LinearSearchString (String array[], String name) {
		for (int i = 0; i < array.length; i++) {
			if (array[i] == name) {
				System.out.println("String "+ name +" is present at "+ i +"th index");
				return;
			}
		} 
	
		System.out.println("String not found. Enter Correct Again.");
	}

	public static void main(String[] args) {
		
		int numbers[] = {2, 45, 4, 8, 9, 10, 13, 17, 56};
		String name[] = {"Pranav", "Ganesh", "Girji", "Anurag", "Vaibhav", "sahil", "Sumit"};
		
//		LinearSearch(numbers, 17);
		LinearSearchString(name, "Sahil");

	}

}
