//import java.util.*;
//public class MultiDimensionalarrayList {
//
//	public static void main(String[] args) {
//		ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();
//        ArrayList<Integer> list = new ArrayList<>();
//        ArrayList<Integer> list2 = new ArrayList<>();
//        ArrayList<Integer> list3 = new ArrayList<>();
//        
//    	for(int i=1; i<4; i++) {  
//    		list.add(i*1);
//    		list.add(i*2);
//    		list.add(i*3);
//    	}
//    	
//    	mainList.add(list);
//    	mainList.add(list2);
//    	mainList.add(list3);
//    	
//    	
//    	for(int i=0; i<mainList.size(); i++) {
//    		ArrayList<Integer> currList = mainList.get(i);
//    		
//    		for(int j=0; j<currList.size(); j++) {
//    			System.out.print(currList.get(j)+" ");
//    		}
//    		
//    		System.out.println();
//    	}
//    
//	}
//	
//}
//
import java.util.*;
public class MultiDimensionalarrayList {

	public static void main(String[] args) {
		ArrayList<ArrayList> mainList = new ArrayList<>();
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();	
        
    	list.add(1);	list.add(2);	list.add(3);
    	list2.add("Hello"); list2.add("Hello2"); list2.add("Hello3");
    	
    	mainList.add(list);
    	mainList.add(list2);
    	
//    	System.out.print(mainList);
        
    	for(int i=0; i<mainList.size(); i++) {
    		ArrayList<Integer> currList = mainList.get(i);
    		System.out.println(currList);
    	}
    
	}
	
}