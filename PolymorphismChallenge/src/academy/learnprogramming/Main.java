package academy.learnprogramming;

class Car {
    private String name;
    private boolean engine;
    private int cylinders;
    private int wheels;

    public Car(String name, int cylinders) {
        this.name = name;
        this.engine = true;
        this.cylinders = cylinders;
        this.wheels = 4;
    }

    public int getCylinders() {
        return cylinders;
    }

    public int getWheels() {
        return wheels;
    }

    public String startEngine(){
        return "Car -> startEngine() is called";
    }

    public String accelerate(){
        return "Car -> accelerate() is called";
    }

    public String brake(){
        return "Car -> brake() is called";
    }
}

class MGHector extends Car{

    public MGHector(String name, int cylinders) {
        super(name, cylinders);
    }

    @Override
    public String startEngine() {
        return "MGHector-> startEngine() is called";
    }

    @Override
    public String accelerate() {
        return "MGHector-> accelerate() is called";
    }

    @Override
    public String brake() {
        return "MGHector-> brake() is called";
    }
}

class Holden extends Car{

    public Holden(String name, int cylinders) {
        super(name, cylinders);
    }

    @Override
    public String startEngine() {
        return "Holden-> startEngine() is called";
    }

    @Override
    public String accelerate() {
        return "Holden-> accelerate() is called";
    }

    @Override
    public String brake() {
        return "Holden-> brake() is called";
    }
}

 class Ford extends Car{

    public Ford(String name, int cylinders) {
        super(name, cylinders);
    }

    @Override
    public String startEngine() {
//        return "Ford-> startEngine() is called";
        return getClass().getSimpleName() + " -> startEngine() is called";
    }

    @Override
    public String accelerate() {
        return "Ford-> accelerate() is called";
    }

    @Override
    public String brake() {
        return "Ford-> brake() is called";
    }
}

public class Main {

    public static void main(String[] args) {
	Car car = new Car("Base Car", 8);
        System.out.println(car.startEngine());
        System.out.println(car.accelerate());
        System.out.println(car.brake());

        MGHector mghector = new MGHector( "Outlander", 6);
        System.out.println((mghector.startEngine()));
        System.out.println(mghector.accelerate());
        System.out.println(mghector.brake());

        Ford ford = new Ford( "ford falcon", 6);
        System.out.println((ford.startEngine()));
        System.out.println(ford.accelerate());
        System.out.println(ford.brake());

        Holden holden = new Holden( "ford falcon", 6);
        System.out.println((holden.startEngine()));
        System.out.println(holden.accelerate());
        System.out.println(holden.brake());
    }
}
