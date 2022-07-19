class Area<T>{
    private T t;

    public void add(T t){
        this.t = t;
    }

    public T get(){
        return this.t;
    }
}

public class Cube {
    public static void main(String[] args){
        Area<String> area = new Area<String>();

        area.add("helloo");

        System.out.println("area: " + area.get());
    }
}
