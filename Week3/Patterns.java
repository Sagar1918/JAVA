package Week3;

import java.util.Scanner;

public class Patterns {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int p = 1;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(p + " ");
                p++;
            }
            System.out.println();
        }
        scan.close();

    }
}

// Serial incrementing pattern according to row number
// 1
// 2 3
// 4 5 6
// 7 8 9 10
// 11 12 13 14 15