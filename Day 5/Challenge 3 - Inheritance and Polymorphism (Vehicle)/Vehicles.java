class Vehicle{
    protected String name;
    protected Boolean with_engine;

    Vehicle(){}

    public void setName(String theName){
        this.name = theName;
    }

    public String getName(){
        return this.name;
    }

    public void setWithEngine(Boolean theEngine){
        this.with_engine = theEngine;
    }

    public Boolean getWithEngine(){
        return this.with_engine;
    }

    public void identify_myself(){
        System.out.print("Hi, I am Parent of All Vehicles! ");
        System.out.print("My name is " + this.getName());
        Boolean thisEngine = this.getWithEngine();
        if(thisEngine){
            System.out.println(", my engine status is \'with engine\'");
        }else{
            System.out.println(", my engine status is \'no engine\'");
        }
    }
}

class Bike extends Vehicle{
    private Integer wheel_count;

    Bike(){
        super();
    }

    public Integer getWheelCount(){
        return this.wheel_count;
    }

    public void setWheelCnt(Integer cnt){
        this.wheel_count = cnt;
    }

    @Override
    public void identify_myself(){
        System.out.print("Hi, I am Bike! ");
        System.out.print("My name is " + super.getName());
        Boolean thisEngine = super.getWithEngine();
        if(thisEngine){
            System.out.print(", my engine status is \'with engine\'");
        }else{
            System.out.print(", my engine status is \'no engine\'");
        }
        System.out.println(", I have " + this.getWheelCount() + " wheel(s)");
    }
}

class Car extends Vehicle{
    private Integer wheel_count;
    private String engine_type;

    Car(){
        super();
    }

    public String getEngineType(){
        return this.engine_type;
    }

    public void setEngineType(String etype){
        this.engine_type = etype;
    }

    public Integer getWheelCount(){
        return this.wheel_count;
    }

    public void setWheelCnt(Integer cnt){
        this.wheel_count = cnt;
    }

    @Override
    public void identify_myself(){
        System.out.print("Hi, I am Cars! ");
        System.out.print("My name is " + super.getName());
        Boolean thisEngine = super.getWithEngine();
        if(thisEngine){
            System.out.print(", my engine status is \'with engine\'");
        }else{
            System.out.print(", my engine status is \'no engine\'");
        }
        System.out.print(", I have " + this.getWheelCount() + " wheel(s)");
        System.out.println(", My engine type = " + this.getEngineType());
    }
}

class Buses extends Vehicle{
    private Integer wheel_count;
    private Boolean flag_private_bus;

    Buses(){
        super();
    }

    public Boolean getFlagPrivateBus(){
        return this.flag_private_bus;
    }

    public void setFlagPrivateBus(Boolean flag){
        this.flag_private_bus = flag;
    }

    public Integer getWheelCount(){
        return this.wheel_count;
    }

    public void setWheelCnt(Integer cnt){
        this.wheel_count = cnt;
    }

    @Override
    public void identify_myself(){
        Boolean typeBus = this.getFlagPrivateBus();
        if(typeBus){
            System.out.print("Hi, I am Bus {Private Bus}! ");
        }else{
            System.out.print("Hi, I am Bus {Public Bus}! ");
        }
        System.out.print("My name is " + super.getName());
        Boolean thisEngine = super.getWithEngine();
        if(thisEngine){
            System.out.print(", my engine status is \'with engine\'");
        }else{
            System.out.print(", my engine status is \'no engine\'");
        }
        System.out.println(", I have " + this.getWheelCount() + " wheel(s)");
    }
}

public class Vehicles{
    public static void main(String[] args){
        Vehicle vhc = new Vehicle();
        vhc.setName("Gerobak");
        vhc.setWithEngine(false);
        vhc.identify_myself();

        Bike bike = new Bike();
        bike.setName("Pedal Bikes");
        bike.setWheelCnt(2);
        bike.setWithEngine(false);
        bike.identify_myself();

        Bike bike1 = new Bike();
        bike1.setName("Motor Bikes");
        bike1.setWheelCnt(2);
        bike1.setWithEngine(true);
        bike1.identify_myself();

        Car car = new Car();
        car.setName("Sport Car");
        car.setWheelCnt(4);
        car.setWithEngine(true);
        car.setEngineType("V8");
        car.identify_myself();

        Car car1 = new Car();
        car1.setName("Pickup Car");
        car1.setWheelCnt(4);
        car1.setWithEngine(true);
        car1.setEngineType("Solar");
        car1.identify_myself();

        Buses bus = new Buses();
        bus.setName("Trans Jakarta");
        bus.setFlagPrivateBus(false);
        bus.setWheelCnt(4);
        bus.setWithEngine(true);
        bus.identify_myself();

        Buses bus1 = new Buses();
        bus1.setName("School Bus");
        bus1.setFlagPrivateBus(true);
        bus1.setWheelCnt(4);
        bus1.setWithEngine(true);
        bus1.identify_myself();
    }
}