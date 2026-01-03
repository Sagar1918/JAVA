package Week6;

public class ArrayRotation {
    // static void rotateArray(int[] arr) {
    // int n = arr.length - 1;
    // int temp = arr[0];
    // for (int i = 1; i <= n; i++) {
    // arr[i - 1] = arr[i];
    // }
    // arr[n] = temp;
    // }

    static void reverseArray(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    static void rotateArr(int[] arr, int k) {
        // "k" denotes no.of rotations, if it is k=3, arr.length = 5 then 3%5 = 3 times
        k = k % arr.length;
        if (k < 0) {
            k = k + arr.length;
        }
        // for (int i = 0; i < k; i++) {
        // rotateArray(arr);
        // }
        reverseArray(arr, 0, k - 1);
        reverseArray(arr, k, arr.length - 1);
        reverseArray(arr, 0, arr.length - 1);
    }

    public static void main(String[] args) {
        int arr[] = { 10, 20, 30, 40, 50, 60, 70 };
        int k = 4;
        rotateArr(arr, k);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
