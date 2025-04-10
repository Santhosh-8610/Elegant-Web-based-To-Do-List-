import java.util.*;

public class removedup{
public static void main(String[] args) {
    String str="asdesr";
        String a="";int b=0;
        for(int i=0;i<str.length();i++){
                if(!a.contains(String.valueOf(str.charAt(i)))){
                    a=a+str.charAt(i);
                }
            }
    System.out.println(a);//asder
    }
}