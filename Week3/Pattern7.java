package Week3;

import java.util.Scanner;

public class Pattern7 {
    public static void main(String args[]) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a n number");
        int n = scan.nextInt();
        scan.close();

        /** Round Pattern Printing */
        for (int i = 1; i <= n; i++) {
            int val = i;
            for (int j = 1; j <= n; j++) {
                System.out.print(val + " ");
                val++;
                if (val == n + 1) {
                    val = 1;
                }
            }
            System.out.println();
        }

    }
}
