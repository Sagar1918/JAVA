package Week3;

import java.util.Scanner;

public class DectoBinary {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number");
        long n = scan.nextLong();
        scan.close();

        if (n == 0) {
            System.out.print(0);
            return;
        }

        String binary = "";
        while (n != 0) {
            long m = n % 2;
            binary = m + binary;
            n = n / 2;
        }
        System.out.print(binary);
    }
}
