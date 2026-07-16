//To convert str1 to str2 you can do only add and delete oprtn on str1. Print number of add and delete operations
//take longest common subsequence (lcs) of str1 and 2. difference of length between lcs and str1 = delete oprtn. diff btw lcs andd str2 = add oprtn
import java.util.*;
public class Cd_StringConversion {
	
	public static int lcs(String str1, String str2) {
		int n = str1.length();
		int m = str2.length();
		
		int dp[][] = new int[n+1][m+1];
		
		for(int i=1; i<n+1; i++) {
			for(int j=1; j<m+1; j++) {
				if(str1.charAt(i-1) == str2.charAt(j-1)) {
					dp[i][j] = dp[i-1][j-1] + 1;
				} else {
					dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
				}
			}
		}
		
		return dp[n][m];
	}
	public static void convertString(String str1, String str2) {
		int lcsLength = lcs(str1, str2);
		
		int deleteOprtn = str1.length() - lcsLength;
		int addOprtn = str2.length() - lcsLength;
		
		System.out.println("Delete Operations: " + deleteOprtn);
		System.out.println("Add Operations: " + addOprtn);
	}

	public static void main(String[] args) {
		String str1 = "pranav";
		String str2 = "pranjal";
		
		convertString(str1, str2);

	}

}
