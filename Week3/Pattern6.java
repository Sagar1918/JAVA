package Week3;

import java.util.Scanner;

public class Pattern6 {
    public static void main(String[] args) {
        // write the logic here !!
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a n number");
        int n = scan.nextInt();
        scan.close();

        /** Decrementing Downward start triangle Pattern */
        for (int i = 1; i <= n; i++) {
            // Print i-1 spaces
            for (int j = 1; j <= i - 1; j++) {
                System.out.print(" ");
            }
            // Print n-i+1 stars
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }

    }
}
