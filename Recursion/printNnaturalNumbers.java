package Recursion;

import java.util.Scanner;

public class printNnaturalNumbers {
    public static void printNnumbers(int n) {
        if (n > 0) {
            printNnumbers(n - 1);
            System.out.print(n + " "); // It will print the numbers after recursive call
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter n number: ");
        int n = scan.nextInt();
        scan.close();
        printNnumbers(n);
    }
}
