import java.util.Scanner;
import java.math.BigInteger;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt(); // Number of test cases
        scanner.nextLine(); // Consume the newline

        for (int i = 0; i < t; i++) {
            String numStr = scanner.nextLine();

            try {
                BigInteger num = new BigInteger(numStr);
                System.out.println(numStr + " can be fitted in:");

                if (num.compareTo(BigInteger.valueOf(Byte.MIN_VALUE)) >= 0 &&
                    num.compareTo(BigInteger.valueOf(Byte.MAX_VALUE)) <= 0) {
                    System.out.println("* byte");
                }
                if (num.compareTo(BigInteger.valueOf(Short.MIN_VALUE)) >= 0 &&
                    num.compareTo(BigInteger.valueOf(Short.MAX_VALUE)) <= 0) {
                    System.out.println("* short");
                }
                if (num.compareTo(BigInteger.valueOf(Integer.MIN_VALUE)) >= 0 &&
                    num.compareTo(BigInteger.valueOf(Integer.MAX_VALUE)) <= 0) {
                    System.out.println("* int");
                }
                if (num.compareTo(BigInteger.valueOf(Long.MIN_VALUE)) >= 0 &&
                    num.compareTo(BigInteger.valueOf(Long.MAX_VALUE)) <= 0) {
                    System.out.println("* long");
                }
            } catch (Exception e) {
                System.out.println(numStr + " can't be fitted anywhere.");
            }
        }

        scanner.close();
    }
}
