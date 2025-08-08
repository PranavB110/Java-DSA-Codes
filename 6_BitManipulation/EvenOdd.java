
public class EvenOdd {
	
	public static void check(int n) {
		int bitMask = 1;
		if((n & bitMask) == 0) {
			System.out.println("Number is Even");
			}
		else {
			System.out.println("Number is Odd");
		}
	}

	public static void main(String[] args) {
        check(4);
        check(3);
        check(203);
	}

}
