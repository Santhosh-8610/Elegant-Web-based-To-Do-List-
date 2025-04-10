import java.io.*;
import java.util.*;

public class trim {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        scan.close();

        // Remove leading/trailing spaces and check if the string is empty
        s = s.trim();
        if (s.isEmpty()) {
            System.out.println(0);
            return;
        }

        // Replace non-alphabetic characters with spaces
        s = s.replaceAll("[^A-Za-z]+", " ");

        // Split the string by spaces into tokens
        String[] tokens = s.split("\\s+");

        // Print the number of tokens and the tokens themselves
        System.out.println(tokens.length);
        for (String token : tokens) {
            System.out.println(token);
        }
    }
}
