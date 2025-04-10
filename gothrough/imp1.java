import java.util.*;
public class imp{
    public static void main(String[]args){
        Scanner sc =new Scanner(System.in);
        String a=sc.nextLine();
       
        int d=0 ,b=0;
        for(int i=0;i<a.length();i++){
            if(Character.isDigit(a.charAt(i))){
                d=(d*10)+Integer.parseInt(String.valueOf(a.charAt(i)));
            }
            else if(d!=0){
               b=b+d; 
               d=0;
            }
        }
        if(d>0){
            b=b+d;
        }
    System.out.println(b);
    }
}