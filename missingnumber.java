import java.util.*;

public class missingnumber
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++){
		    arr[i]=sc.nextInt();
		}
		Arrays.sort(arr);
        if(arr[0]!=0){
            System.out.println(0);
        }
		for(int i=1;i<n;i++){
		    int miss=arr[i]-arr[i-1];
		    for(int j=1;j<miss;j++){
		        System.out.print(arr[i-1]+1+" ");
		    }
		}
        System.out.println(n);
	}
}