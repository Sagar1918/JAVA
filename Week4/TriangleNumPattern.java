package Week4;

import java.util.Scanner;

public class TriangleNumPattern {

    public static void main(String[] args) {
        /*
         * Your class should be named Solution.
         * Read input as specified in the question.
         * Print output as specified in the question.
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = scan.nextInt();
        scan.close();

        /** Triangle pyramid num pattern */
        for (int i = 1; i <= n; i++) {
            int num = i;
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(num);
                num++;
            }
            for (int j = num; j >= i; j--) {
                System.out.print(j);
                num++;
            }
            System.out.println();
        }
    }
}
