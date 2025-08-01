import java.util.*;
public class ArrayReferenceVariablePass {
	
	public static void updateArray (int array[], int nonChangable) {
		nonChangable = 10;
		
		for (int i = 0; i < array.length; i++) {
			array[i] = array[i] + 1;
		}
	}

	public static void main(String[] args) {
		int marks[] = {97, 98, 99};
		int nonChangable = 5;
		updateArray(marks, nonChangable);
		
		for (int i = 0; i < marks.length; i++) {
			System.out.print(marks[i]+" ");
		}
		System.out.println();
		
		System.out.println(nonChangable);
	}

}
