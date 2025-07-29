import java.util.*;
public class advancePattern {
	
	public static void hollow_Rechtangle (int noRow, int noCol) {
		for (int i = 1; i<=noRow; i++) {
			for (int j = 1; j<=noCol; j++) {
				if ((i==1 || i==noRow || j==1 || j==noCol)) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	
	public static void inverted_Pyramid (int noRow, int noCol) {

        for (int i = 1; i<= noRow; i++) {
        	for (int j = 1; j<= noRow-i; j++) {
        		System.out.print(" ");
        	}
        	for (int k = 1; k<=i; k++) {
        		System.out.print("*");
        	}
        	System.out.println();
        }
//		for (int i = 1; i <= noRow; i++) {
//			for (int j = 1; j<= noCol; j++) {
//				if (j > noCol-i) {
//					System.out.print("*");
//				} else {
//					System.out.print(" ");
//				}
//			}
//			System.out.println();
//		}
		
	}
	//number pyramid
	public static void numberPyramid (int noRow, int noCol) {
		for (int i = 1; i<=noRow; i++) {
			for (int j = 1; j<= noCol-i+1; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}
	
	//Floyds Triangle
	public static void floydsTriangle(int noRow) {
		int count = 1;
		for (int i = 1; i<=noRow; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(count+" ");
				count++;
			}
			System.out.println();
		}
	}
	
	//0-1 Triangle
	public static void binaryTriangle (int noRow) {
		for (int i = 1; i<=noRow; i++) {
			for (int j = 1; j <= i; j++) {
				if ((i+j)%2 == 0) {
					System.out.print("1");
				} else {
					System.out.print("0");
				}	
			}
			System.out.println();
		}
	}
	//butterfly
	public static void butterfly (int noRow) {
		for (int i =1; i <= noRow; i++) {
			for (int j = 1; j <= i ; j++) {
				System.out.print("*");	
            }
			
			for (int j =1; j<=2*(noRow-i); j++) {
				System.out.print(" ");
			}
			
			for (int j = 1; j <= i ; j++) {
				System.out.print("*");	
            }
			System.out.println();
		}
		
		for (int i =noRow; i >= 1; i--) {
			for (int j = 1; j <= i ; j++) {
				System.out.print("*");	
            }
			
			for (int j =1; j<=2*(noRow-i); j++) {
				System.out.print(" ");
			}
			
			for (int j = 1; j <= i ; j++) {
				System.out.print("*");	
            }
			System.out.println();
		}
	}
	
	//Solid Rhombus
	public static void solidRhombus (int n) {
		for (int i = 1; i <= n; i++) {
			for (int j =1; j<=2*(n-i); j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= n-i; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= n; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
	
	//Hollow Rhombus
	public static void hollowRhombus (int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n-i; j++) {
				System.out.print(" ");
			}
			for (int j =1; j<=n; j++) {
				if (i==1 || i==5 || j==1 || j==5) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
				
			}
			
			System.out.println();

		}
	}
	
	//diamond
	public static void diamond (int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j<=(n-i); j++) { 
				System.out.print(" ");
			}
			
			for (int j = 1; j<=(2*i)-1; j++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
		for (int i = n; i>=1; i--) {
			for (int j = 1; j<=(n-i); j++) { 
				System.out.print(" ");
			}
			
			for (int j = 1; j<=(2*i)-1; j++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
	}

	public static void main(String[] args) {
//		hollow_Rechtangle(5, 4);
//		inverted_Pyramid(6, 6);
//		numberPyramid(5, 5);
//		floydsTriangle(5);
//		binaryTriangle(5);
//		butterfly(5);
//		solidRhombus(5);
//		hollowRhombus(5);
		diamond(3);


	}

}
