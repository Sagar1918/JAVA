package Week3;

import java.util.Scanner;

public class Pattern4 {

    public static void main(String[] args) {

        /*
         * Your class should be named Solution.
         * Read input as specified in the question.
         * Print output as specified in the question.
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a n number");
        int n = scan.nextInt();
        scan.close();

        /** Reverse number pattern */
        for (int i = 1; i <= n; i++) {
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

}
