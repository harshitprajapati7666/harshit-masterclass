package Yoho;

public class Poly {
    public static void main(String[] args) {
    Car car1 = new Car();
    car1.run();
    Car car2 = new Nano();
    car2.run();
    Car car3 = new Innova();
    car3.run();
    }
}

class Car {
    void run() {
        System.out.println("Car is running");
    }
}

class Nano extends Car {
    void run() {
        System.out.println("Nano is running");
    }
}

class Innova extends Car {
    void run() {
        System.out.println("Innova is running");
    }
}