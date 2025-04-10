import java.util.Scanner;
import java.util.Arrays; // Import Arrays to easily print arrays

public class anagrams {

    static boolean isAnagram(String a, String b) {
        // Convert strings to lowercase for case-insensitivity
        a = a.toLowerCase();
        b = b.toLowerCase();

        // Check if lengths are different
        if (a.length() != b.length()) {
            return false;
        }

        // Create an array to track character frequencies
        int[] charCounts = new int[26];

        // Increment counts for characters in 'a'
        for (int i = 0; i < a.length(); i++) {
            charCounts[a.charAt(i) - 'a']++;
            System.out.println("After incrementing for '" + a.charAt(i) + "': " + Arrays.toString(charCounts));
        }

        // Decrement counts for characters in 'b'
        for (int i = 0; i < b.length(); i++) {
            charCounts[b.charAt(i) - 'a']--;
        }

        // Check if any count is non-zero
        for (int count : charCounts) {
            if (count != 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();

        boolean ret = isAnagram(a, b);
        System.out.println((ret) ? "Anagrams" : "Not Anagrams");
    }
}

