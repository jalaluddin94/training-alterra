import java.util.Scanner;

public class FibonacciNumberBottomUp {
    static Integer FibNum(Integer n){
        Integer a = 0, b = 1, c;
        if(n == 0)
            return a;
        for(Integer i = 2; i <= n; i++){
            c = a + b;
            a = b;
            b = c;
        }
        return b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the input :");
        int n = sc.nextInt();

        System.out.println("Output: " + FibNum(n));

        sc.close();
    }
}