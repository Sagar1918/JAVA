package Week3;

import java.util.Scanner;

public class Pattern5 {
    public static void main(String ar[]) {

        // write your code logic here !!!
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a n number");
        int n = scan.nextInt();
        scan.close();

        /** Pyramid pattern printing */
        for (int i = 1; i <= n; i++) {
            // Print spaces of n - i
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print(" ");
            }
            // Print numbers based on the row number
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " "); // Print the current row number
            }
            System.out.println();
        }

    }
}
