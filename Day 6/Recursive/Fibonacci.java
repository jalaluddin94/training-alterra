import java.util.Scanner;

public class Fibonacci {
    static int FindFibonacci(int n){
        if(n<=1)
            return n;
        return FindFibonacci(n-1) + FindFibonacci(n - 2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of fibonacci numbers");
        int n = sc.nextInt();
        System.out.println("Output: " + FindFibonacci(n));
        sc.close();
    }
}
