package vansh.dsa;

import java.util.Scanner;

public class Q_Invite_Guest {
    public static int placeGuest(int n){
        if(n<=1){
            return 1;
        }

        int single = placeGuest(n-1);
        int pair = (n-1)*placeGuest(n-2);

        return single+pair;
    }
    public static void printArrangements(int i, int n, boolean[] visited, String arrangement) {
        if (i > n) {
            System.out.println(arrangement);
            return;
        }

        if (visited[i]) {
            printArrangements(i + 1, n, visited, arrangement);
            return;
        }

        visited[i] = true;
        printArrangements(i + 1, n, visited, arrangement + "[" + i + "] "); // Recurse
        visited[i] = false;


        for (int j = i + 1; j <= n; j++) {
            if (!visited[j]) {
                visited[i] = true; // Choose i
                visited[j] = true; // Choose j

                printArrangements(i + 1, n, visited, arrangement + "[" + i + "-" + j + "] ");


                visited[i] = false;
                visited[j] = false;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of Guest u want to invite: ");
        int g = sc.nextInt();

        int place = placeGuest(g);
        System.out.println("Placements of guest: "+place);


        boolean[] visited = new boolean[g + 1];

        System.out.println("\nAll possible sitting arrangements:");
        printArrangements(1, g, visited, "");
    }
}
