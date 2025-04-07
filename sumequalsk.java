import java.util.*;

public class sumequalsk
{
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++){
		    arr[i]=sc.nextInt();
		}
		int k1=sc.nextInt();
		int count=0;
		for(int i=0;i<n;i++){
		    int sum=0;
		    for(int j=i;j<n;j++){
		        sum+=arr[j];
		        System.out.println(sum);
		        if(sum==k1){
		            count++;
		        }
		    }
		}
		System.out.println(count);
		
	}
}