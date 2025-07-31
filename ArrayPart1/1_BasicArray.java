import java.util.*;
public class BasicArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//CREATE
		int marks[] = new int[20];
		int numbers[] = {2, 3, 5};
		String fruit[] = {"pranav", "Ananda", "Bhakare"};
        
		//INSERT
		marks[1] = sc.nextInt();
		marks[0] = sc.nextInt();
		
		//PRINT
		System.out.println("marks 1 :"+marks[1]);
		System.out.println("marks 0 :"+marks[0]);
		
		
		//UPDATE
		marks[1] = marks[1] + 2;
		marks[0] = 100;
		System.out.println("marks 0 updt:"+marks[0]);
		System.out.println("marks 1 updt:"+marks[1]);
		
	}

}
