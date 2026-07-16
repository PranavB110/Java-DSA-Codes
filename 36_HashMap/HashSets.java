import java.util.*;
public class HashSets {
	

	public static void main(String[] args) {
		HashSet<String> cities = new HashSet<>();
		cities.add("Delhi");
		cities.add("Pune");
		cities.add("Banglore");
		cities.add("Chennai");
		cities.add("Mumbai");
		
		//using advanced iterator
		Iterator it = cities.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		//advanced for loop
		for(String city : cities) {
			System.out.println(city);
		}
		
		LinkedHashSet<String> lhs = new LinkedHashSet<>();
		lhs.add("Delhi");
		lhs.add("Pune");
		lhs.add("Banglore");
		lhs.add("Chennai");
		lhs.add("Mumbai");
		
		System.out.println(lhs);
	 }

}
