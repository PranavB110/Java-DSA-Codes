//length of longes subsequence

//recursion O(2^n)
//import java.util.*;
//public class C_LongestCommonSubSequence {
//	public static int sequence(String str1, String str2, int n, int m) {
//		if(n == 0 || m == 0) {
//			return 0;
//		}
//		
//		if(str1.charAt(n-1) == str2.charAt(m-1)) {
//			return sequence(str1, str2, n-1, m-1) + 1;
//		}
//		else {
//			int ans1 = sequence(str1, str2, n, m-1);
//			int ans2 = sequence(str1, str2, n-1, m);
//			
//			return Math.max(ans1, ans2);
//		}
//	}
//
//	public static void main(String[] args) {
//		String str1 = "abcdge";
//		String str2 = "abedg"; //lcs = "abdg" length = 4
//		
//		System.out.println(sequence(str1, str2, str1.length(), str2.length()));
//
//	}
//
//}

//memoization
//import java.util.*;
//public class C_LongestCommonSubSequence {
//	public static int sequence(String str1, String str2, int dp[][], int n, int m) {
//		if(n == 0 || m == 0) {
//			return 0;
//		}
//		
//		if(dp[n][m] != -1) {
//			return dp[n][m];
//		}
//		
//		if(str1.charAt(n-1) == str2.charAt(m-1)) {
//			return dp[n][m] = sequence(str1, str2, dp, n-1, m-1) + 1;
//		}
//		else {
//			int ans1 = sequence(str1, str2, dp, n, m-1);
//			int ans2 = sequence(str1, str2, dp, n-1, m);
//			
//			return dp[n][m] = Math.max(ans1, ans2);
//		}
//	}
//
//	public static void main(String[] args) {
//		String str1 = "abcdge";
//		String str2 = "abedg"; //lcs = "abdg" length = 4
//		int n = str1.length();
//	    int m = str2.length();
//		int dp[][] = new int[n+1][m+1];
//		
//		for(int i=0; i<n+1; i++) {
//			for(int j=0; j<m+1; j++) {
//				dp[i][j] = -1;
//			}
//		}
//
//		System.out.println(sequence(str1, str2, dp , n, m));
//
//	}
//
//}

//tabulation O(n*m)   //bottom up approach solve small 1st then big one
import java.util.*;
public class C_LongestCommonSubSequence {
	public static int sequence(String str1, String str2, int n, int m) {
		//create table
		int dp[][] = new int[n+1][m+1];
		
		//intialization (no need in java but still doing)
		for(int i=0; i<n+1; i++) {
			for(int j=0; j<m+1; j++) {
				if(i == 0 || j == 0) {
					dp[i][j] = 0;
				}
			}
		}
		
		//filling
		for(int i=1; i<n+1; i++) {
			for(int j=1; j<m+1; j++) {
				if(str1.charAt(i-1) == str2.charAt(j-1)) {
					dp[i][j] = dp[i-1][j-ssy1] + 1; // 1 of curr char are same and dp calling for i-1 nd j-1 remaining length 
				} else {// two cases if last char is not same in both. eleminate last char of one string and then check
					int ans1 = dp[i-1][j];  //st1 last char remove
					int ans2 = dp[i][j-1]; //str2 last char remove
					dp[i][j] = Math.max(ans1,  ans2); //store max of both
				}
			}
		}
		
		return dp[n][m];
	}

	public static void main(String[] args) {
		String str1 = "abcdge";
		String str2 = "abedg"; //lcs = "abdg" length = 4
		int n = str1.length();
	    int m = str2.length();

		System.out.println(sequence(str1, str2, n, m));

	}

}
