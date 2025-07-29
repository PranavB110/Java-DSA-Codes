
public class StarPattern {

	public static void main(String[] args) {
		//stars
//		for (int line= 1; line <= 4; line++) {
//			
//			for (int star=1; star <= line; star++) {
//				System.out.print("*");			
//				}
//	
//		System.out.println();
//		}
		
		//inverted stars
//		for (int line= 1; line <= 4; line++) {
//			
//			for (int star=1; star <= 4+(1-line); star++) {
//				System.out.print("*");			
//				}
//	
//		System.out.println();
//		}
		
		//pyramid numbers
//		for (int line= 1; line <= 4; line++) {
//			
//			for (int num=1; num <= line; num++) {
//				System.out.print(num);			
//				}
//	
//		System.out.println();
//		}
		
		//charachter
//		char ch = 'A';
//		for (int line= 1; line <= 4; line++) {
//			
//			for (int num=1; num <= line; num++) {
//				System.out.print(ch);
//				ch++;
//				}
//	
//		System.out.println();
//		}
		
	
		for (int line= 1; line <= 5; line++) {
			
			for (int num=1; num <= 4; num++) {
				
				if((line==1 || line== 5)||(num==1 || num==4)) {
					System.out.print("*");
				} else System.out.print(" ");
				}
	
		System.out.println();
		}

	}

}
