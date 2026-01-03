package Recursion;

import java.util.Scanner;

public class IsPowerOfTwo {
    public static boolean checkPowerOfTwo(int n) {
        // Base cases
        if (n <= 0) {
            return false;
        }
        if (n == 1) {
            return true;
        }

        // Recursive case
        if (n % 2 == 0) {
            return checkPowerOfTwo(n / 2);
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number to check: ");
        int n = scan.nextInt();
        boolean isPower = checkPowerOfTwo(n);
        scan.close();
        if (isPower) {
            System.out.println("Yes, it is a power of two: " + isPower);
        } else {
            System.out.println("No, it is a not a power of two: " + isPower);
        }
    }
}
