import java.util.*;
public class maja{
    public static void main(String[] args) {
        Scanner src=new Scanner(System.in);
        int a=src.nextInt();
        int count=0;
        int large=0;
        int[] b=new int[a];
        for(int i=0;i<b.length;i++){
            b[i]=src.nextInt();
        }
        for(int i =0;i<b.length;i++){
            for(int j=0;j<b.length;j++){
                if(b[i]==b[j]){
                    count++;
                }
            }
            if(count>0){
                int h=count;
                if(large<h){
                    large=b[i];
                }
            }
            count=0;
        }
        System.out.println(large);

        }
        }