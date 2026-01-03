package Week7;

import java.util.Scanner;

public class KthSmallestNumber {
    public static int kthSmallest(int[] arr, int n, int k) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr[k - 1];
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
        int k = s.nextInt();
        int result = KthSmallestNumber.kthSmallest(arr, n, k);
        System.out.print("Kth Smallest Number: " + result);
        s.close();
    }
}
