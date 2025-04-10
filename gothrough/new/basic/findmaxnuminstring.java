import java.util.*;

public class findmaxnuminstring{

public static void main(String[] args) {
        String S="aaa bb ccc    345 3433ddf";//[, , , , , , , , , , , , , , 345, 345]
        // code here
        String[]a=S.split("[^\\d+]");
        int max=-1;
        for(int i=0;i<a.length;i++){
            if(!a[i].isEmpty()){
                int b=Integer.parseInt(a[i]);
            if(max<b){
                max=b;
            }
            }   
        }
        System.out.println(max);
    }    
} 