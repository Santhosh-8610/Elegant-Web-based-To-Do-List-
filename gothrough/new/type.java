import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class type{
    public static void main(String[] args) {
        String b = "aa11.378def22edfr33";
        
        // Split the string into an array
        String[] parts = b.split("(?<=\\D)(?=\\d)|(?<=\\d)(?=\\D)|(?<=\\d\\.)(?=\\d)");
        System.out.println("Array: " + Arrays.toString(parts));
        
        // Check the type of each element
        for (String part : parts) {
            if (part.matches("[a-zA-Z]+")) {
                System.out.println("String: " + part);
            } else if (part.matches("\\d+\\.\\d+")) {
                System.out.println("Double: " + part);
            } else if (part.matches("\\d+")) {
                System.out.println("Number: " + part);
            } else {
                System.out.println("Char: " + part);
            }
        }
    }
}
