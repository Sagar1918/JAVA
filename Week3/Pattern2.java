package Week3;

import java.util.Scanner;

public class Pattern2 {
    public static void main(String[] args)

    {
        // write your code !!!
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print((n - j) + 1 + " ");
            }
            System.out.println();
        }

    }
}

// Descending pattern with row number
// 4
// 4 3
// 4 3 2
// 4 3 2 1