//is there any subset in given array which can give sum 10
import java.util.*;
public class Ba_TargetSum {
	//O(n*sum)
	public static boolean targetSumSubset(int arr[], int sum) {
		int n = arr.length;
		boolean dp[][] = new boolean[n+1][sum+1];
		//i = items & j = target sum (if target sum is 0 then requirement is full filed so true)
		for(int i=0; i<n+1; i++) {
			dp[i][0] = true;
		}
		
		for(int i=1; i<n+1; i++) {
			for(int j=1; j<sum+1; j++) {
				int v = arr[i-1];
			//include
				if(v <= j && dp[i-1][j-v] == true) { //include curr v and check if remaining i-1 items weight is making j-v . so total weight of i-1 items and curr item will be j and we will mark true
					dp[i][j] = true;
				}
				//exclude
				if(dp[i-1][j] == true) {
					dp[i][j] = true;
				}
			}
		}
		
		return dp[n][sum];
	}

	public static void main(String[] args) {
		int arr[] = {4, 2, 7, 1, 3};
		int sum = 10;
		
		System.out.println(targetSumSubset(arr, sum));
	}

}
