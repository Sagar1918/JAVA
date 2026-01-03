package PracticeProblems;

public class LeftRotateArray {
    public static int[] rotateArray(int[] arr, int k) {
        int n = arr.length;
        int[] rotatedArray = new int[n];
        for (int i = 0; i < n; i++) {
            int new_idx = (i + (n - k)) % n;
            rotatedArray[new_idx] = arr[i];
        }
        return rotatedArray;
    }

    static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = { 2, 4, 6, 8, 10 };
        int k = 1;
        print(rotateArray(arr, k));
    }

}

/**
 * 1. For right rotation, (i+k)%n where, k = how many rotations & %n will help
 * to not go out of the bound exception.
 * 2. For left rotation new index = (i+(n-k))%n
 * 3. Create a new array before with length n.
 */