package Week7;

import java.util.Scanner;

public class LinearSearch {
    public static int search(int arr[], int n) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == n) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int arr[] = { 10, 20, 30, 40, 50, 60 };
        System.out.println("Enter the number: ");
        int n = scan.nextInt();

        System.out.println(search(arr, n));
        scan.close();
    }
}
