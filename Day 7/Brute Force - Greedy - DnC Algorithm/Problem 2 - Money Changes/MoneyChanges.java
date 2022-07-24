import java.util.*;

public class MoneyChanges{
    static int theMoney[] = {1, 10, 20, 50, 100, 200, 500, 1000, 2000, 5000, 10000};
    static int moneyLength = theMoney.length;

    MoneyChanges(){}

    public static void main(String[] args) {
        System.out.println("Input: ");
        Scanner scanner = new Scanner(System.in);
        Integer inputMoney = scanner.nextInt();

        ArrayList<Integer> outputChanges = new ArrayList<Integer>();

        for(int i = moneyLength - 1; i >= 0; i--){
            while(inputMoney >= theMoney[i]){
                inputMoney -= theMoney[i];
                outputChanges.add(theMoney[i]);
            }
        }

        if(outputChanges.size() > 0){
            System.out.println("Output: " + outputChanges);
        }else{
            System.out.println("No changes");
        }

        scanner.close();
    }
}