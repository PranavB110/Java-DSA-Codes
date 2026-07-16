import java.util.*;
public class UnionAndIntersection {

	public static void main(String[] args) {
		int arr1[] = {7, 3, 9};
		int arr2[] = {6, 3, 9, 2, 9, 4};
		
		//union
		
		HashSet<Integer> set = new HashSet<>();
		//insert arr1
		for(int i=0; i<arr1.length; i++) {
			set.add(arr1[i]);
		}
		//insert arr2
		for(int i=0; i<arr2.length; i++) {
			set.add(arr2[i]);
		}
		
		System.out.println("Union count is: " + set.size());
		for( Integer k: set) {
			System.out.print(k+" ");
		}
		
		//Intersection
		set.clear();  //reusing already we will have union result printed 
		for(int i=0; i<arr1.length; i++) {
			set.add(arr1[i]);
		}
		
		int count = 0;
		for(int i=0; i<arr2.length; i++) {
			if(set.contains(arr2[i])) {
				count++;
				set.remove(arr2[i]);
			}
		}
		 
		System.out.println("intersectrion count is: "+count);
	}

}
