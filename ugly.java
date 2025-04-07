import java.util.*;
class ugly{
    public static void main(String[]args){
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        boolean ugly=false;
        if(n!=0){
            while(n%2==0)
            n/=2;
            while(n%3==0)
            n/=3;
            while(n%5==0)
            n/=5;
        
        if(n==1)
        ugly= true;
        }
        if(ugly){
            System.out.print("ugly");
        }
        else{
            System.out.print("noy ugly");
        }
           
    }
}