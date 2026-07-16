
public class stringBuilder {

	public static void main(String[] args) {
		String str = "";
		for(char ch='a'; ch<='z'; ch++) {
			str += ch;
		}
		System.out.println(str);
		//O(n2)  time complexity
		
		
		String name = "";
		StringBuilder sb = new StringBuilder(name);
		
		for(char ch='a'; ch<='z'; ch++) {
			sb.append(ch);
		}
		name = sb.toString();
		System.out.print(name);
		//O(n)   time complexity
	}

}
