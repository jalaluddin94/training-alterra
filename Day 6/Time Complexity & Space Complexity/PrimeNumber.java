import java.util.Scanner;

public class PrimeNumber{
    static boolean isPrime(int n)
    {
        if (n <= 1)
            return false;
        if (n <= 3)
            return true;
        if (n % 2 == 0 || n % 3 == 0)
            return false;
  
        for (int i = 5; i * i <= n; i = i + 6)
            if (n % i == 0 || n % (i + 2) == 0)
                return false;
  
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        Integer inputan = sc.nextInt();

        if(isPrime(inputan)){
            System.out.println("Prime number!");
        }else{
            System.out.println("Not prime number!");
        }

        sc.close();
    }
}