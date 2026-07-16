//sorted Arraylist, find pair sum of provided target exist or not
import java.util.*;
public class PairSum1 {
	//Brute force O(n^2)
//	public static boolean pairSum(ArrayList<Integer> list, int target) {
//	    for(int i=0; i<list.size()-1; i++) {
//	    	for(int j=i+1; j<list.size(); j++) {
//	    		if(list.get(i)+list.get(j) == target) {
//	    			return true;
//	    		}
//	    	}
//	    }
//	    return false;
//	}
	
	//optimised 
	public static boolean pairSum(ArrayList<Integer> list, int target) {
		int lp = 0;
		int rp = list.size()-1;
		
		while(lp<rp) {
			//case 1
			if(list.get(lp) + list.get(rp) == target) {
				return true;
			}
			//case 2
			else if(list.get(lp) + list.get(rp) > target) {
				rp--;
			}
			//case 3
			else {
				lp++;
			}
		}
		return false;
	}


	public static void main(String[] args) {
		ArrayList<Integer>list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		
		System.out.print(pairSum(list, 5));

	}

}
