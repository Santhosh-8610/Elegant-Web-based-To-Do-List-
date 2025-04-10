import java.util.*;
public class splitbynum{
    public static void main(String[] args) {
 
//FOR ADDING DECIMAL NUMBERS ALONE:
/* 
     String b="aa11.3def22.4edfr33";
        String[]c=b.split("[^\\d\\.]+");//[, 11.3, 22.4, 33];
        double sum=0;
        for(String q:c){
            if(!q.isEmpty() && q.contains(".")){
                sum=sum+Double.parseDouble(q);
            }
        }
                 System.out.println(sum);//33.7

*/
//FOR ADDING NON-DECIMAL POINTS:
  /*   String b="aa11.3def22edfr33";
        String[]c=b.split("[^\\d\\.]+");//[, 11.3, 22, 33];
        int sum=0;
        for(String q:c){
            if(!q.isEmpty() && !q.contains(".")){
                sum=sum+Integer.parseInt(q);
            }
        }
                 System.out.println(sum);//55
*/
//FOR ADDING DECIMAL AND NON-DECIMAL NUMBERS:
String b="aa11.378def22edfr33";
        String[]c=b.split("[^\\d\\.\\d]+");//[, 11.378, 22, 33];
        double sum=0;
        for(String q:c){
            if(!q.isEmpty() ){
                sum=sum+Double.parseDouble(q);
            }
        }
                System.out.println(sum);//66.378
        }
                 
    }
