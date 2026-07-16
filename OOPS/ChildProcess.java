public class ChildProcess {

public static void main(String[] args) {

    System.out.println("\nChild program executed (exec simulation)");
    System.out.println("Sorted array received:");

    for (String s : args) {
        System.out.print(s + " ");
    }

    System.out.println();
}


}
