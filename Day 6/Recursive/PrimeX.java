import java.util.*;

public class PrimeX{
    public static void main(String[] args) {
        int i =0;
        int num =0;
        ArrayList<Integer> listPN = new ArrayList<Integer>();

        for (i = 1; i <= 100; i++)         
        { 		  	  
          int counter=0; 	  
          for(num =i; num>=1; num--)
	        {
                if(i%num==0)
	            {
 		            counter = counter + 1;
	            }
	        }
            if (counter ==2)
            {
                listPN.add(i);
            }	
        }	

        Scanner scanner = new Scanner(System.in);
        System.out.println("Masukkan bil. prima ke : ");
        Integer inputN = scanner.nextInt();

        System.out.println("Bil. prima ke-" + inputN + " adalah: " + listPN.get(inputN - 1));

        scanner.close();
    }
}