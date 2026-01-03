import java.util.Scanner;

public class FibonacciNumber {

    public static void main(String[] args) {

        /*
         * Your class should be named Solution.
         * Read input as specified in the question.
         * Print output as specified in the question.
         */

        Scanner s = new Scanner(System.in);
        System.out.println("Enter a n number");
        int n = s.nextInt();
        int a = 0, b = 1;
        for (int i = 1; i <= n; i++) {
            System.out.println(a);
            int c = a + b;
            a = b;
            b = c;
        }
        System.out.println(a); // number at specific index
        s.close();
    }

}
