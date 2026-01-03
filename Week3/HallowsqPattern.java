package Week3;

import java.util.Scanner;

public class HallowsqPattern {
    public static void main(String[] args) {
        // write your code here !!
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a n number");
        int n = scan.nextInt();
        scan.close();

        /** Hallow number square pattern Printing */
        for (int i = 1; i <= n; i++) { // For rows
            int numValue = 1;
            for (int j = 1; j <= n; j++) { // For columns
                if (i == 1 || i == n) {
                    System.out.print(j);
                } else if (j == 1 || j == n) {
                    System.out.print(numValue);
                    numValue++;
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}