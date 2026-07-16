
public class findPermutation {
	
	public static void permutations(String str, String ans) {
		//Base case
		if(str.length() == 0) {
			System.out.println(ans);
			return;
		}
		//recursion
		for(int i=0; i<str.length(); i++) {
			char curr = str.charAt(i);
			//"abcde" => "ab" + "de"= "abde" remove char from str
			String NewStr = str.substring(0, i) + str.substring(i+1);
			permutations(NewStr, ans+curr);
		}
	}

	public static void main(String[] args) {
		permutations("abc", "");

	}

}
