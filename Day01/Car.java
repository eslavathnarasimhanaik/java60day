package day1;

public class Car {
    String brand = "Toyota";
    String model = "Fortuner";
    String color = "White";

    void start() {
        System.out.println("Car started");
    }

    void accelerate() {
        System.out.println("Car accelerating");
    }

    void stop() {
        System.out.println("Car stopped");
    }

    public static void main(String[] args) {
        Car c = new Car();
        System.out.println(c.brand);
        System.out.println(c.model);
        System.out.println(c.color);
        c.start();
        c.accelerate();
        c.stop();
    }
}
