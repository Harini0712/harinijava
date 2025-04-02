import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int totalsum = 0;
       // int max=arr[0];
        int max=Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int sum = 0;
                for (int k = i; k <= j; k++) {
                    System.out.print(arr[k] + " ");
                    sum += arr[k]; 
                }
                System.out.println();
                System.out.println(sum);
                totalsum += sum;
                if(sum>max){
                    max=sum;
                }
            }
        }

        System.out.println(totalsum); 
        System.out.println(max);
    }
}
