package Recursion;

public class FindElementIndex {
    public static int firstIndex(int input[], int x) {
        return searchIndexHelper(input, x, 0);
    }

    public static int searchIndexHelper(int[] arr, int target, int idx) {
        // base case
        if (idx == arr.length) {
            return -1;
        }
        if (arr[idx] == target) {
            return idx;
        }
        // recursive case
        int index = searchIndexHelper(arr, target, idx + 1);
        return index;
    }

    public static void main(String[] args) {
        int[] arr = { 2, 4, 6, 8, 10 };
        int element = 6;
        int index = firstIndex(arr, element);
        System.out.println("Element found at this index: " + index);
    }
}
