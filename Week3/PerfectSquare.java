package Week3;

import java.util.Scanner;

public class PerfectSquare {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = scan.nextInt();
        int m = 0;
        scan.close();

        int ans = 0;
        for (int i = 0; m < n; i++) {
            ans = i;
            m = i * i;

        }
        if (m == n)
            System.out.println(ans);
        else
            System.out.println(ans - 1);

    }
}
