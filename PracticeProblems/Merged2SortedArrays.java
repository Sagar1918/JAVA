package PracticeProblems;

public class Merged2SortedArrays {
    public static double findMedian(int[] nums1, int[] nums2) {
        int i = 0, j = 0, k = 0;
        int n = nums1.length;
        int m = nums2.length;
        int arr3[] = new int[n + m];
        double result1;

        while (i < n && j < m) {
            if (nums1[i] < nums2[j]) {
                arr3[k] = nums1[i];
                i++;
                k++;
            } else {
                arr3[k] = nums2[j];
                j++;
                k++;
            }
        }

        while (i < n) {
            arr3[k] = nums1[i];
            i++;
            k++;
        }
        while (j < m) {
            arr3[k] = nums2[j];
            j++;
            k++;
        }
        if (arr3.length % 2 == 0) {
            int temp = arr3.length / 2;
            double value = arr3[temp - 1] + arr3[temp];
            result1 = value / 2;
            return result1;
        } else {
            int temp = arr3.length / 2;
            result1 = arr3[temp];
            return result1;
        }
    }

    public static void main(String[] args) {
        int arr1[] = { 1, 2 };
        int arr2[] = { 3, 4 };
        System.out.println("Median Of 2 Sorted Arrays = " + findMedian(arr1, arr2));
    }
}
