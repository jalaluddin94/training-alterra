import java.util.*;

public class PairwithTargetSum {
    public static void main(String[] args){
        ArrayList<Integer> array1 = new ArrayList<Integer>();
        ArrayList<Integer> array2 = new ArrayList<Integer>();

        array1.add(1);
        array1.add(2);
        array1.add(3);
        array1.add(4);
        array1.add(6);

        array2.add(2);
        array2.add(5);
        array2.add(9);
        array2.add(11);

        Scanner scanner1 = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);

        System.out.println("Array1: " + array1);
        int sizeArr1 = array1.size();
        System.out.println("Enter target for array1: ");

        int inputan1 = scanner1.nextInt();

        System.out.println("Target for array1: " + inputan1);

        PairwithTargetSum obj = new PairwithTargetSum();
        System.out.println("Output: " + obj.findPair(array1, sizeArr1, inputan1));

        System.out.println("Array2: " + array2);
        int sizeArr2 = array2.size();
        System.out.println("Enter target for array2: ");

        int inputan2 = scanner2.nextInt();

        System.out.println("Target for array2: " + inputan2);

        
        System.out.println("Output: " + obj.findPair(array2, sizeArr2, inputan2));

        scanner1.close();
        scanner2.close();
    }

    String findPair(ArrayList<Integer> theArray, int nSize, int target){
        String hasil = "";
        for(int i = 0; i < nSize - 1; i++){
            for(int k = i + 1; k < nSize; k++){
                if(theArray.get(i) + theArray.get(k) == target){
                    ArrayList<Integer> theOutput = new ArrayList<Integer>();
                    theOutput.add(i);
                    theOutput.add(k);
                    
                    hasil = "Output: " + theOutput.toString();
                }
            }
        }
        return hasil;
    }
}
