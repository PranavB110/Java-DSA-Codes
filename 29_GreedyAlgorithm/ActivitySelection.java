import java.util.*;
public class ActivitySelection {

	public static void main(String[] args) {
		int start[] = {1, 3, 0, 5, 8, 5};
		//end time basis sorted
		int end[] = {2, 4, 6, 7, 9, 9};
		
		int maxActivity = 0;   //count no of activity
		ArrayList<Integer> ans = new ArrayList<>();  //to store activity index
		
		//1st activity
		maxActivity = 1;
		ans.add(0);
		int lastEnd = end[0];
		for(int i=1; i<start.length; i++) {
			if(start[i] >= lastEnd) {
				//activity select
				maxActivity++;
				ans.add(i);
				lastEnd = end[i];
			}
		}
		
		System.out.println("max activities = " + maxActivity);
		for(int i=0; i<ans.size(); i++) {
			System.out.print("A"+ans.get(i)+" ");
		}
		System.out.println();

	}

}
