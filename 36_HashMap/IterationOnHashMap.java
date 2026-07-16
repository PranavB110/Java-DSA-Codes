import java.util.*;
import java.util.Map.Entry;
public class IterationOnHashMap {

	public static void main(String[] args) {
		HashMap<String, Integer> hm = new HashMap<>();
		
		hm.put("India", 1);
		hm.put("Indonesia", 2);
		hm.put("China", 3);
		hm.put("Bhutan", 4);
		hm.put("Korea", 5);
		
		//Iterate
		//keySet() -- copy all keys in set
		Set<String> keys = hm.keySet();
		System.out.println(keys);
		
		for(String k : keys) {
			System.out.println("key="+k+ ",value="+hm.get(k));
		}
		
		//hm.entrySet() -- copy all pairs
		Set<Entry<String, Integer>> pairs = hm.entrySet();
		
		for(Entry<String, Integer> p : pairs) {
			System.out.println(p);
		}
		
	}

}
