import java.util.*;
class practice{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        String b=sc.nextLine();
        int[]c=new int[26];
        int[]d=new int[26];
        for(char e:a.toCharArray()){
            c[e-'a']++;
        }
        for(char e:b.toCharArray()){
            c[e-'a']--;
        }
        for(int f:c){
            if(c==1){
                
            }
        }
    }
}
for(int i=0;i<a.length;i++){
    b[a.charAt(i)-'a']++;
}