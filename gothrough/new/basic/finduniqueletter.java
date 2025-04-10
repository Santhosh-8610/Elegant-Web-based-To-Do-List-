import java.util.*;
public class finduniqueletter {

    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        char ch;
       for(int i=0;i<a.length();i++){
        ch=a.charAt(i);
        if(a.lastIndexOf(ch)==a.indexOf(ch)){
            System.out.println(ch);
        }
       }
    }
}