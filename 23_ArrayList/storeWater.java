import java.util.*;
public class storeWater {
	
	//Brute  force approach O(n^2)
	
//	public static int maxStoreWater(ArrayList<Integer> height) {
//		int max = 0; //not -infinity bcz if only 1 wall or min water store is zero always
//		for(int i=0; i<height.size()-1; i++) {
//			for(int j=i+1; j<height.size(); j++) {
//				int ht = Math.min(height.get(i), height.get(j));
//				int width = j-i;
//				int currMax = ht*width;
//				
//				max = Math.max(max, currMax);
//			}
//		}
//		return max;
//	}
	
	//Optimized code O(n);
	//lp traverse m dist rp traverse n-m dist . total(n) = m + n-m = n therefore O(n)
	public static int maxStoreWater(ArrayList<Integer> height) {
		//calculate area
		int maxWater = 0;
		int lp = 0;
		int rp = height.size()-1;
		
		while(lp < rp) {
			int ht = Math.min(height.get(lp), height.get(rp));
			int width = rp-lp;
			int currWater = ht*width;
			
			maxWater = Math.max(maxWater, currWater);
			
			//update ptr
			if(height.get(lp) < height.get(rp)) {
				lp++;
			} else {
				rp--;
			}
			
		}
		
		return maxWater;
	}
	

	public static void main(String[] args) {
		ArrayList<Integer> height = new ArrayList<>();
		height.add(1);
		height.add(8);
		height.add(6);
		height.add(2);
		height.add(5);
		height.add(4);
		height.add(8);
		height.add(3);
		height.add(7);
		
		System.out.println(maxStoreWater(height));

	}

}
