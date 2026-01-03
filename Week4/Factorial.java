package Week4;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int r = scan.nextInt();
        scan.close();

        int factN = 1;

        for (int i = 1; i <= n; i++) {
            factN = factN * i;
        }
        int factR = 1;

        for (int i = 1; i <= r; i++) {
            factR = factR * i;
        }
        int factNR = 1;
        for (int i = 1; i <= n - r; i++) {
            factNR = factNR * i;
        }

        int factorial = factN / (factR * factNR);
        System.out.println(factorial);
    }
}
