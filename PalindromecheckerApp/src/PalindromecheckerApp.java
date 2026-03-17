public class PalindromecheckerApp {
        public static void main(String[] args) {

            // Input string (can be hardcoded or modified)
            String input = "madam";

            // Convert string to character array
            char[] charArray = input.toCharArray();

            // Two-pointer approach
            int start = 0;
            int end = charArray.length - 1;

            boolean isPalindrome = true;

            while (start < end) {
                if (charArray[start] != charArray[end]) {
                    isPalindrome = false;
                    break;
                }
                start++;
                end--;
            }

            // Display result
            if (isPalindrome) {
                System.out.println(input + " is a palindrome.");
            } else {
                System.out.println(input + " is not a palindrome.");
            }
        }
    }