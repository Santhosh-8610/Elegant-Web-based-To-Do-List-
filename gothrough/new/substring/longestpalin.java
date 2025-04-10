import java.util.*;
class longestpalin {
    // Static method to find the longest palindromic substring
   public static void main(String[]args){

    String s ="bjbjbgmadamgbmbjg";
    StringBuffer  f=new StringBuffer();
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j <= s.length(); j++) {
                String a = s.substring(i, j); // Get substring
                
               String b=new StringBuffer(a).reverse().toString();
                // Check if the substring is a palindrome
                if (a.equalsIgnoreCase(b)) {
                    // Update the longest palindrome
                    if (f.length() < a.length()) {
                        f.setLength(0); // Clear the buffer
                        f.append(a);
                    }
                }
            }
        }
        System.out.println(f);
        // Return the longest palindrome
    }
}
/*
class Solution {
    String longestPalindrome(String S) {
        String longest = "";
        for (int i = 0; i < S.length(); i++) {
            for (int j = i + 1; j <= S.length(); j++) {
                String a = S.substring(i, j);
                if (a.equals(new StringBuilder(a).reverse().toString())) {
                    if (a.length() > longest.length()) {
                        longest = a;
                    }
                }
            }
        }
        return longest;
    }
}
*/
