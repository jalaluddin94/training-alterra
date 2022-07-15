import java.util.Scanner;

public class Exponentiation {
    public static int powerOf(int x, int toThePowerOf){
        return (int) Math.pow(x,toThePowerOf);
    }

    public static void main(String[] args){
        System.out.println("Enter the base: ");
        Scanner scanner = new Scanner(System.in);

        int basis = scanner.nextInt();

        System.out.println("Enter the exponent: ");
        Scanner scanner2 = new Scanner(System.in);

        int expo = scanner.nextInt();

        System.out.println("Result: " + powerOf(basis, expo));

        scanner.close();
        scanner2.close();
    }
}
