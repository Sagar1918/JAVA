package Week3;

import java.util.Scanner;

public class TermsOfAp {

    public static void main(String[] args) {
        // Write your code here
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a limit");
        int limit = sc.nextInt();
        int count = 1;
        sc.close();

        /** Divisble by 4 should not be printed */
        for (int n = 1; count <= limit; n++) {
            int series = 3 * n + 2;
            if (series % 4 == 0) {
                continue;
            } else {
                System.out.print(series + " ");
                count++;
            }
        }
    }
}
