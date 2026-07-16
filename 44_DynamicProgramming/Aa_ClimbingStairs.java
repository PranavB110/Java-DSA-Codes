// Count number of ways to climb till Nth stair. Person can climb 1 0r 2 step at a time
//3 ways : recursion, recursion + memoization, tabulation

//Recursion -> Tc = 2^N
import java.util.*;
//public class Aa_ClimbingStairs {
//	public static int ways(int n) {
//		if(n == 0) return 1;
//		if(n < 0) return 0;
//		
//		return ways(n-1) + ways(n-2);
//	}
//
//	public static void main(String[] args) {
//        int n = 5;
//        System.out.println(ways(n));
//	}
//
//}

//Recursion + Memoization -> TC => (n)
//public class Aa_ClimbingStairs {
//	public static int Countways(int n, int dp[]) {
//		if(n == 0) return 1;
//		if(n < 0) return 0;
//		
//		if(dp[n] != -1) {
//			return dp[n];
//		}
//	
//		dp[n] = Countways(n-1, dp) + Countways(n-2, dp);
//		return dp[n];
//	}
//
//	public static void main(String[] args) {
//        int n = 5;
//        int dp[] = new int[n+1]; //0 , 0, 0...
//        Arrays.fill(dp, -1); // -1, -1, -1,.....
//        System.out.println(Countways(n, dp));
//	}
//
//}

//Memoization Iterative approach -> TC = O(n)
public class Aa_ClimbingStairs {
	public static int Countways(int n, int dp[]) {
        for(int i=2; i<=n; i++) {
        	dp[i] = dp[i-1] + dp[i-2]; 
        }
        
        return dp[n];
	}

	public static void main(String[] args) {
        int n = 5;
        int dp[] = new int[n+1];
        dp[0] = 1;
        dp[1] = 1;
        
        System.out.println(Countways(n, dp));

	}

}
