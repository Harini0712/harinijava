import java.util.*;

public class leaderinarray
{
	public static void main(String[] args) {
	  Scanner sc=new Scanner(System.in);
	  int n=sc.nextInt();
	  int arr[]=new int[n];
	  for(int i=0;i<n;i++){
	      arr[i]=sc.nextInt();
	  }
	  int maxright=arr[n-1];
	  System.out.print(maxright+" ");
	  for(int i=n-2;i>=0;i--){
	      if(arr[i]>maxright){
	          maxright=arr[i];
	           System.out.print(maxright+" ");
	      }
	  }
	 
	}
}