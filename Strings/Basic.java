import java.util.*;
public class Basic {
	
	//output
	public static void print(String str) {
		for(int i=0; i<str.length(); i++) {
			System.out.print(str.charAt(i)+" ");
		}
		
		//concatenation
		String add = "Hello";
		str = add+str;
		System.out.println(str);
		
	}
	
    //input
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the line");
		String fullName = sc.nextLine();
		print(fullName);
		
		int length = fullName.length();
		System.out.println(length);
		System.out.println(fullName);	
	}

}
