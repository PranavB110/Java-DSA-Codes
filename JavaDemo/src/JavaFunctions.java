import java.util.*;
public class JavaFunctions {
	
	public static void PrintHelloWorld() {
		System.out.println("Hello World");
	}
	
	public static int CalculateSum(int num1, int num2) {
		int sum = num1 + num2;
		return sum;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int sum = CalculateSum(a, b);
		System.out.println(sum);
		PrintHelloWorld();

	}

}
