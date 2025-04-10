class Solution {
    public boolean areKAnagrams(String s1, String s2, int k) {
        // Step 1: Check if lengths are different
        if (s1.length() != s2.length()) return false;

        // Step 2: Count character frequencies for s1 and s2
        int[] freq = new int[26];
        for (char ch : s1.toCharArray()) freq[ch - 'a']++;
        for (char ch : s2.toCharArray()) freq[ch - 'a']--;

        // Step 3: Count mismatched characters
        int changesNeeded = 0;
        for (int count : freq) {
            if (count > 0) changesNeeded += count;
        }

        // Step 4: Check if changesNeeded <= k
        return changesNeeded <= k;
    }
}
/*
Input: s1 = "fodr", s2 = "gork", k = 2
Output: true
Explanation: We can change 'f' -> 'g' and 'd' -> 'k' in s1.
*/