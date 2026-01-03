package Recursion;

public class SearchElement {

    public static boolean recursiveSearch(int[] arr, int target) {
        return searchHelper(arr, target, 0);
    }

    public static boolean searchHelper(int[] arr, int target, int idx) {
        // Base Case, we look for a target & it is not found
        if (idx == arr.length) {
            return false;
        }
        if (arr[idx] == target) {
            return true;
        }

        // Recursive Case, search in other elements
        return searchHelper(arr, target, idx + 1);
    }

    public static void main(String[] args) {
        int[] arr = { 2, 4, 6, 8, 10 };
        int target = 18;
        boolean isTargetFound;

        isTargetFound = recursiveSearch(arr, target);
        if (isTargetFound) {
            System.out.println("Target is found: " + isTargetFound);
        }

        System.out.println("Target is not found: " + isTargetFound);

    }
}
