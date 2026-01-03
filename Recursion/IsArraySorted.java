package Recursion;

public class IsArraySorted {
    public static boolean checkArray(int[] arr) {
        return sortedArrayHelper(arr, 0);
    }

    public static boolean sortedArrayHelper(int[] arr, int idx) {
        // base case, because we can check upto n-1 only
        if (idx == arr.length - 1) {
            return true;
        }
        if (arr[idx] > arr[idx + 1]) {
            return false;
        }
        // Recursive Case, checks rest of the array
        boolean recursiveStep = sortedArrayHelper(arr, idx + 1);
        return recursiveStep;
    }

    public static void main(String[] args) {
        int[] arr = { 2, 4, 6, 8, 10 };
        boolean isSorted;
        isSorted = checkArray(arr);
        System.out.println("Given array is Sorted: " + isSorted);
    }
}
