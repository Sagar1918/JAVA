package Week6;

import java.util.Arrays;
import java.util.Scanner;

public class CheckPermutation {
    public static boolean isPermutation(String str1, String str2) {
        // Step1 To check the length of both strings are equal or not
        if (str1.length() != str2.length()) {
            return false;
        }

        // Step2. Convert both strings into arrays(char).
        char ch1[] = str1.toCharArray();
        char ch2[] = str2.toCharArray();

        // Step3. Sort the two arrays
        Arrays.sort(ch1);
        Arrays.sort(ch2);

        // Step4. Compare both ch1 == ch2 or not
        for (int i = 0; i < str1.length(); i++) {
            if (ch1[i] != ch2[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter any two strings");
        String str1 = scan.nextLine();
        String str2 = scan.nextLine();
        scan.close();
        boolean checkPermutations = isPermutation(str1, str2);
        System.out.println(checkPermutations);
    }
}
