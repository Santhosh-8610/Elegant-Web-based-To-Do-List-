//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            String s = read.readLine().trim();

            Solution ob = new Solution();
            System.out.println(ob.longestUniqueSubsttr(s));
        
System.out.println("~");
}
    }
}
// } Driver Code Ends


//User function Template for Java


class Solution{
    int longestUniqueSubsttr(String S){
        String d="";int r=0;
        for(int i=0;i<S.length();i++){
            for(int j=i+1;j<S.length();j++){
                String a=S.substring(i,j);
                for(int k=0;k<a.length();k++){
                    d=d+a.charAt(k);
                    a=a.replace(a.charAt(k),' ');
                    k--;
                }
                if(d==a){
                    r=Math.max(r,a.length());
                }
                d="";
            }
        }
        return r;
        
    }
}