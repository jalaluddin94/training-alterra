import java.util.*;
import java.lang.Math;

public class SimpleEquations{
    SimpleEquations(){}

    public static void main(String[] args){
        System.out.println("Input A: ");
        Scanner inputan = new Scanner(System.in);
        Integer iA = inputan.nextInt();
        
        System.out.println("Input B: ");
        Integer iB = inputan.nextInt();

        System.out.println("Input C: ");
        Integer iC = inputan.nextInt();

        ArrayList<String> output = new ArrayList<String>();

        for(Integer x = 0; x < 50; x++) {
            for(Integer y = 0; y < 50; y++) {
                for(Integer z = 0; z < 50; z++){
                    Integer res1 = x + y + z;
                    Integer res2 = x * y * z;
                    Double res3 = Math.pow(x, 2) + Math.pow(y, 2) + Math.pow(z, 2);

                    if(res1 == iA && res2 == iB && res3 == (double) iC){
                        output.add("X: " + x + " Y: " + y + " Z: " + z);
                    }
                }
            }
        }
        
        if(output.size() == 0){
            System.out.println("No result");
        }
        else
        {
            for(String sOutput: output){
                System.out.println(sOutput);
            }
        }
        inputan.close();
    }
}