import java.util.*;
public class PracTable {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int number;
		
		number = sc.nextInt();
		
		for(int i= 1; i<=10; i++) {
			int value = number*i;
			System.out.println(value);
		}
	}
    
}
