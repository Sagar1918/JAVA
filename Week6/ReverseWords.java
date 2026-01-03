package Week6;

import java.util.Scanner;

public class ReverseWords {
    public static String reverseWord(String input) {
        // Step1 Create an array & split it with space
        String arr[] = input.split(" ");
        // Step2 Create an empty String to add the array elements
        String reversedWord = "";
        for (int i = arr.length - 1; i >= 0; i--) {
            reversedWord = reversedWord + arr[i] + " ";
        }
        return reversedWord;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a Word");
        String input = scan.nextLine();
        scan.close();
        String reversedWord = reverseWord(input);
        System.out.println(reversedWord);
    }
}
