import java.util.*;
//recursion
//public class BO1KnapSack {
//	public static int knapsack(int val[], int wt[], int W, int n) {  // n = item number tracking
//		//Base case - capacity is finish or 0 items are remaining;
//		if(W == 0 || n == 0) {
//			return 0;
//		}
//		
//		//valid
//		if(wt[n-1] <= W) {
//			//include
//			int ans1 = val[n-1] + knapsack(val, wt, W-wt[n-1], n-1);
//			//exclude
//			int ans2 = knapsack(val, wt, W, n-1);
//			
//			return Math.max(ans1, ans2);
//		} else { //invalid
//			return knapsack(val, wt, W, n-1);
//		}
//	}
//
//	public static void main(String[] args) {
//		 int val[] = {15, 14, 10, 45, 30};
//         int wt[] = {2, 5, 1, 3, 4}; 	
//         int W = 7;
//         
//         int ans = knapsack(val, wt, W, 5);
//         System.out.println(ans);
//	}
//
//}


//memoization  TC = O(n*m)
//public class BO1KnapSack {
//	public static int knapsack(int val[], int wt[], int W, int n, int dp[][]) {  // n = item number tracking
//		//Base case - capacity is finish or 0 items are remaining;
//		if(W == 0 || n == 0) {
//			return 0;
//		}
//		
//		if(dp[n][W] != -1) {
//			return dp[n][W];
//		}
//		//valid
//		if(wt[n-1] <= W) {
//			//include
//			int ans1 = val[n-1] + knapsack(val, wt, W-wt[n-1], n-1, dp);
//			//exclude
//			int ans2 = knapsack(val, wt, W, n-1, dp);
//			
//			dp[n][W] = Math.max(ans1, ans2);
//			return dp[n][W];
//		} else { //invalid
//			dp[n][W] = knapsack(val, wt, W, n-1, dp);
//			return dp[n][W];
//		}
//	}
//
//	public static void main(String[] args) {
//		int n = 5;
//		 int val[] = {15, 14, 10, 45, 30};
//         int wt[] = {2, 5, 1, 3, 4}; 	
//         int W = 7;
//         
//         int dp[][] = new int[n+1][W + 1];
//         for(int i=0; i<dp.length; i++) {
//        	 for(int j=0; j<dp[0].length; j++) {
//        		 dp[i][j] = -1;
//        	 }
//         }
//         
//         int ans = knapsack(val, wt, W, n, dp);
//         System.out.println(ans);
//	}
//
//}


//Tabulation Tc= O(nm)
public class BO1KnapSack {
	public static int knapsack(int val[], int wt[], int W) {  
		int n = val.length;
        int dp[][] = new int[n+1][W+1];
        
        for(int i=0; i<dp.length; i++) { //0th column
        	dp[i][0] = 0;
        }
        
        for(int i=0; i<dp[0].length; i++) { //0th row
        	dp[0][i] = 0;
        }
        
        for(int i=1; i<n+1; i++) {
    		int v = val[i-1];    //ith item val
    		int w = wt[i-1];     //ith item weight
        	for(int j=1; j<W+1; j++) {
        		if(w <= j) { //valid
        			int include = v + dp[i-1][j-w];
        			int exclude = dp[i-1][j];
        			dp[i][j] = Math.max(include, exclude);
        		} else {  //invalid
        			dp[i][j] = dp[i-1][j];
        		}
     
        	}
        }
        
        return dp[n][W];
	}

	public static void main(String[] args) {
		int n = 5;
		 int val[] = {15, 14, 10, 45, 30};
         int wt[] = {2, 5, 1, 3, 4}; 	
         int W = 7;
          
         int ans = knapsack(val, wt, W);
         System.out.println(ans);
	}

}