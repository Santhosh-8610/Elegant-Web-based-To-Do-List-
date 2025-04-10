import java.util.*;

public class longestUniqueSubsttr{

public static void main(String[] args) {
        int r = 0;
        String S="asdwedrfdewewdrewd";
        for (int i = 0; i < S.length(); i++) {
            for (int j = i + 1; j <= S.length(); j++) { // Corrected boundary
                String a = S.substring(i, j);
                LinkedHashSet<Character> w = new LinkedHashSet<>();
                for (char q : a.toCharArray()) {
                    w.add(q);
                }
                if (a.length() == w.size()) { // Check if all characters are unique
                    r = Math.max(r, a.length());
                }
            }
        }
        Math.pow(2,3);
        System.out.println(r);
    }
}
