import java.util.*;

public class firstnonrepeat{

public static void main(String[] args) {
        // Your code here
char ch;int a=0;
String s="asedae";
        for(int i=0;i<s.length();i++){
            ch=s.charAt(i);
            if(s.lastIndexOf(ch)==s.indexOf(ch)){
                System.out.println(ch);//s
                a++;
                break;
            }          
        }
        if(a==0){
            System.out.println("$");
        }
    }
}
