import java.util.*;
public class PracEven {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int number;
		int choice;
		int EvenSum = 0;
		int OddSum = 0;
		
		do {
			System.out.print("Enter the Number: ");
			number = sc.nextInt();
			
			if (number%2 == 0) {
				EvenSum += number; 
			} else {
				OddSum += number;
			}
			
			System.out.print("Do you want to continue adding, iff Yes press 1 or else 2: ");
			choice = sc.nextInt();
			
		} while (choice == 1);
		
		System.out.println("Sum of Even Numbers is "+EvenSum);
		System.out.println("Sum of Odd Numbers is "+OddSum);

	}

}
