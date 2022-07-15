import java.util.*;

public class Main{
    public static void main(String[] arg){
        String namaPanjang = "Jalaluddin AF";
        boolean isPassed = true;

        if(namaPanjang.contains("a")){
            System.out.println(namaPanjang);
        }

        String valuenya = isPassed ? "true nih!" : "Boolean is " + isPassed;
        System.out.println(valuenya);

        String formatValue = String.format("boolean is = %s", isPassed);
        System.out.println(formatValue);

        // type casting
        double eMoney = 11.6522981d;
        int myMoney = (int) eMoney;

        System.out.println(myMoney);

        char bloodType = 98; // jadi ascii
        System.out.println(bloodType);

        int[] population = new int[10];

        for(int i = 0; i < population.length; i++){
            population[i] = (i+1)*10;
            System.out.println(population[i]);
        }

        //input dr keyboard
        Scanner inputan = new Scanner(System.in);
        
        System.out.println("Enter value:");
        int value = inputan.nextInt();

        //closing stream inputan
        inputan.close();

        System.out.println("inputted value: " + value);
    }
}