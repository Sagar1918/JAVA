import java.util.Scanner;

public class Factors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        System.out.println("Enter a number");
        printFactors(n);
        scanner.close();

    }

    private static void printFactors(int num) {
        if (num <= 1) {
            System.out.println("No factors to display");
            return;
        }
        System.out.println("Factors of " + num + " excluding 1 and itself");
        // Loop to find factors
        int var = 0;
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                System.out.print(i + " ");
                var++;
            }
        }

        if (var == 0) {
            System.out.print((num == 2) ? "-1" : (num % 2 != 0 ? "-1" : ""));
        }

    }
}
