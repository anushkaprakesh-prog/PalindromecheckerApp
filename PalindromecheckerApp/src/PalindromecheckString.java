public class PalindromecheckString {import java.util.Scanner;
        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);

            // Input string
            System.out.print("Enter a string: ");
            String original = scanner.nextLine();

            // Reverse string using loop
            String reversed = "";
            for (int i = original.length() - 1; i >= 0; i--) {
                reversed = reversed + original.charAt(i);
            }

            // Compare original and reversed
            if (original.equals(reversed)) {
                System.out.println("The given string is a palindrome.");
            } else {
                System.out.println("The given string is not a palindrome.");
            }

            scanner.close();
        }
    }
}
