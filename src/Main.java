import java.util.*;

public class PalindromePerformanceComparison {

    // Stack method
    public static boolean stackPalindrome(String input) {
        Stack<Character> stack = new Stack<>();

        for (char c : input.toCharArray()) {
            stack.push(c);
        }

        String reversed = "";
        while (!stack.isEmpty()) {
            reversed += stack.pop();
        }

        return input.equals(reversed);
    }

    // Deque method
    public static boolean dequePalindrome(String input) {
        Deque<Character> deque = new ArrayDeque<>();

        for (char c : input.toCharArray()) {
            deque.addLast(c);
        }

        while (deque.size() > 1) {
            if (deque.removeFirst() != deque.removeLast())
                return false;
        }

        return true;
    }

    // Two pointer method
    public static boolean twoPointerPalindrome(String input) {
        int start = 0;
        int end = input.length() - 1;

        while (start < end) {
            if (input.charAt(start) != input.charAt(end))
                return false;

            start++;
            end--;
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        long start, end;

        // Stack performance
        start = System.nanoTime();
        boolean stackResult = stackPalindrome(input);
        end = System.nanoTime();
        long stackTime = end - start;

        // Deque performance
        start = System.nanoTime();
        boolean dequeResult = dequePalindrome(input);
        end = System.nanoTime();
        long dequeTime = end - start;

        // Two pointer performance
        start = System.nanoTime();
        boolean twoPointerResult = twoPointerPalindrome(input);
        end = System.nanoTime();
        long twoPointerTime = end - start;

        System.out.println("\nResults:");
        System.out.println("Stack Method: " + stackResult + " | Time: " + stackTime + " ns");
        System.out.println("Deque Method: " + dequeResult + " | Time: " + dequeTime + " ns");
        System.out.println("Two Pointer Method: " + twoPointerResult + " | Time: " + twoPointerTime + " ns");

        sc.close();
    }
}