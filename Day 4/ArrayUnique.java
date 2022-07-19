import java.util.*;

public class ArrayUnique {
    public static void main(String[] args){
        ArrayList<Integer> array1 = new ArrayList<Integer>();
        ArrayList<Integer> array2 = new ArrayList<Integer>();
        ArrayList<Integer> result = new ArrayList<Integer>();

        array1.add(1);
        array1.add(2);
        array1.add(3);
        array1.add(4);

        array2.add(1);
        array2.add(3);
        array2.add(5);
        array2.add(10);
        array2.add(16);

        System.out.println("Input: " + array1 + array2);

        for(int i = 0; i < array1.size(); i++) {
            if(!array2.contains(array1.get(i))) {
                result.add(array1.get(i));
            }
        }

        System.out.println("Output: " + result);
    }
}
