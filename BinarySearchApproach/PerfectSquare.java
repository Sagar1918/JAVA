package BinarySearchApproach;

import java.util.Scanner;

public class PerfectSquare {

    public static int perfectSquare(long N) {
        if (N == 0 || N == 1) {
            return (int) N;
        }

        long low = 2, high = N;
        while (low < high) {

            long mid = (low + high) / 2;
            if (mid <= (N / mid)) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }
        return (int) low - 1;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long value = scan.nextLong();
        System.out.println(perfectSquare(value));
        scan.close();
    }

}
