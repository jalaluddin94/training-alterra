import java.util.Scanner;

public class IntegerToRoman{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the integer:");
        Integer inputan = sc.nextInt();

        Integer[] vals = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] romanLetters = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        String roman = "";

        for(Integer i = 0; i < vals.length; i++){
            while(inputan >= vals[i]){
                roman += romanLetters[i];
                inputan -= vals[i];
            }
        }

        System.out.println("The Roman Numeral is: " + roman);

        sc.close();
    }
}