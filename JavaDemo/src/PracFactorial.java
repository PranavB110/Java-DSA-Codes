import java.util.*;
public class PracFactorial {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int number;
	    int fact = 1;
	    
	    System.out.print("Enter the number to find fact: ");
	    number = sc.nextInt();
	    
	    for(int i= 1; i<=number; i++) {
	    	fact = i*fact;
	    }
	    
	    System.out.println("Factorial of the number is: "+fact);
	}

}
