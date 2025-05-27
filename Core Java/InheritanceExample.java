class Vehicle {
    void makeSound() {
        System.out.println("Vehicle sound");
    }
}
class Bike extends Vehicle {
    void makeSound() {
        System.out.println("Bark");
    }
}
public class InheritanceEx {
    public static void main(String[] args) {
        Vehicle a = new Vehicle();
        Bike d = new Bike();
        a.makeSound();
        d.makeSound();
    }
}
