import java.util.*;
class cons{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n-1;i++){
            int diff=arr[i+1]-arr[i];
            System.out.print(diff+" ");
            if(diff>max){
                max=diff;
            }
        }
        System.out.println();
        System.out.println(max);
    }
}