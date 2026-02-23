/**
 * =============================================================
 * MAIN CLASS - UseCase2PalindromeCheckerApp
 * =============================================================
 *
 * Use Case 2: Hardcoded Palindrome Validation
 *
 * Goal:
 * Display whether a hardcoded string is a palindrome.
 *
 * Data Structure Used: String
 */

public class UseCase2PalindromeCheckerApp {

    // Main Method – Entry point of Java program
    public static void main(String[] args) {

        // Hardcoded String Literal
        String input = "madam";

        boolean isPalindrome = true;

        // Compare characters from both ends
        for (int i = 0; i < input.length() / 2; i++) {

            if (input.charAt(i) != input.charAt(input.length() - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }

        // Conditional Statement (if-else)
        if (isPalindrome) {
            System.out.println("Result: " + input + " is a Palindrome.");
        } else {
            System.out.println("Result: " + input + " is NOT a Palindrome.");
        }

        // Program exits automatically after execution
    }
}