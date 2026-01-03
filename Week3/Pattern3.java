package Week3;

import java.util.Scanner;

public class Pattern3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();

        /** Pyramid Pattern */
        for (int i = 1; i <= n; i++) {
            // Print spaces of n - i
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // Print spaces of 2i - 1
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*"); // If you want to print numbers instead of *, replace it with j
            }
            System.out.println();
        }
    }
}

/**
 * Pyramid pattern
 * *
 ***
 *****
 *******
 */