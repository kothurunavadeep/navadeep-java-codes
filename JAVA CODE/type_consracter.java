class Car {
    // Instance variables
    String model;
    int year;

    // Non-parameterized (default) constructor
    Car() {
        model = "Unknown";
        year = 0;
    }

    // Parameterized constructor
    Car(String model, int year) {
        this.model = model;
        this.year = year;
    }

    // Method to display car details
    void display() {
        System.out.println("Model: " + model + ", Year: " + year);
    }
}
class type_constracter{
    public static void main(String[] args) {
        // Creating object using non-parameterized constructor
        Car car1 = new Car("Toyota", "Corollaaa");
        car1.display();  // Output: Model: Unknown, Year: 0

        // Creating object using parameterized constructor
        Car car2 = new Car("Toyota", 2023);
        car2.display();  // Output: Model: Toyota, Year: 2023
    }
}
