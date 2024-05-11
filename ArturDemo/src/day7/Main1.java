package day7;

public class Main1 {
    public static void testDrive(Vehicle vehicle){
        vehicle.drive();
    }
    public void fun1(){}
    public void fun2(){
        fun1();
    }
    public static void main(String[] args) {
//        Main1 main1 = new Main1();
//        main1.fun1();
        testDrive(new Car());
        testDrive(new Motorcycle());
    }
}

// Create a superclass Vehicle with a method drive().
abstract class Vehicle{
    public abstract void drive();
}
// Then create subclasses like Car, Motorcycle,
class Car extends Vehicle{
    @Override
    public void drive() {
        System.out.println("Car:drive");
    }
}
class Motorcycle extends Vehicle{
    @Override
    public void drive() {
        System.out.println("Motorcycle:drive");
    }
}
// Truck, each overriding drive() method with its own implementation.
class Truck extends Vehicle{
    @Override
    public void drive() {
        System.out.println("Truck:drive");
    }
}
// In the main program, create a method testDrive() that takes a Vehicle
// object as parameter, then call drive() method on different
// types of vehicles and observe the polymorphic behavior.
