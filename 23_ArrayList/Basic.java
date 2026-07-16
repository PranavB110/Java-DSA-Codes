import java.util.ArrayList;
public class Basic {

	public static void main(String[] args) {
		//ClassName objectName = new ClassNAme  --OOPS
		ArrayList<Integer> list = new ArrayList<>();
		ArrayList<String> list2 = new ArrayList<>();
		
		//adding data
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		//add and shift pstn by 1 index
		list.add(1, 9);
		
		//get elemet by index (arr[i])
		int ele = list.get(3);
        System.out.println(ele);
        
        //Remove element
        list.remove(3);
        
        //Set element (replace)
        list.set(3, 100);
        
        //contains check if exist or not( return true or false)
        System.out.println(list.contains(100));
        System.out.println(list.contains(2));
        
		
		//print
		System.out.println(list); 
		
		//Size
		System.out.println("size is " + list.size());
		
		//iterate
		for(int i=0; i<list.size(); i++) {
			System.out.print(list.get(i)+" ");
		}
		
	}

}
