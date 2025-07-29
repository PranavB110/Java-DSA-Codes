
public class FnOverloading {
	

	
	public static int Sum (int a, int b) {
		return a + b;
	}
	
	public static int Sum (int a, int b, int c) {
		return a + b + c;
	}
	
	public static float Sum (float a, float b) {
		return a + b;
	}

	public static void main(String[] args) {

		System.out.println(Sum(3, 5));
		System.out.println(Sum(3.0f, 5.2f));
		System.out.println(Sum(3, 5, 0));

	}

}
