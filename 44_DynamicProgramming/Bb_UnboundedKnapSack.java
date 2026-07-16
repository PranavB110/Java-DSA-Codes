import java.util.*;
public class Bb_UnboundedKnapSack {
	public static int unboundedSack(int val[], int wt[], int W) {
		int n = val.length;
		int dp[][] = new int[n+1][W+1];
		
		//java already initialize 0 to but as a logic we will do it again . not necessary to do but in c++ need to do
		//initialize base case
		for(int i=0; i<n+1; i++) {
			dp[i][0] = 0;
		}
		for(int i=0; i<W+1; i++) {
			dp[0][i] = 0;
		}
		
		for(int i=1; i<n+1; i++) {
			for(int j=1; j<W+1; j++) {
				int w = wt[i-1];
				if(w <= j) {                       //check for all i items till now
					dp[i][j] = Math.max(val[i-1] + dp[i][j-w], dp[i-1][j]); //change is dp[i][j-w] include curr and check for curr and i-1 values so i-1 not it is "i"
				} else {
					dp[i][j] = dp[i-1][j];
				}
			}
		}
		
		return dp[n][W];
	}

	public static void main(String[] args) {
		 int val[] = {15, 14, 10, 45, 30};
         int wt[] = {2, 5, 1, 3, 4}; 
         int W = 7;
         
         System.out.println(unboundedSack(val, wt, W));
	}

}
