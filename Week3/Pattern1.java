package Week3;

import java.util.Scanner;

public class Pattern1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        for (int i = 1; i <= n; i++) {
            int p = i;
            for (int j = 1; j <= i; j++) {
                System.out.print(p + " ");
                p++;
            }
            System.out.println();
        }
        scan.close();

    }
}

// 1
// 2 3
// 3 4 5
// 4 5 6 7