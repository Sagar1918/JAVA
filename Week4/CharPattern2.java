package Week4;

import java.util.Scanner;

public class CharPattern2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a n number");
        int n = scan.nextInt();
        scan.close();

        /** Character Pattern */
        int i = 1;
        while (i <= n) {
            int j = 1;
            while (j <= n) {
                // Incrementing by Unicode character value like A = 65
                char charVal = (char) ('A' + i - 1);
                System.out.print(charVal);
                j++;
            }
            System.out.println();
            i++;
        }

    }
}
