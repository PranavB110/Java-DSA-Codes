// you are given an Array. Divide array such that difference between 2 parts is minimum
//you can take elemnts in any order without repeating and make 2 different groups . print min diff btw groups

//Solution: It is variation of 0/1 knapsack ..think min diff can be zero so both groups make same sum which is total sum of array elemnts by 2.
// this is the hint make one group (total sum )/2 size or close to it so automatically diff btw other and this group will be minimum
public class P_MinimumPartitioning {
	public static int minPartition(int arr[]) {
		int n = arr.length;
		int sum = 0;
		for(int i=0; i<arr.length; i++) {
			sum += arr[i];
		}
		
		int W = sum/2;
		
		int dp[][] = new int[n+1][W+1];
		
		//bottom up
		for(int i=1; i<n+1; i++) {
			for(int j=1; j<W+1; j++) {
				if(arr[i-1] <= j) { //valid
					dp[i][j] = Math.max(arr[i-1] + dp[i-1][j-arr[i-1]], dp[i-1][j]);
				} else { //invalid
					dp[i][j] = dp[i-1][j];
				}
			}
		}
		
		int sum1 = dp[n][W];
		int sum2 = sum - sum1;
		return Math.abs(sum1 - sum2);
	}

	public static void main(String[] args) {
		int nums[] = {1, 6, 11, 5};
		System.out.println(minPartition(nums));

	}

}
