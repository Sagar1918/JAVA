package Week4;

import java.util.Scanner;

public class PascalsTriangle {
    public static void main(String[] args) {
        // write your code logic !!
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = scan.nextInt();
        scan.close();

        for (int i = 1; i <= n; i++) {
            int num = 1;
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print(num + " ");
                num = (num) * (i - k) / k; // Logic for pascal triangle
            }
            System.out.println();

        }

    }
}
