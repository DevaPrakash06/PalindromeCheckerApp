import java.util.*;

public class PalindromeQueueStack {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Queue<Character> queue = new LinkedList<>();
        Stack<Character> stack = new Stack<>();

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // Insert characters into queue and stack
        for(int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            queue.add(ch);   // enqueue
            stack.push(ch);  // push
        }

        boolean isPalindrome = true;

        while(!queue.isEmpty()) {
            char q = queue.remove(); // dequeue
            char s = stack.pop();    // pop

            if(q != s) {
                isPalindrome = false;
                break;
            }
        }

        if(isPalindrome)
            System.out.println("The string is a Palindrome");
        else
            System.out.println("The string is NOT a Palindrome");

        sc.close();
    }
}