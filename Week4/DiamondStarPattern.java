package Week4;

import java.util.Scanner;

public class DiamondStarPattern {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = scan.nextInt();
        int n1 = (n + 1) / 2;
        int n2 = n1 - 1;
        scan.close();

        // First-part of n1
        for (int i = 1; i <= n1; i++) {
            for (int j = 1; j <= n1 - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Second-part of n2
        for (int i = n2; i >= 1; i--) {
            for (int j = 1; j <= n2 - i + 1; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}