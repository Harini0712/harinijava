import java.util.*;
class Main{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int o=n;
        while(n!=1&&n!=4){
            int sum=0;
            while(n>0){
                int r=n%10;
                sum=sum+(r*r);
                n/=10;
            }
            n=sum;
            
        }
        if(n==1){
            System.out.print("happy");
        }
        else{
            System.out.print("not happy");
        }
    }
}