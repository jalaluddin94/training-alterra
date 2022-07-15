import java.util.Scanner;

public class CetakTabelPerkalian {
    public static void main(String[] args){
        System.out.println("Enter the level: ");
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        for(int i = 1; i < n+1; i++) {
            System.out.print(i);
            if(i == 1){
                for(int j = i+1; j < n+1; j++){
                    System.out.print(" " + j);
                }
            }else{
                for(int j = 2; j < n+1; j++){
                    System.out.print(" " + i*j);
                }
            }
            System.out.println();
        }

        scanner.close();
    }
}
