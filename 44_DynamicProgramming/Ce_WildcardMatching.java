//you are given 2 strings str and pattern check can you make pattern into str or not
//* can take any char or sequence of any char or empty also. eg * = a, aa, abc, ahdses..., " "
//? can take only single char eg. ? = a, b, c, z .. anything you want
import java.util.*;
public class Ce_WildcardMatching {
	public static boolean isMatch(String str, String pattern) {
		int n = str.length();
		int m = pattern.length();
		//table
		boolean dp[][] = new boolean[n+1][m+1];
		///initalization
		dp[0][0] = true;
		for(int i=1; i<n+1; i++) {
			dp[i][0] = false;
		}
		
		for(int i=1; i<m+1; i++) {
			if(pattern.charAt(i-1) == '*') { //* can convert to emty check can rest be converted
				dp[0][i] = dp[0][i-1]; 
			} else { //if ? or any char then always false cannot convert to empty str
				dp[0][i] = false;
			}
		}
		
		//filling
		for(int i=1; i<n+1; i++) {
			for(int j=1; j<m+1; j++) {
				//if ith and jth char are same or jth char is ? then okay now ans depend on rest i-1 and j-1 chars
				if(str.charAt(i-1) == pattern.charAt(j-1) || pattern.charAt(j-1) == '?') { 
					dp[i][j] = dp[i-1][j-1];
				} 
				//ith and jth char are not same
				else if(pattern.charAt(j-1) == '*') { //2 cases ...use * for curr char and keep for rest part or use * as empty
					//not used star  || used star and kept for remaining
					dp[i][j] = dp[i][j-1] || dp[i-1][j];
				} else { //rest all are false eg str = cd and ptrn = lm or many other cases
					dp[i][j] = false;
				}
			}
		}
		
		return dp[n][m];
	}

	public static void main(String[] args) {
		String str = "abc";
		String pattern = "**";
		
		System.out.println(isMatch(str, pattern));

	}

}
