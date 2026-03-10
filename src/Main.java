public class PalindromeChecker {

    public static void main(String[] args) {

        // Original String
        String text = "radar";

        // Convert string to character array
        char[] chars = text.toCharArray();

        // Two pointer variables
        int start = 0;
        int end = chars.length - 1;

        boolean isPalindrome = true;

        // Compare characters using two-pointer technique
        while (start < end) {

            if (chars[start] != chars[end]) {
                isPalindrome = false;
                break;
            }

            start++;
            end--;
        }

        // Display result
        if (isPalindrome) {
            System.out.println(text + " is a Palindrome");
        } else {
            System.out.println(text + " is not a Palindrome");
        }
    }
}