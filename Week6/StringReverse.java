package Week6;

import java.util.Scanner;

public class StringReverse {

    public static String reverseString(String str) {
        String reverse = " ";
        for (int i = str.length() - 1; i >= 0; i--) {
            reverse += str.charAt(i);
        }
        return reverse;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a String");
        String str = scan.nextLine();
        scan.close();
        String reverse = reverseString(str);
        System.out.println("Reversed String = " + reverse);
    }
}
