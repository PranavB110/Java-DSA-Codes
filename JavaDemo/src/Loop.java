import java.util.*;
public class Loop {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the natural number till to sum: ");
		int n = sc.nextInt();
		int sum = 0;
		
		int counter = 1;
		while(counter <= n) {
			sum += counter;
			counter++;
		}
		System.out.println("Sum of "+n+" natural number is: "+sum);

	}

}
