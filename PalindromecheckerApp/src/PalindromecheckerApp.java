public class PalindromecheckerApp {
import java.util.Stack;
        public static void main(String[] args) {

            // Input string (hardcoded)
            String input = "madam";

            // Create a stack
            Stack<Character> stack = new Stack<>();

            // Push characters into stack
            for (int i = 0; i < input.length(); i++) {
                stack.push(input.charAt(i));
            }

            // Pop characters and build reversed string
            String reversed = "";
            while (!stack.isEmpty()) {
                reversed = reversed + stack.pop();
            }

            // Compare original and reversed string
            if (input.equals(reversed)) {
                System.out.println(input + " is a palindrome.");
            } else {
                System.out.println(input + " is not a palindrome.");
            }
        }
    }