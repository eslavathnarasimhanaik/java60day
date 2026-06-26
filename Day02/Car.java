package Day02;

public class Car {
    String band;
    String model;
    
    Car(String band,String model){
        this.band = band;
        this.model = model;
    }
    void start(){
        System.out.println("starting");
    }

    public static void main(String[] args) {
        Car c = new Car(null, null);
        System.out.println(c.band);
        System.out.println(c.model);
        c.start();

    }
}