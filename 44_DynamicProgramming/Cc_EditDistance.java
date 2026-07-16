//Total minimum number of operation to convert str1 to str2. we can perform this operation on str1 add char , delete char and replace char 
//change only str1 don't touch str2
import java.util.*;
public class Cc_EditDistance { //O(n*m)
	public static int editDistance(String str1, String str2) {
		int n = str1.length();
		int m = str2.length();
		
		//create table
		int dp[][] = new int[n+1][m+1];
		
		//initialize - if str1 is 0 length then m operations and vice versa
		for(int i=0; i<n+1; i++) {
			for(int j=0; j<m+1; j++) {
				if(i == 0) {
					dp[i][j] = j;
				}
				else if(j == 0) {
					dp[i][j] = i;
				}
			}
		}
		
		//filling dp[i][j] = when we take str1 1st i char and str2 1st j char then miminum operation to make str1 to str2
		for(int i=1; i<n+1; i++) {
			for(int j=1; j<m+1; j++) {
				if(str1.charAt(i-1) == str2.charAt(j-1)) {
					//same char then check for remaining 
					dp[i][j] = dp[i-1][j-1]; 
				} else { //different
					//add char in str1. add 1 operation + check for remaining part now
					int ans1 = dp[i][j-1] + 1;
					//delete
					int ans2 = dp[i-1][j] + 1;
					//replace
					int ans3 = dp[i-1][j-1] + 1;
					
					dp[i][j] = Math.min(ans1, Math.min(ans2, ans3) );
				}
			}
		}
		
		return dp[n][m];
	}

	public static void main(String[] args) {
		String str1 = "exetion";
		String str2 = "execution";
		
		System.out.println(editDistance(str1, str2));

	}

}
