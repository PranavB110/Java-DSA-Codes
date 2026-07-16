import java.util.ArrayList;
import java.util.*;
public class BasicProblems {
	
	public static void swap(ArrayList<Integer> list, int idx1, int idx2) {
		int temp = list.get(idx2);
		list.set(idx2, list.get(idx1));
		list.set(idx1, temp);
	}

	public static void main(String[] args) {
		//print reverse of list
		ArrayList<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		
		//O(n)
		for(int i = list.size()-1; i>=0; i--) {
			System.out.print(list.get(i)+" ");
		}
		System.out.println();
		System.out.println("------");
		
		//maximum number
		int max = Integer.MIN_VALUE;
		for(int i=0; i<list.size(); i++) {	
				max = Math.max(list.get(i), max);
		}
		
		System.out.println("Maximun no is: " + max);
			
		// swap 2 idx
		int idx1 = 1, idx2 = 3;
		System.out.println(list);
		swap(list, idx1, idx2);
		System.out.println(list);

	}

}
