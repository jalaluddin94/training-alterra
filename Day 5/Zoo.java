class Animal{
    protected String name;
    protected String color;

    public Animal(String name, String color){
        this.name = name;
        this.color = color;
    }

    public Animal() {
    }

    public void setName(String name){
        this.name = name;
    }

    public void setColor(String color){
        this.color = color;
    }

    public String getName(){
        return this.name;
    }

    public String getColor(){
        return this.color;
    }
}

public class Zoo{
    public static void main(String[] args){
        Animal animal = new Animal();

        animal.setName("kucing");
        animal.setColor("black");

        System.out.println("Animal name: " + animal.getName());
        System.out.println("Animal color: " + animal.getColor());
    }
}

class Buffalo extends Animal{
    private int weight;

    public Buffalo(){}

    public Buffalo(String name, String color, int weight){
        super(name, color);
        this.weight = weight;
    }

    public void showData(){
        System.out.println(name);
        System.out.println(color);
        System.out.println(this.weight);
    }
}