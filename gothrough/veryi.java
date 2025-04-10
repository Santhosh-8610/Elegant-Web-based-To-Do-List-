import java.util.*;
public class veryi {
    public static void main(String[]args){
        Scanner src=new Scanner(System.in);
        String a=src.nextLine();
        int count=0;
        for(int i=0;i<a.length();i++){
            for(int j=0;j<a.length();j++){
                if(a.charAt(i)==a.charAt(j)){
                    count++;
                }
            }
            if(count>0){
                System.out.print(a.charAt(i)+""+count);
                char c=a.charAt(i);
                a=a.replaceAll(String.valueOf(c),"");
            }
            count=0;
            i=-1;
        }
    }
}
