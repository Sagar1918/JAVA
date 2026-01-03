package Week4;

import java.util.Scanner;

public class KshapePattern {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = scan.nextInt();
        scan.close();

        /** K-Shape Pattern */
        for (int i = 1; i <= 2 * n - 1; i++) {
            if (i <= n) {
                for (int j = n - i + 1; j >= 1; j--) {
                    System.out.print(j + " ");
                }
            } else {
                for (int j = i - n + 1; j >= 1; j--) {
                    System.out.print(j + " ");
                }
            }
            System.out.println();
        }

    }

}
