package Week6;

public class RemoveDuplicates {
    public static String removeConsecutiveEle(String str) {
        char ch = str.charAt(0);
        // Step2. Taking empty String to add elements
        String newString = "";
        newString = newString + ch;
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
            } else {
                newString = newString + str.charAt(i);
            }
            ch = str.charAt(i); // Updating ch with ith element
        }
        return newString;
    }

    public static void main(String[] args) {
        String str = "aabbcbbac";
        String removedEle = removeConsecutiveEle(str);
        System.out.println(removedEle);
    }
}
