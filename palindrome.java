import java.util.*;

public class palindrome
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	    String st=sc.nextLine();
	    
	    String rev="";
	    for(int i=st.length()-1;i>=0;i--){
	        char ch=st.charAt(i);
	        rev=rev+ch;
	    }
	    boolean res=true;
	    
	    for(int i=0;i<st.length();i++){
	        char ch=st.charAt(i);
	        char ch2=rev.charAt(i);
	        if(ch!=ch2){
	           res= false;
	            break;
	        }
	    }
	    if(res){
	        System.out.println("yes");
	    }
	    else{
	        System.out.println("false");
	    }
		
	}
}