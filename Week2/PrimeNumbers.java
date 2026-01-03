import java.util.Scanner;

public class PrimeNumbers {

	public static void main(String[] args) {

		/*
		 * Your class should be named Solution.
		 * Read input as specified in the question.
		 * Print output as specified in the question.
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a value of n");
		int n = scan.nextInt();
		scan.close();

		for (int i = 2; i <= n; i++) {
			boolean isPrime = true;

			for (int j = 2; j <= Math.sqrt(i); j++) {
				if (i % j == 0) {
					isPrime = false;
					break;
				}
			}
			if (isPrime) {
				System.out.println(i + " ");
			}

		}

		if (n <= 1) {
			System.out.println("Enter a number greater than or equal to 2");
		}
	}
}
