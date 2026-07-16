//recursion - O(2^n) failed to calculate for numbers like 30 also. to many recursive calls
//import java.util.*;
//public class D_CatalanNumber {
//	public static int catalanNum(int n) {
//		if(n == 1 || n == 0) {
//			return 1;
//		}
//		
//		int ans = 0; //Cn
//		for(int i=0; i<=n-1; i++) {
//			ans += catalanNum(i) * catalanNum(n-i-1);
//		}
//		
//		return ans;
//	}
//    
//	public static void main(String[] args) {
//		int n = 20;
//		
//		System.out.println(catalanNum(n));
//
//	}
//
//}

////Memoization
//import java.util.*;
//public class D_CatalanNumber {
//	public static int catalanNum(int n, int dp[]) {
//		if(n == 1 || n == 0) {
//			return 1;
//		}
//		
//		if(dp[n] != -1) {
//			return dp[n];
//		}
//		
//		int ans = 0; //Cn
//		for(int i=0; i<=n-1; i++) {
//			ans += catalanNum(i, dp) * catalanNum(n-i-1, dp);
//		}
//		
//		return dp[n] = ans;
//	}
//    
//	public static void main(String[] args) {
//		int n = 4;
//		int dp[] = new int[n+1];
//		Arrays.fill(dp, -1);
//		
//		System.out.println(catalanNum(n, dp));
//
//	}
//
//}

//Tabulation - O(n^2)
import java.util.*;
public class D_CatalanNumber {
	public static int catalanNum(int n) {
        //table
		int dp[] = new int[n+1];
		
		//initialization
		dp[0] = 1;
		dp[1] = 1;
		
		//filling
		for(int i = 2; i<=n; i++) { //this loop is calculating Cn for every i in dp
			for(int j=0; j<=i-1; j++) { //actual calculation where n is i for this loop
				dp[i] += dp[j]*dp[i-j-1];
			}
		}
		
		return dp[n];
	}
    
	public static void main(String[] args) {
		int n = 4;

		System.out.println(catalanNum(n));

	}

}