package Week6;

import java.util.Scanner;

public class WordCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String");
        String str2 = sc.nextLine();
        sc.close();
        int n = str2.length();
        int count = 1;
        for (int i = 0; i < n; i++) {
            // char comp = str2.charAt(i);
            if (str2.charAt(i) == ' ') {
                count++;
            }
        }
        System.out.println("Number of words in a given string = " + count);
    }
}
