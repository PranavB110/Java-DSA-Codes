import java.util.*;
public class BreakKeyword {

	public static void main(String[] args) {
	  Scanner sc = new Scanner(System.in);
	  
//	 do {
//		 System.out.print("Enter the number: ");
//		 int number = sc.nextInt();
//		 if(number%10==0) {
//			 break;
//		 }
//		 System.out.println(number);
//	 } while(true);
		 do {
			 System.out.print("Enter the number: ");
			 int number = sc.nextInt();
			 if(number%10==0) {
				 continue;
			 }
			 System.out.println(number);
		 } while(true);

	}

}
