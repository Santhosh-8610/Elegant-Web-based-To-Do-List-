import java.util.*;
public class chara{
    public static void main(String[]args){
       Scanner sc =new Scanner(System.in);
       String a=sc.nextLine();
       String[]b=a.split(" ");
       int count=0;
       char c[]={'a','e','i','o','u','A','E','I','O','U'};
       for(int i=0;i<b.length;i++){
        boolean test=true;
        for(int j=0;j<c.length;j++){
            if(b[i].charAt(0)==c[j]){
                test=false;
            }
        }
        if(test==false){
            count++;
                }
       
        }
       
       System.out.println(count);
    }
      }