//substring is cotigiouss and subsequesnce is not contigious
//code may be comfusing but we are checking every case when str1 length is 'i' and str2 length is 'j'  so at any i, j if curr are same 
// then we check for remaining rest part.

import java.util.*;
public class Ca_LongestCommonSubstring {
	public static int subString(String str1, String str2) {
		int n = str1.length();
		int m = str2.length();
		int ans = 0;  //ans can be anywhere in dp not bcz substring can be anywhere at any i, j
		int dp[][] = new int[n+1][m+1];
		
		for(int i=0; i<n+1; i++) {
			dp[i][0] = 0;
		}
		for(int j=0; j<m+1; j++) {
			dp[0][j] = 0;
		}
		
		for(int i=1; i<n+1; i++) {
			for(int j=1; j<m+1; j++) {
				if(str1.charAt(i-1) == str2.charAt(j-1)) {
					dp[i][j] = dp[i-1][j-1] + 1;  //same then check for i-1 and j-1 char are they continious
					ans = Math.max(ans, dp[i][j]);
				} else {
					dp[i][j] = 0;  //if not same then no substring can form from curr i and j
				}
			}
		}
		
		return ans;
	}

	public static void main(String[] args) {
		String str1 = "ABCDE";
		String str2 = "ABGCE";
		
		System.out.println(subString(str1, str2));

	}

}
