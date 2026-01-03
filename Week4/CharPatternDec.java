package Week4;

import java.util.Scanner;

public class CharPatternDec {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a n number");
        int n = scan.nextInt();
        scan.close();

        /** Decrementing character pattern with row number */
        for (int i = 1; i <= n; i++) {
            char ch = (char) ('A' + n - i);
            for (int j = 1; j <= i; j++) {
                System.out.print(ch);
                ch = (char) (ch + 1);
            }
            System.out.println();
        }
    }
}