import java.util.*;

public class majority
{
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int a[]=new int[n];
	for(int i=0;i<n;i++){
	    a[i]=sc.nextInt();
	}
	
	int max=0;
	int majority=a[0];
	for(int i=0;i<n;i++){
	    int count=0;
	    for(int j=1;j<n;j++){
	        if(a[i]==a[j])
	        count++;
	    }
	    if(count>max)
	    max=count;
	    majority=a[i];
	    
	}
	
	
	System.out.print(majority);

	
	}
}