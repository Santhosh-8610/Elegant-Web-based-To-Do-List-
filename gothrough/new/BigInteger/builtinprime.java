import java.math.*;

public class builtinprime {
    public static void main(String[] args) {
        // Define some BigInteger numbers
        BigInteger number1 = new BigInteger("13");
        BigInteger number2 = new BigInteger("15");
        BigInteger number3 = new BigInteger("1125899906842597"); // Large prime number

        // Check if numbers are prime with a certainty of 10
        System.out.println(number1 + " is prime: " + number1.isProbablePrime(10)); // true
        System.out.println(number2 + " is prime: " + number2.isProbablePrime(10)); // false
        System.out.println(number3 + " is prime: " + number3.isProbablePrime(10)); // true
    }
}
/*
class Solution
{
    public String multiplyStrings(String s1,String s2)
    {
        //code here.
        BigInteger a=new BigInteger(s1);
        BigInteger b=new BigInteger(s2);
        BigInteger c=a.multiply(b);//add subtract mod pow divide equals
        
        return String.valueOf(c);
    }
}
*/
