import java.util.*;
public class PrimeNo {
	
	//using fn
	
	public static boolean PrimeNo (int n) {
        if (n < 2) {
            return false;
        }
		if (n == 2) {
			return true;
		}
		else {
			for(int i = 2; i<= Math.sqrt(n); i++) {
				if (n%i == 0) {
					return false;
				}
			}
		}
		
		return true;
		
	}
	
	public static void primesInRange (int n) {
		for (int i =2; i<=n; i++) {
			if(PrimeNo(i)) {
				System.out.print(" "+ i);
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		
		primesInRange(number);
//		System.out.println( PrimeNo(number));
		sc.close();
		
//		if(number == 2) {
//			System.out.println(number+" is a prime number");
//		} else {
//			boolean isPrime = true;
//			for(int i=2; i <= Math.sqrt(number); i++) {
//				if (number%i == 0) {
//					isPrime = false;
//				}
//			}
//				
//				if (isPrime == true) {
//					System.out.println(number+" is a prime number");
//				} else {
//					System.out.println(number+" is not a prime number");
//				}
//			}
		

	}

}
