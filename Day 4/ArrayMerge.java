import java.util.Set;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

public class ArrayMerge{
    public static void main(String[] args){
        //1st array
        ArrayList<String> array1 = new ArrayList<String>();
        array1.add("yakuza");
        array1.add("jin");
        array1.add("lee");
        
        //2nd array
        ArrayList<String> array2 = new ArrayList<String>();
        array2.add("yakuza");
        array2.add("feng");

        System.out.println("Arrays: " + array1 + array2);

        //new merged array
        ArrayList<String> mergedArrays = new ArrayList<String>();
        
        int i = 0;
        while(i < array1.size()){
            mergedArrays.add(array1.get(i));
            i++;
        }
        int j = 0;
        while(j < array2.size()){
            mergedArrays.add(array2.get(j));
            j++;
        }

        //no duplicate
        Set<String> noDuplicates = new HashSet<>();

        for(int m = 0; m < mergedArrays.size(); m++){
            noDuplicates.add(mergedArrays.get(m));
        }

        Iterator<String> iterator1 = noDuplicates.iterator();

        ArrayList<String> mergeArrayNoDuplicate = new ArrayList<String>();
        
        int n = 0;
        while(iterator1.hasNext()) {
            mergeArrayNoDuplicate.add(iterator1.next());
            n++;
        }

        //Sort the resultant array
        Collections.sort(mergeArrayNoDuplicate);

        System.out.println("newly formed array: " + mergeArrayNoDuplicate);
    }
}