import java.util.*;
public class mat{
    public static void main(String[]args){
        Scanner sc =new Scanner(System.in);
        int [][]a=new int[3][3];
        int []b=new int[3];
        int count=0;
        int large=0;

        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                a[i][j]=sc.nextInt();
                if(i==j){
                    b=Arrays.copyOf(b,b.length+1);
                    b[b.length-1]=a[i][i];
                }
            }
        }
        for(int i=0;i<b.length;i++){
            for(int j=1;j<=b[i];j++){
                if(b[i]%j==0){
                    count++;
                }    
            }
            if(count==2){
                if(large<b[i]){
                    large=b[i];
                }
            }
            count=0;
        }
        System.out.println(large);

    }
      }