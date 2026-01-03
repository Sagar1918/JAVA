package Week5;

public class SelectionSort {
    public static void printArray(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void selectionSort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int min_idx = i;

            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[min_idx]) {
                    min_idx = j;
                }
            }

            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
    }

    public static void main(String[] args) {
        int[] arr = { 1, 6, 3, 2, 5, 4 };
        selectionSort(arr);
        printArray(arr);
    }
}

/*
 * Selection Sort is used to Sort for the small data set
 * Firstly, It will look for the minimum value in the array & swap it with the
 * first element in the array
 * In Selection Sort, the sorted values are placed on to the left side &
 * unsorted values are placed onto the right side
 * Time Complexity for the Selection Sort is O(N^2)
 */