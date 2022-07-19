import java.util.*;

public class RemoveDuplicates {
    public static void main(String[] args){
        ArrayList<Integer> array1 = new ArrayList<Integer>();

        array1.add(2);
        array1.add(3);
        array1.add(3);
        array1.add(3);
        array1.add(6);
        array1.add(9);
        array1.add(9);

        System.out.println("Input: " + array1);

        Set<Integer> noDuplicates = new HashSet<>();
        for(Integer x: array1){
            noDuplicates.add(x);
        }

        System.out.println("Output : " + noDuplicates.size());
    }
}
