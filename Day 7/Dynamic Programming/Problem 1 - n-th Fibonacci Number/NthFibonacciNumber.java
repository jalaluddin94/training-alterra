import java.util.Scanner;

public class NthFibonacciNumber{
    static Integer FindFibonacci(Integer n){
        if(n <= 1) 
            return n;
        return FindFibonacci(n-1) + FindFibonacci(n-2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input n: ");
        int n = sc.nextInt();

        System.out.println(n + "-th of Fibonacci number is " + FindFibonacci(n));
        sc.close();
    }
}