// assign 6
// we need to show internal and external fragmentation also for 3 process
import java.util.Scanner;

public class BestFit {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of blocks: ");
        int m = sc.nextInt();

        int blockSize[] = new int[m];

        System.out.println("Enter block sizes:");
        for(int i = 0; i < m; i++)
            blockSize[i] = sc.nextInt();

        System.out.print("Enter number of processes: ");
        int n = sc.nextInt();

        int processSize[] = new int[n];
        int allocation[] = new int[n];

        for(int i = 0; i < n; i++)
            allocation[i] = -1;

        System.out.println("Enter process sizes:");
        for(int i = 0; i < n; i++)
            processSize[i] = sc.nextInt();

        for(int i = 0; i < n; i++) {

            int bestIdx = -1;

            for(int j = 0; j < m; j++) {

                if(blockSize[j] >= processSize[i]) {

                    if(bestIdx == -1)
                        bestIdx = j;

                    else if(blockSize[bestIdx] > blockSize[j])
                        bestIdx = j;
                }
            }

            if(bestIdx != -1) {
                allocation[i] = bestIdx;
                blockSize[bestIdx] -= processSize[i];
            }
        }

        System.out.println("\nProcess No\tProcess Size\tBlock No");

        for(int i = 0; i < n; i++) {

            System.out.print((i+1) + "\t\t" + processSize[i] + "\t\t");

            if(allocation[i] != -1)
                System.out.println(allocation[i] + 1);
            else
                System.out.println("Not Allocated");
        }

        sc.close();
    }
}


5
//Enter block sizes:
100
500
200
300
600
4
//Enter process sizes:
212`
417
112
426