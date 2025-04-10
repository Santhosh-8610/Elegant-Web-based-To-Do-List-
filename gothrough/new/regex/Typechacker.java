import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Typechacker {
    public static void main(String[] args) {
        String b = "aa11.378def22edfr33yy2b";
        
        // Regular expressions for different types
        String regex = "([a-zA-Z]+)|(\\d+\\.\\d+)|(\\d+)|([^a-zA-Z])";
        
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(b);
        
        while (matcher.find()) {
            if (matcher.group(1) !=null) {
                System.out.println("String: " + matcher.group(1));
            } else if (matcher.group(2) != null ) {
                System.out.println("Double: " + matcher.group(2));
            } else if (matcher.group(3) != null) {
                System.out.println("Number: " + matcher.group(3));
            } else if (matcher.group(4) != null ) {
                System.out.println("Char: " + matcher.group(4));
            }
        }
    }
}
