import java.util.*;

public class reverseword{

public static void main(String[] args) {
    String s="abc bc nn";
        String[]a=s.split("\\s+");String b="";
        for(int i=0;i<a.length;i++){
            b=b+new StringBuffer(a[i]).reverse().toString()+" ";
            
        }
       System.out.println(b.trim());//cba cb nn
    }
}