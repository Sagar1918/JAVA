package Week6;

import java.util.Scanner;

public class RemoveChar {
    public static String removeCharacter(String str, char ch) {
        String removeChar = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ch) {
                removeChar = removeChar + str.charAt(i);
            }
        }
        return removeChar;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter input");
        String str = scan.nextLine();
        char ch = scan.next().charAt(0);
        scan.close();
        String removedCharacter = removeCharacter(str, ch);
        System.out.println("Remaining Characters: " + removedCharacter);
    }
}
