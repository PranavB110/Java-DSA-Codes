import java.util.*;
public class BasicOperations {

	public static void main(String[] args) {
		//Create
		HashMap<String, Integer> hm = new HashMap<>();
		
		//Insert - O(1)
		hm.put("India", 100);
		hm.put("China", 150);
		hm.put("Nepal", 90);
		hm.put("Bhutamn", 15);
		
		System.out.println(hm);
        
		//Get - O(1)
		int population = hm.get("India");
		System.out.println(population);
		
		//ContainsKey -O(1)  return True or False
		System.out.println(hm.containsKey("India"));
		System.out.println(hm.containsKey("Indonesia"));
		
		//Remove
		System.out.println(hm.remove("China")); 
		
	}

}
