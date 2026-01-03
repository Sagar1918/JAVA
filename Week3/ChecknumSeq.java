package Week3;

import java.util.*;

public class ChecknumSeq {

    public static void main(String[] args) {

        try (Scanner scan = new Scanner(System.in)) {
            int n = scan.nextInt();
            int prev = scan.nextInt();
            boolean isDecreasing = true;
            int count = 0;
            int i = 1;
            while (i <= n - 1) {
                int current = scan.nextInt();
                if (prev == current) {
                    System.out.println(false);
                    return;
                } else if (prev < current) {
                    if (isDecreasing) {
                        count++;
                        isDecreasing = false;
                    }

                } else {
                    if (!isDecreasing) {
                        System.out.println(false);
                        return;
                    }

                }
                i++;
                prev = current;
            }

            if (count == 1 && isDecreasing == false || count == 0 && isDecreasing == true
                    || count == 0 && isDecreasing == false) {
                System.out.println(true);
            } else {
                System.out.println(false);
            }
        }

    }
}