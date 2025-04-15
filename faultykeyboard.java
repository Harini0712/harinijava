import java.util.*;

public class faultykeyboard
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		StringBuilder res=new StringBuilder();
		for(int i=0;i<s.length();i++){
		    char ch=s.charAt(i);
		    if(ch=='i'){
		        res.reverse();
		    }
		    else{
		        res.append(ch);
		    }
		}
		System.out.print(res.toString());
	}
}