import java.util.*;
import java.text.*;

public class currency {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();
        
        // Format for US
        String us = NumberFormat.getCurrencyInstance(Locale.US).format(payment);

        // Custom Locale for India (en for English, IN for India)
        Locale indiaLocale = new Locale("en", "IN");
        String india = NumberFormat.getCurrencyInstance(indiaLocale).format(payment);

        // Format for China
        String china = NumberFormat.getCurrencyInstance(Locale.CHINA).format(payment);

        // Format for France
        String france = NumberFormat.getCurrencyInstance(Locale.FRANCE).format(payment);
        
        // Output the formatted values
        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }
}
