import java.util.Scanner;

public class FibonacciWithoutFunction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of terms: ");
        int n = sc.nextInt();
        
        int first = 0, second = 1, next;
        
        System.out.print("Fibonacci Series: " + first + " " + second + " ");
        
        for (int i = 2; i < n; i++) { 
            next = first + second;
            System.out.print(next + " ");
            first = second;
            second = next;
        }
        
        sc.close();
    }
}
