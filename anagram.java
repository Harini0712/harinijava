import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
		String s2=sc.nextLine();
		s1=s1.toLowerCase();
		s2=s2.toLowerCase();
		if(s1.length()==s2.length()){
		    char[] ch1=s1.toCharArray();
		    char[] ch2=s2.toCharArray();
		
		    
		
      Arrays.sort(ch1);
      Arrays.sort(ch2);

     
      boolean result = Arrays.equals(ch1, ch2);

      if(result) {
        System.out.println( " are anagram.");
      }
      else {
        System.out.println( " are not anagram.");
      }
		}
    
	else{
		        System.out.println("not anagram");
		    }
		
	}
}