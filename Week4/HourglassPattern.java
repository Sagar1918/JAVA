package Week4;

import java.util.Scanner;

public class HourglassPattern {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = scan.nextInt();
        scan.close();

        /** Stopwatch pattern for half part */
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i - 1; j++) {
                System.out.print(" ");
            }
            for (int j = i; j <= n; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        /** For Second part */
        for (int i = n - 1; i >= 1; i--) {
            for (int j = 1; j <= i - 1; j++) {
                System.out.print(" ");
            }
            for (int j = i; j <= n; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

    }

}

// 1 2 3 4
// 2 3 4
// 3 4
// 4
// 3 4
// 2 3 4
// 1 2 3 4