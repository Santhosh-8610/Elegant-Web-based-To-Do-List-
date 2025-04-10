import java.util.*;

public class longestcommensubstring{

public static void main(String[] args) {
        int count = 0;
        String s1="asdfgh";
        String s2="sdfg";
        // Iterate over all possible substrings of s1
        for (int i = 0; i < s1.length(); i++) {
            for (int j = i; j <s1.length(); j++) {
                // Extract the substring from s1
                String sub = s1.substring(i, j + 1);

                // Check if s2 contains the substring
                if (s2.contains(sub)) {
                    // Update count with the maximum length found so far
                    count = Math.max(count, sub.length());
                }
            }
        }

        System.out.println(count);//4
    }
}
