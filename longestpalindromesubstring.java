import java.util.*;

public class longestpalindromesubstring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String longest="";
        for(int i=0;i<s.length();i++){
            for(int j=i;j<s.length();j++){
                if(s.charAt(i)==s.charAt(j)){
                    String sub=s.substring(i,j+1);//find substring
                    String rev=new StringBuilder(sub).reverse().toString();
                    if(sub.equals(rev)&&sub.length()>longest.length())
                    longest=sub;
                    
                }
            }
        }
        System.out.println(longest);
    }
}
