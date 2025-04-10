import java.util.*;
public class consective2vow{
	public static void main (String args[]){
       Scanner src=new Scanner(System.in);
       String name=src.nextLine();
       String[] newname=name.split(" ");
       int count=0;
       for(int i=0;i<newname.length-1;i++){
        char c=newname[i].charAt(0);
        char d=newname[i+1].charAt(0);
        if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
            if(d=='a'||d=='e'||d=='i'||d=='o'||d=='u'){
                count++;
            }  
        }
       }
      System.out.println(count);
       

    }
}