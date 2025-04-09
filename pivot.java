import java.util.*;

public class pivot
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++){
		    a[i]=sc.nextInt();
		}
		int r=0,l=0;
		for(int i=0;i<n;i++){
		    r+=a[i];
		}
		for(int i=0;i<n;i++){
		    l+=a[i];
		    r-=a[i];
		   
		  // System.out.println(l);
		  //  System.out.println(r);
		    if(l-a[i]==r){
		        System.out.print(i);
		    }
		}
	}
}