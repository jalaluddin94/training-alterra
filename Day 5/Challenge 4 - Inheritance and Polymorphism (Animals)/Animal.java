class Animals{
    protected String name;
    protected String type;
    protected String teeth;

    Animals(){

    }

    public String getName(){
        return this.name;
    }

    public String getType(){
        return this.type;
    }

    public String getTeeth(){
        return this.teeth;
    }

    public void setName(String nama){
        this.name = nama;
    }

    public void setType(String jenis){
        this.type = jenis;
    }

    public void setTeeth(String tooth){
        this.teeth = tooth;
    }

    public void identify_myself(){
        System.out.println("Hi! I\'m parent of all Animals, My name is " + this.getName());
    }
}

class Herbivor extends Animals{
    Herbivor(){
        super();
        super.setType("tumbuhan");
        super.setTeeth("tumpul");
    }

    @Override
    public void identify_myself(){
        System.out.print("Hi! I\'m Herbivor, My name is " + this.getName() + ", My food is " + this.getType());
        System.out.println(", I have " + this.getTeeth() + " teeth.");
    }
}

class Carnivor extends Animals{
    Carnivor(){
        super();
        super.setType("daging");
        super.setTeeth("tajam");
    }

    @Override
    public void identify_myself(){
        System.out.print("Hi! I\'m Carnivor, My name is " + this.getName() + ", My food is " + this.getType());
        System.out.println(", I have " + this.getTeeth() + " teeth.");
    }
}

class Omnivor extends Animals{
    Omnivor(){
        super();
        super.setType("semua");
        super.setTeeth("tajam dan tumpul");
    }

    @Override
    public void identify_myself(){
        System.out.print("Hi! I\'m Omnivor, My name is " + this.getName() + ", My food is " + this.getType());
        System.out.println(", I have " + this.getTeeth() + " teeth.");
    }
}

public class Animal{
    public static void main(String[] args){
        Animals anim = new Animals();
        anim.setName("Binatang");
        anim.identify_myself();

        Herbivor herb = new Herbivor();
        herb.setName("Kambing");
        herb.identify_myself();

        Carnivor carn = new Carnivor();
        carn.setName("Singa");
        carn.identify_myself();

        Omnivor omni = new Omnivor();
        omni.setName("Ayam");
        omni.identify_myself();
    }
}