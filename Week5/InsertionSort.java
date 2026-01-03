package Week5;

public class InsertionSort {

    public static int[] insertionSort(int[] arr) {

        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int j = i - 1, key = arr[i];

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }

        return arr;
    }

    public static void main(String[] args) {
        int arr[] = { 10, 30, 50, 20, 40, 60 };
        System.out.println(insertionSort(arr));
    }
}

/**
 * Insertion Sort is Same like Picking a Deck Of cards & arranging them with the
 * precedence from low to high a side.
 * Compare the element with another inserted element and taking them in an order
 * with comparsion.
 * It will divide the array into 2 parts: Sorted array to left & Unsorted to
 * right.
 */