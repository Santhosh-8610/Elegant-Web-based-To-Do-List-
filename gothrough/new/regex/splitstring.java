import java.util.Arrays;
import java.util.Scanner;



public class splitstring {
    private static final Scanner scan = new Scanner(System.in);
    
    public static void main(String[] args) {
      
/*       String b="aadfrAsdeEAccdEs";
       String[]c=b.split("[A-Z]+");//
        double sum=0;
       System.out.println(Arrays.toString(c));//[aadfr, sde, ccd, s]
*/  

/*    String b="aadfrAsdeEAccdEs";//splits the string before every uppercase letter.
       String[]c=b.split("(?=[A-Z])+");    
       for(String q:c){
        System.out.print(q+" ");//aadfr Asde E Accd Es
    }     
  */  
  String b="aadfrAsdeEAccdEs";//splits the string with uppercase letter.
  String[]c=b.split("([^A-Z])+");    
  for(String q:c){
   System.out.print(q+" ");// A EA E
}     

    }
}