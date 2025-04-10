import java.util.*;

public class compare2strandfindnonrepeted{

public static void main(String[] args) {
    String A="asde";
    String B="degrg";
    String c=A+B;
    System.out.print(c);
         boolean[] freqA = new boolean[26];
        boolean[] freqB = new boolean[26];

        // Mark characters present in string A
        for (char ch : A.toCharArray()) {
            freqA[ch - 'a'] = true;
        }

        // Mark characters present in string B
        for (char ch : B.toCharArray()) {
            freqB[ch - 'a'] = true;
        }

        // Collect uncommon characters
        StringBuilder result = new StringBuilder();
        for (char ch = 'a'; ch <= 'z'; ch++) {
            int index = ch - 'a';
            if (freqA[index] != freqB[index]) { // Character present in one but not both
                result.append(ch);
            }
        }

        // Return result or "-1" if no uncommon characters exist
        
        System.out.println(result.length() > 0 ? result.toString() : "-1");
    }
}
