import java.util.ArrayList;
import java.util.LinkedList;

public class LatihanArrayList{
    public static void main(String[] args){
        ArrayList<Integer> nomor = new ArrayList<Integer>();

        nomor.add(2);
        nomor.add(3);
        nomor.add(5);

        System.out.println("array: " + nomor);
        System.out.println("data pertama: " + nomor.get(0));

        //modify data
        nomor.set(1, 100);
        System.out.println("ganti index 1 dgn 100: " + nomor);

        LinkedList<String> cars = new LinkedList<String>();
        cars.add("duccatti");
        cars.add("bmw");
        cars.add("honda");
        cars.add("toyota");
    }
}