//Recursion
//import java.util.*;
//public class E_MatrixChainMultiplication {
//	public static int mcm(int arr[], int i, int j) {
//		if(i == j) {
//			return 0; //if single matrix
//		}
//		
//		int ans = Integer.MAX_VALUE;
//		//divide in 2 parts using k and multilply this 2 parts 
//		for(int k=i; k<=j-1; k++) { //j-1 bcz we are dividing in 2 small problems so atleast 1 matrix at 'j' should left to multiply aas 2nd part
//			int cost1 = mcm(arr, i, k);
//			int cost2 = mcm(arr, k+1, j);
//			int cost3 = arr[i-1] * arr[k] * arr[j]; //a*b*d
//			
//			ans = Math.min(ans, cost1 + cost2 + cost3); //update ans in min is found
//		}
//		
//		return ans;
//	}
//
//	public static void main(String[] args) {
//		int arr[] = {1, 2, 3, 4, 3};
//        int j = arr.length;
//        int i = 1; //start from 1 bcz matrix A = arr[i-1]xarr[i] and arr cant have -ve index if started from 0
//        
//        System.out.println(mcm(arr, i, j-1));
//	}
//
//}

//Memoization


//Tabulation
import java.util.*;
public class E_MatrixChainMultiplication {
	public static int mcm(int arr[]) {
		int n = arr.length;
		int dp[][] = new int[n][n];
		
		//initialization
		for(int i=0; i<n; i++) {
			dp[i][i] = 0;
		}
		
		//bottom-up
		for(int len=2; len<=n-1; len++) {
			for(int i=1; i<=n-len; i++) {
				int j = i+len-1; //col
				dp[i][j] = Integer.MAX_VALUE;
				for(int k=i; k<=j-1; k++) {
					int cost1 = dp[i][k];
					int cost2 = dp[k+1][j];
					int cost3 = arr[i-1]*arr[k]*arr[j];
					dp[i][j] = Math.min(dp[i][j], cost1+cost2+cost3);
				}
			}
		}
		
		return dp[1][n-1];
	}

	public static void main(String[] args) {
		int arr[] = {1, 2, 3, 4, 3};

        
        System.out.println(mcm(arr));
	}

}