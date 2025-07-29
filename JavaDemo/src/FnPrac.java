import java.util.*;
public class FnPrac {
	
	//Average 3 no
	public static void avgOfThree (int a, int b, int c) {
		int Avg = (a + b + c) / 3;
		System.out.println(Avg);
	}
	
	//isEven
	public static boolean isEven (int n) {
		if (n % 2 == 0) {
			return true;
		}
		
		return false;
	}
	
	//check palindrome
	public static boolean isPalindrome (int number) {
		int palindrome = number;
		int reverse = 0;
		
		while (palindrome > 0) {
			int rem = palindrome % 10;
			reverse = reverse * 10 + rem; 
			palindrome = palindrome/10;
		}
		System.out.println(reverse);
		
		if (reverse == number) {
			return true;
		}
		
		return false;
	}
	
	//Math methods
	public static void mathCheck (int a, int b, int c) {
		int min = Math.min(a, b);
		int max = Math.max(a, b);
		double sqrt = Math.sqrt(c);
		double abs = Math.abs(-23);
		System.out.println("min: "+ min+ ",max: "+ max+ ",sqrt: "+sqrt);
	}
	
	//sum of number
	public static void calSum (int n) {
		int sum = 0;
		int number = n;
		
		while (n > 0) {
			int lastDigit = n % 10;
			sum = sum + lastDigit;
			
			n = n/10;
		}
		
		System.out.println("Sum of digits of "+number+" is: "+sum);
	}

	public static void main(String[] args) {
		avgOfThree(2, 4, 3);
		System.out.println("Number is Even T/F :" +isEven(2));
		
		System.out.println("Number is palindrome T/F :" +isPalindrome(321));
		
		mathCheck(34, 45, 90);
		
		calSum(124);

	}

}
