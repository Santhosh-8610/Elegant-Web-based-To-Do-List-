import java.util.*;
public class prime {
    public static void main (String[] args){
        Scanner src=new Scanner(System.in);
        String a=src.nextLine();
        int count=0;
       for(int i=0;i<a.length();i++){
        int b=Integer.parseInt(String.valueOf(a.charAt(i)));
        for(int j=1;j<=b;j++){
           if( b%j==0){
            count++;
           }
        }
        if(count==2){
            System.out.println(b);
            count=0;
        }
        count=0;
    } 
        }
        
    }

