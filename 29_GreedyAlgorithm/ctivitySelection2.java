import java.util.*;
public class ctivitySelection2 {

	public static void main(String[] args) {
		//if array is not sorted on basis of end time
		
		int start[] = {1, 3, 0, 5, 8, 5};
		int end[] = {2, 4, 6, 7, 9, 9};
		
		//sorting
		int activities[][] = new int[start.length][3];
		for(int i=0; i<start.length; i++) {
			activities[i][0] = i;
			activities[i][1] = start[i];
			activities[i][2] = end[i];
		}
		
		//lambda function -> shortform
		Arrays.sort(activities, Comparator.comparingDouble(o -> o[2])); //comparing on basis of 2nd column
		
		int maxActivity = 0;   
		ArrayList<Integer> ans = new ArrayList<>();  
		
		//1st activity
		maxActivity = 1;
		ans.add(activities[0][0]);
		int lastEnd = activities[0][2];
		for(int i=1; i<start.length; i++) {
			if(activities[i][1] >= lastEnd) {
				//activity select
				maxActivity++;
				ans.add(activities[i][0]);	
				lastEnd = activities[i][2];
			}
		}
		
		System.out.println("max activities = " + maxActivity);
		for(int i=0; i<ans.size(); i++) {
			System.out.print("A"+ans.get(i)+" ");
		}
		System.out.println();



	}

}
