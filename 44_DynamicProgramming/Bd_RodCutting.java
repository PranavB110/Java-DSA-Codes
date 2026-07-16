//rod length is given rod will me cut in length as given in length array and on similar index price of that particular length in price array  is given
//find how can you sell full rod and maximize profit from given length by cutting it according to length given in length array 
import java.util.*;
public class Bd_RodCutting {
	public static int rodCutting(int price[], int length[], int W) {
		int n = price.length;
		int dp[][] = new int[n+1][W+1];
		
		//initialization (no need to do as java do it but still as a logic done)
		for(int i=0; i<n+1; i++) {
			for(int j=0; j<W+1; j++) {
				if(i == 0 || j == 0) {
					dp[i][j] = 0;
				}
			}
		}
		
		//unbounded knapsack bcz i can cut rod of length 8 in 3 parts of 2 length so 2 length rod will be usen 3 times which match unbounded condition
		//value => price, weight => length, W => rod length W
		//similar code just changed the meaning
		
		for(int i=1; i<n+1; i++) { //O(n*W)
			for(int j=1; j<W+1; j++) {
				if(length[i-1] <= j) { //valid
					dp[i][j] = Math.max(price[i-1] + dp[i][j - length[i-1]], dp[i-1][j]);
				} else {
					dp[i][j] = dp[i-1][j];
				}
			}
		}
		
		return dp[n][W];
	}

	public static void main(String[] args) {
		int length[] = {1, 2, 3, 4, 5, 6, 7, 8}; //pieces length
		int price[] = {1, 5, 8, 9 ,10, 17, 17, 20};
		int totRod = 8;
		
		System.out.println(rodCutting(price, length, totRod));

	}

}
