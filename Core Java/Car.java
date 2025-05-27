public class Car {
    String make, model;
    int year;
    Car(String make, String model, int year) {
        this.make = make; this.model = model; this.year = year;
    }
    void displayDetails() {
        System.out.println(make + " " + model + " " + year);
    }
    public static void main(String[] args) {
        Car c1 = new Car("Benz", "Camry", 2025);
        c2.displayDetails();
    }
}

