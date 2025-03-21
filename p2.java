/*import java.util.*;
class p2{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i,j;
        for(i=1;i<=n;i++){
            for(j=1;j<i+1;j++){
                System.out.print(i+" ");
            }
            System.out.println("  ");
        }
    }
}*/
 class p2 {
        int printVal;
        for (int row = 1; row <= n; row++) {
            printVal = row % 2 == 0 ? 0 : 1;
            for (int col = 1; col <= row; col++) {
                System.out.print(printVal + " ");
                printVal = printVal == 0 ? 1 : 0;
            }
            System.out.println();
        }
    }