import java.util.*;

public class histogramrectangle
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int height[]=new int[n];
		for(int i=0;i<n;i++){
		    height[i]=sc.nextInt();
		}
		int maxarea=0;

		for(int i=0;i<n;i++){
		    int minheight=height[i];
		    for(int j=i;j<n;j++){
		        if(height[j]<minheight){
		            minheight=height[j];
		        }
		        int width=j-i+1;
		        int area=minheight*width;
		        if(area>maxarea){
		            maxarea=area;
		        }
		    }
		}
		System.out.print(maxarea);
	}
}