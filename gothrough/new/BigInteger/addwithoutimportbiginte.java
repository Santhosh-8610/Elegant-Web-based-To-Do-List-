
import java.util.*;

public class addwithoutimportbiginte{

public static void main(String[] args) {
    String X="12345442122334455677889";
    String Y="13445664773838393909876554345678";
    java.math.BigInteger bigX = new java.math.BigInteger(X);
        java.math.BigInteger bigY = new java.math.BigInteger(Y);
        
        // Add the two BigInteger objects
        java.math.BigInteger sum = bigX.add(bigY);
        
        // Convert the result to a string and return
        System.out.println (sum.toString());//13445664786183836032211010023567
        
    }
}