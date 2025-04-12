import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		int count1=0;
		int count2=0;
		for(int i=0;i<s.length();i++){
		    char ch=s.charAt(i);
		    if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
		        count1++;
		    }
		    else{
		        count2++;
		    }
		}
		System.out.println("vowel is"+ count1);
		System.out.println("consonant is"+ count2);
	
	}
}