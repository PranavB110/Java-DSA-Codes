import java.util.*;
public class ReverseNo {

	public static void main(String[] args) {
		int number = 10899;
//		while( number>0 ) {
//           int lastDigit = number%10;
//           System.out.print(lastDigit);
//           number = (number/10 );
//	}
		int rev = 0;
		while( number>0 ) {
			int lastDigit = number%10;
			rev = (rev*10) + lastDigit;
	        number = (number/10 );
		}
		System.out.print(rev);

}
}
