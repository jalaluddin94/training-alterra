class Animal{
    protected String kingdom;

    public Animal(){

    }

    public void setKingdom(String theKingdom){
        this.kingdom = theKingdom;
    }

    public String getKingdom(){
        return this.kingdom;
    }
}

class Plant{
    protected String smells;

    public Plant(){

    }

    public void setSmells(String theSmells){
        this.smells = theSmells;
    }

    public String getSmells(){
        return this.smells;
    }
}

class Vehicle{
    protected String gasoline;

    public Vehicle(){

    }

    public void setGas(String theGas){
        this.gasoline = theGas;
    }

    public String getGas(){
        return this.gasoline;
    }
}

class Cat extends Animal{
    private Integer num_of_leg;
    private String fur_color;

    public Integer getNoOfLeg(){
        return this.num_of_leg;
    }

    public void setNoOfLeg(Integer noLeg){
        this.num_of_leg = noLeg;
    }

    public String getFurColor(){
        return this.fur_color;
    }

    public void setFurColor(String theColor){
        this.fur_color = theColor;
    }

    public void show_identity(){
        System.out.print("Warna bulu: " + this.getFurColor());
        System.out.println(", dengan jumlah kaki: " + this.getNoOfLeg());
    }
}

class Fish extends Animal{
    private String type;
    private String feed;

    public void setType(String theType){
        this.type = theType;
    }

    public String getType(){
        return this.type;
    }

    public void setFeed(String theFeed){
        this.feed = theFeed;
    }

    public String getFeed(){
        return this.feed;
    }

    public void show_identity(){
        System.out.print("Jenis: " + this.getType());
        System.out.println(", makanan: " + this.getFeed());
    }
}

class Flower extends Plant{
    private String name;
    private String color;
    private Integer num_of_petals;

    public String getName(){
        return this.name;
    }

    public void setName(String theName){
        this.name = theName;
    }

    public Integer getNumOfPetals(){
        return this.num_of_petals;
    }

    public void setNumOfPetals(Integer theNumOfPetals){
        this.num_of_petals = theNumOfPetals;
    }

    public String getColor(){
        return this.color;
    }

    public void setColor(String theColor){
        this.color = theColor;
    }

    public void show_identity(){
        System.out.print("Jenis: " + this.getName());
        System.out.print(", color: " + this.getColor());
        System.out.println(", kelopak: " + this.getNumOfPetals() + " buah.");
    }
}

class Car extends Vehicle{
    private String type;
    private String color;
    private Integer num_of_tire;

    public String getType(){
        return this.type;
    }

    public void setType(String theType){
        this.type = theType;
    }

    public String getColor(){
        return this.color;
    }

    public void setColor(String theColor){
        this.color = theColor;
    }

    public Integer getNumOfTire(){
        return this.num_of_tire;
    }

    public void setNumOfTire(Integer theNumber){
        this.num_of_tire = theNumber;
    }

    public void show_identity(){
        System.out.print("Type: " + this.getType());
        System.out.print(", color: " + this.getColor());
        System.out.println(", jumlah roda: " + this.getNumOfTire());
    }
}

public class Encapsulation{
    public static void main(String[] args) {
        Cat kucing1 = new Cat();
        kucing1.setKingdom("Animalia");
        kucing1.setFurColor("black");
        kucing1.setNoOfLeg(4);

        System.out.print("Kucing1 <" + kucing1.getKingdom() + "> dengan detail, ");
        kucing1.show_identity();

        Fish ikan1 = new Fish();
        ikan1.setKingdom("Animalia");
        ikan1.setType("Mujair");
        ikan1.setFeed("cacing dan plankton");

        System.out.print("Ikan1 <" + ikan1.getKingdom() + "> dengan detail, ");
        ikan1.show_identity();

        Fish ikan2 = new Fish();
        ikan2.setKingdom("Animal");
        ikan2.setType("Lele");
        ikan2.setFeed("bayem");

        System.out.print("Ikan2 <" + ikan2.getKingdom() + "> dengan detail, ");
        ikan2.show_identity();

        Flower bunga1 = new Flower();
        bunga1.setSmells("nice");
        bunga1.setColor("red");
        bunga1.setName("roses");
        bunga1.setNumOfPetals(6);

        System.out.print("Bunga1 <smells " + bunga1.getSmells() + "> dengan detail, ");
        bunga1.show_identity();

        Flower bunga2 = new Flower();
        bunga2.setSmells("bangke!");
        bunga2.setColor("red with dots");
        bunga2.setName("Bangkai");
        bunga2.setNumOfPetals(8);

        System.out.print("Bunga1 <smells " + bunga2.getSmells() + "> dengan detail, ");
        bunga2.show_identity();

        Car mobil1 = new Car();
        mobil1.setGas("Super");
        mobil1.setType("sedan hybrid");
        mobil1.setColor("abu-abu metalik");
        mobil1.setNumOfTire(4);

        System.out.print("Mobil1 <" + mobil1.getGas() + "> dengan detail, ");
        mobil1.show_identity();
    }
}