class Car {
    // Static variable (shared by all objects)
    static int wheels = 4;
    
    // Instance variables (each object has its own copy)
    String brand;
    int year;

    // Constructor to initialize instance variables
    Car(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

    // Static method (can access static variables)
    static void showWheels() {
        System.out.println("All cars have " + wheels + " wheels.");
    }

    // Non-static method (can access both static and instance variables)
    void showDetails() {
        System.out.println("Brand: " + brand + ", Year: " + year + ", Wheels: " + wheels);  
    }

    public static void main(String[] args) {
        // Accessing static variable using the class name
        System.out.println("Number of wheels: " + Car.wheels);  // Output: 4

        // Calling static method using the class name
        Car.showWheels();  // Output: All cars have 4 wheels.

        // Creating objects
        Car car1 = new Car("Toyota", 2020);
        Car car2 = new Car("Honda", 2022);

        // Accessing instance methods
        car1.showDetails();  // Output: Brand: Toyota, Year: 2020, Wheels: 4
        car2.showDetails();  // Output: Brand: Honda, Year: 2022, Wheels: 4

        // Modifying static variable (shared by all instances)
        Car.wheels = 6;
        
        // Accessing static variable again after modification
        System.out.println("Updated number of wheels: " + Car.wheels);  // Output: 6
        
        // Calling static method again after modification
        Car.showWheels();  // Output: All cars have 6 wheels.

        // Instance methods reflect the change as well
        car1.showDetails();  // Output: Brand: Toyota, Year: 2020, Wheels: 6
        car2.showDetails();  // Output: Brand: Honda, Year: 2022, Wheels: 6
    }
}
