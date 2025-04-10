import java.util.*;
public class imp{
    public static void main(String[] args) {
        Scanner src=new Scanner(System.in);
        ac[] a=new ac[2];
        for(int i=0;i<a.length;i++){
            int b=src.nextInt();src.nextLine();
            String c=src.nextLine();
            double d=src.nextDouble();src.nextLine();

            a[i]=new ac(b, c, d);
        }
        int e=src.nextInt();
        double f=withdraw(a,e);
        if(f>=0){
            
            System.out.println(f);
        }
        else if(f==-1){
            System.out.println("account not present");
        }
        int p=src.nextInt();
        double i=deposit(a,p);
        if(i == -1)
        {
            System.out.println("Sorry - Account not found");
        }
        else
        {
            System.out.println(i);
        }
        }
        public static double withdraw(ac[]a,int e){
        Scanner sc = new Scanner(System.in);

            for(int i=0;i<a.length;i++){
                if(a[i].getAcnum()==e){
                    System.out.println("w am");
                    double g=sc.nextDouble();sc.nextLine();
                    if(a[i].getBal()>=g){
                        double h=a[i].getBal()-g;
                        a[i].setBal(h);
                        return h;
                    }
                    
                }
                
            }
            return -2;
        }
        public static double  deposit(ac[]a,int e){
        Scanner sc = new Scanner(System.in);
            for(int i=0;i<a.length;i++){
                if(a[i].getAcnum()==e){
                    System.out.println("d am");
            double j=sc.nextDouble();sc.nextLine();
                    double k=a[i].getBal()+j;
                    return k;
                }
            }
            return -1;
        }
        }
        class ac{
            private int acnum;
            private String achn;
            private double bal;

            public ac(int acnum,String achn,double bal){
                this.acnum=acnum;
                this.achn=achn;
                this.bal=bal;
            }
            public int getAcnum(){
                return acnum;
            }
            public void setAcnum(int acnum){
                this.acnum=acnum;
            }
            public String getAchn(){
                return achn;
            }
            public void setAchn(String achn){
                this.achn=achn;
            }
            public double getBal(){
                return bal;
            }
            public void setBal(double bal){
                this.bal=bal;
            }

        }