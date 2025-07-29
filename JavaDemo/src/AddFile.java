import java.util.*;
public class AddFile {

	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
////		System.out.print("Enter the value of a: ");
////        int a = sc.nextInt();
////        System.out.print("Enter the value of b: ");
////        int b = sc.nextInt();
////        
////        int sum = a + b;
////        System.out.println(sum);
//		float rad = sc.nextFloat();
//		float area = 3.14f * rad * rad;
//		System.out.print(area);
//		
		//type Promotion
		float z = 10.669f;
		double x = 23;
		long w = 234;
		byte y = 8;
		
		//1st type
		byte o = 5;
		o = (byte)(o*2);
		
		System.out.println(o);
		
		//2nd type
		//datatype should be equal to righ side or else error like below
		int sum = (int)(z+x+w+y);
		System.out.println(sum);
		
	}
}
