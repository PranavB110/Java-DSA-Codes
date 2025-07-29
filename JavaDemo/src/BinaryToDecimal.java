import java.util.*;
public class BinaryToDecimal {
	
	public static void ConvertToDecimal (int n) {
		int binNum = n; 
		int deciNum = 0; int pow = 0;
		
		while (binNum > 0) {
			int ld = binNum%10;
			
			deciNum = (int) (deciNum + ( Math.pow(2, pow) )* ld);
			binNum = binNum/10;
			pow++;
		}
		
		System.out.println("Decimal no of "+n+" is "+deciNum);
	}
	
	public static void ConvertToBinary (int n) {
		int deciNo = n;
		int binNo = 0; int pow = 0;
		
		while (deciNo > 0) {
			int rem = deciNo % 2;
			int powCal = (int) Math.pow(10, pow);
			
			binNo = binNo + powCal*(rem);
			pow++;
			deciNo = deciNo/2;
		}
		
		System.out.println("Binary no of "+n+" is "+binNo);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter the binary number to convert: ");
		int binNum = sc.nextInt();
		System.out.print("Enter the decimal number to convert: ");
		int deciNum = sc.nextInt();
		
		ConvertToDecimal(binNum);
		ConvertToBinary(deciNum);

	}

}
