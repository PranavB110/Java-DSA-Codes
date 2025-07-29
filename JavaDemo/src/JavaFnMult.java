import java.util.*;
public class JavaFnMult {
	
	public static int MultiplyNo(int num1, int num2) {
		int mult = num1 * num2;
		return mult;
	}
	
	public static int Factorial(int n) {
		int f = 1;
		
		for (int i=1; i<=n; i++) {
			f = f*i;
		}
		return f;
	}
	
    public static int FactCount(int n, int r) {
    	int n_fact = Factorial(n);
    	int r_fact = Factorial(r);
    	int nmr_fact = Factorial(n-r);
    	
    	int FactCount = n_fact/(r_fact*nmr_fact);
    	return FactCount;
    }
	
	public static void main (String[] args) {
		int mult = MultiplyNo(3, 4);
		System.out.println(mult);
		
		int fact = FactCount(5, 2);
		System.out.println(fact);
	}

}
