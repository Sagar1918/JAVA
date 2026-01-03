import java.util.Scanner;

public class Hello {

    public static void main(String[] args) {

        /*
         * Your class should be named Solution.
         * Read input as specified in the question.
         * Print output as specified in the question.
         */
        Scanner scanner = new Scanner(System.in);

        double start = scanner.nextDouble();
        double end = scanner.nextDouble();

        double step = scanner.nextDouble();
        scanner.close();

        for (double fahrenheit = start; fahrenheit <= end; fahrenheit += step) {
            int celsius = (int) ((5.0 / 9.0) * (fahrenheit - 32));
            System.out.println((int) fahrenheit + " " + celsius);
        }
    }

}