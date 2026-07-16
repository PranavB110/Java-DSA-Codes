import java.util.*;
public class frequencyOfElements {

	public static void main(String[] args) {
		int arr[] = {1, 2, 3, 3, 1, 1, 1, 2, 4, 5, 3};
		HashMap<Integer, Integer> hm = new HashMap<>();
		
		for(int i=0; i<arr.length; i++) {
			hm.put(arr[i], hm.getOrDefault(arr[i], 0) + 1); //get frequency if exist or return 0 if not exist and then 1 is added
		}
		
		for(Integer key: hm.keySet()) {
			if(hm.get(key) > arr.length/3) {
				System.out.println(key);
			}
		}

	}

}
