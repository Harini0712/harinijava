import java.util.*;

public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		String str2=sc.nextLine();
	
		    if(str.length()!=str2.length()){
		        System.out.println("false");
		    }
		    else{
		        HashMap<Character,Integer>map1=new HashMap<>();
		        HashMap<Character,Integer>map2=new HashMap<>();
		        for(int i=0;i<str.length();i++){
		            map1.put(str.charAt(i),map1.getOrDefault(str.charAt(i),0)+1);
		        }
		        for(int i=0;i<str2.length();i++){
		            map2.put(str2.charAt(i),map2.getOrDefault(str2.charAt(i),0)+1);
		        }
		        if(map1.equals(map2)){
		            System.out.println("true");
		        }
		        else{
		             System.out.println("false");
		        }
		        
		    
		}
	}
}