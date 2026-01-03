package Recursion;

public class FindLastIndex {
    public static int firstIndex(int input[], int x) {
        return lastIndexHelper(input, x, 0, -1);
    }

    public static int lastIndexHelper(int[] arr, int target, int idx, int lastIndex) {
        // base case
        if (idx == arr.length) {
            return lastIndex;
        }
        if (arr[idx] == target) {
            lastIndex = idx;
        }
        // recursive case
        return lastIndexHelper(arr, target, idx + 1, lastIndex);
    }

    public static void main(String[] args) {
        int[] arr = { 2, 4, 6, 8, 10, 6 };
        int element = 6;
        int index = firstIndex(arr, element);
        System.out.println("Element found at last index: " + index);
    }
}
