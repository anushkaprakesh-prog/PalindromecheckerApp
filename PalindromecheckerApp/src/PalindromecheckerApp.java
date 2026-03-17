public class PalindromecheckerApp {
    public static void main(String[] args) {

        // Hardcoded string (String Literal)
        String original = "madam";

        // Reverse the string
        String reversed = "";
        for (int i = original.length() - 1; i >= 0; i--) {
            reversed = reversed + original.charAt(i);
        }

        // Check palindrome using if-else
        if (original.equals(reversed)) {
            System.out.println(original + " is a palindrome.");
        } else {
            System.out.println(original + " is not a palindrome.");
        }
    }
}
