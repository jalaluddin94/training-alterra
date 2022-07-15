import java.util.Arrays;
import java.util.Scanner;

public class Palindrome {
   public static void main(String args[]) {
      System.out.println("Enter a string ");
      Scanner sc = new Scanner(System.in);
      String s = sc.nextLine();
      sc.close();
      char[] myArray = s.toCharArray();
      int size = myArray.length;
      char [] original = Arrays.copyOf(myArray, myArray.length);

      for (int i = 0; i < size / 2; i++) {
         char temp = myArray[i];
         myArray[i] = myArray[size-i-1];
         myArray[size-i-1] = temp;
      }
      System.out.println("Array awal "+Arrays.toString(original));
      System.out.println("Array palindrome "+Arrays.toString(myArray));

      if(Arrays.equals(myArray, original)) {
         System.out.println("The string is a palindrome");
      } else {
         System.out.println("The string is NOT a palindrome");
      }
   }
}