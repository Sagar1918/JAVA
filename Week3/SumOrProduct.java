package Week3;

import java.util.Scanner;

public class SumOrProduct {

    public static void main(String[] args) {
        // Write your code here
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a n number");
        int n = scan.nextInt();
        System.out.println("Enter a choice c");
        int c = scan.nextInt();

        int sum = 0, product = 1;
        for (int i = 1; i <= n; i++) {
            switch (c) {
                case 1:
                    sum += i;
                    break;
                case 2:
                    product *= i;
                    break;
                default:
                    break;
            }
        }
        if (c == 1) {
            System.out.println(sum);
        } else if (c == 2) {
            System.out.println(product);
        } else {
            System.out.println("-1");
        }
        scan.close();
    }
}
