package Recursion;

import java.util.Scanner;

public class RecursionDemo {

    public static int sumOfN(int n) {
        if (n == 0) {
            return 0;
        }
        int iterationValue = sumOfN(n - 1);
        int output = n + iterationValue;
        return output;
    }

    public static int fact(int n) {
        if (n <= 1) {
            return 1;
        }
        int summation = fact(n - 1);
        int output = n * summation;
        return output;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter any value: ");
        int n = scan.nextInt();
        System.out.println("Factorial of " + n + " = " + fact(n));
        System.out.println("Sum of " + n + " numbers = " + sumOfN(n));
        scan.close();
    }
}
