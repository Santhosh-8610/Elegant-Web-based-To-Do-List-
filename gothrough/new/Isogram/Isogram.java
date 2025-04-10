import java.util.*;

public class Isogram{

public static void main(String[] args) {
        //Your code here
        String data="machine";
        int[]a=new int[26];
        for(int i=0;i<data.length();i++){
            a[data.charAt(i)-'a']++;
        }
        for(int i=0;i<26;i++){
            if(a[i]>1){
                System.out.println(false);
            }
            
        }
       System.out.println(true);
    }
}
/*
 Input:
S = machine
Output: 1
Explanation: machine is an isogram
as no letter has appeared twice. Hence
we print 1.
 */