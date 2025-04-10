import java.util.*;
public class usernamevalidation{
public static void main(String[] args) {
    String regularExpression = "^[A-Za-z][a-zA-Z0-9_]{7,29}$";
    Scanner scan=new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        while (n-- != 0) {
            String userName = scan.nextLine();
            if (userName.matches(regularExpression)) {
                System.out.println("Valid");
            } else {
                System.out.println("Invalid");
            }           
        }
    }
}
/*
3
selva----
Invalid
selva345
Valid
selva
Invalid
 */