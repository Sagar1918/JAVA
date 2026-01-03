package Recursion.Recursion2;

class MergeSort {
    public static void mergeSort(int[] arr, int l, int r) {
        // If l == r, then there is only 1 element in the array
        if (l < r) {
            int mid = (l + r) / 2;
            // Sorting 1st half
            mergeSort(arr, l, mid);
            // Sorting 2nd half
            mergeSort(arr, mid + 1, r);
            // Merging the two sorted halves
            sortBoth(arr, l, mid, r);
        }
    }

    // Method to merge two sorted halves
    public static void sortBoth(int[] arr, int l, int mid, int r) {
        int[] left = new int[mid - l + 1];
        int[] right = new int[r - mid];

        // Passing the values to the two halves
        for (int i = 0; i < left.length; i++) {
            left[i] = arr[l + i];
        }
        for (int i = 0; i < right.length; i++) {
            right[i] = arr[mid + 1 + i];
        }

        // Merging by comparing
        int i = 0, j = 0, k = l;
        while (i < left.length && j < right.length) {
            if (left[i] < right[j]) {
                arr[k] = left[i++];
            } else {
                arr[k] = right[j++];
            }
            k++;
        }
        while (i < left.length) {
            arr[k++] = left[i++];
        }
        while (j < right.length) {
            arr[k++] = right[j++];
        }
    }

    public static void printArr(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    // Driver code
    public static void main(String args[]) {
        int arr[] = { 12, 11, 13, 5, 6, 7 };

        mergeSort(arr, 0, arr.length - 1);
        printArr(arr);
    }
}