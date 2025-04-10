import java.util.*;
public class contain{
    public static void main(String[]args){
        Scanner sc =new Scanner(System.in);
        String a=sc.nextLine();
        int count=0;
        String b="";
        for(int i=0;i<a.length();i++){
            if(!b.contains(String.valueOf(a.charAt(i)))){
                b=b+a.charAt(i);
            }
        }
        System.out.println(b);
    }
}