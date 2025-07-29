import java.util.*;
public class ConditionalStatement {
	
	public static void main(String[] args) {
		
//		Scanner sc = new Scanner(System.in);
//		System.out.print("Enter the number to Check: " );
//		int number = sc.nextInt();
//		
//		int a = (number >= 0)? 1:2;
//		switch(a) {
//		case 1 : System.out.println("Number is Positive");
//		                break;
//		case 2 : System.out.println("Number is Negative");
//		                break;
//		default : System.out.println("Enter valid number");            
//		}
//---------------------- ----------------------------------
		
//		double temp = 103.5;
//		if (temp > 100) {
//			System.out.println("You have Fever");
//		} else {
//			System.out.println("You don't have fever");
//		}
//--------------------------------------------------------
		
//		int a=63, b=36;
//		boolean x = (a<b)? true:false;
//		int y = (a>b)? a:b;
//		System.out.println("x is " + x + ", y is " + y);
//--------------------------------------------------------
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter the number between(1-7): ");
//		int day = sc.nextInt();
//		
//		switch(day) {
//		case 1 : 
//		         System.out.println("it is Sunday");
//		         break;
//		case 2 : 
//		         System.out.println("it is Monday");
//               break;
//		case 3 : 
//		         System.out.println("it is Tuesday");
//		         break; 
//		case 7 : 
//		         System.out.println("it is Wednesday");
//               break; 
//		case 4 : 
//		         System.out.println("it is Thursday");
//               break; 
//		case 5 : 
//		         System.out.println("it is Friday");
//               break; 
//		case 6 : 
//		         System.out.println("it is Saturday");
//               break;
//      default : 
//		         System.out.println("Enter number between 1-7");    
//-------------------------------------------------------------
//       }
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the year to check: ");
		int year = sc.nextInt();
		
        boolean x = (year % 4) == 0;
        boolean y = (year % 100) != 0;
        boolean z = ((year % 100 == 0) && (year % 400 == 0));
        
        if (x && (y || z)) {
        	System.out.print(year + " is a leap year");
        } else {
        	System.out.print(year + " is not a leap year");
        }	    
    }
}