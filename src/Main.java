//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // Welcome message
        System.out.printf("Hello and welcome!\n\n");

        // Existing loop
        for (int i = 1; i <= 5; i++) {
            System.out.println("i = " + i);
        }

        // ---- Added Palindrome Logic Below ----

        System.out.println("\nChecking Hardcoded Palindrome...\n");

        // Hardcoded string
        String input = "madam";

        boolean isPalindrome = true;

        // Compare characters from both ends
        for (int i = 0; i < input.length() / 2; i++) {

            if (input.charAt(i) != input.charAt(input.length() - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }

        // Print result
        if (isPalindrome) {
            System.out.println("Result: " + input + " is a Palindrome.");
        } else {
            System.out.println("Result: " + input + " is NOT a Palindrome.");
        }

        System.out.println("\nProgram Finished.");
    }
}