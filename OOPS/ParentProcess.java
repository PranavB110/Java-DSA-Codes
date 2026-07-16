import java.io.*;
import java.util.*;

public class ParentProcess {


public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter number of elements: ");
    int n = sc.nextInt();

    int[] arr = new int[n];

    System.out.println("Enter elements:");
    for (int i = 0; i < n; i++) {
        arr[i] = sc.nextInt();
    }

    // Sort array
    Arrays.sort(arr);

    System.out.println("Parent sorted array:");
    for (int x : arr) {
        System.out.print(x + " ");
    }
    System.out.println();

    // Convert array to string arguments
    List<String> command = new ArrayList<>();
    command.add("java");
    command.add("ChildProcess");

    for (int x : arr) {
        command.add(String.valueOf(x));
    }

    // Create child process (similar to fork+exec)
    ProcessBuilder pb = new ProcessBuilder(command);
    pb.inheritIO(); // show child output in same terminal

    Process child = pb.start();

    // Wait for child (like wait())
    child.waitFor();

    System.out.println("Parent finished waiting for child.");
}


}
