//{ Driver Code Starts
// Initial Template for Java


// User function Template for Java

class BigIntegerBinaryAddtion{
    public static void main(String[]args){
        String s1="10101001";
        String s2="1010101";
        String a=new java.math.BigInteger(s1,2).add(new java.math.BigInteger(s2,2)).toString(2);//for this you donot need to import biginteger package
        System.out.println(a);//11111110
    }
        // code here
    }
