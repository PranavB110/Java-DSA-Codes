//number of ways to make sum. You can use one coin multiple times. (unbounded knapsack problem which has little bit logic of target sum)
import java.util.*;
public class Bc_CoinChange {
	public static int coinChange(int coin[], int sum) {
		int n = coin.length;
		int dp[][] = new int[n+1][sum+1]; //table  creation
		
		//base case initialization
		for(int i=0; i<n+1; i++) {
			dp[i][0] = 1;
		}
		
		//filling bottom up 
		for(int i=1; i<n+1; i++) {
			for(int j=1; j<sum+1; j++) {
				if(coin[i-1] <= j) { //valid
				    //including curr + if not includding curr = total ways
					dp[i][j] = dp[i][j-coin[i-1]] + dp[i-1][j];
				} else { //invalid
					dp[i][j] = dp[i-1][j];
				}
			}
		}
		
		return dp[n][sum];
	}

	public static void main(String[] args) {
		 int coin[] = {1, 2, 3}; 
         int sum = 4;
         
         System.out.println(coinChange(coin, sum));
	}

}
