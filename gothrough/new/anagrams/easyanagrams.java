import java.util.Arrays;

class easyanagrams {
    public static void main(String[] args) {
        
    
        // code here
        String S1="asdfedf";
        String S2="dfedfas";
         if (S1.length() != S2.length()) {
            System.out.println("not a anagrams");
        } else {
            // Convert both strings to character arrays
            char[] charArray1 = S1.toCharArray();
            char[] charArray2 = S2.toCharArray();

            Arrays.sort(charArray1);
            Arrays.sort(charArray2);

            // Compare the sorted arrays
            if (Arrays.equals(charArray1, charArray2)) {
                System.out.println("anagrams"); // Strings are anagrams
            } else {
                System.out.println("not a anagrams");
                // Strings are not anagrams
            }
        }
    }
}