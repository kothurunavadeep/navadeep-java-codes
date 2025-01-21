class Circle {
    private double radius;
    private String color;
    public Circle() {
    this.radius = 1.0;
    this.color = "red";
    }
    public Circle(double radius) {
    this.radius = radius;
    this.color = "red";
    }
    public Circle(double radius, String color) {
    this.radius = radius;
    this.color = color;
    }
    public double getRadius() {
    return radius;
    }
    public String getColor() {
    return color;
    }
    public double getArea() {
    return Math.PI * radius * radius;
    }
}
class Cylinder extends Circle {
    private double height;
    public Cylinder() {
    super(); // Call superclass default constructor
    this.height = 1.0;
    }
    public Cylinder(double radius) {
    super(radius); 
    this.height = 1.0;
    }
    public Cylinder(double radius, double height) {
    super(radius); 
    this.height = height;
    }
    public double getHeight() {
    return height;
    }
    public double getVolume() {
    return getArea() * height; 
    }
}
public class TestCylinder {
    public static void main(String[] args) {
    Cylinder c1 = new Cylinder();
    Cylinder c2 = new Cylinder(10.0);
    Cylinder c3 = new Cylinder(2.0, 10.0);
    System.out.println("Cylinder c1: Height = " + c1.getHeight() + ", Radius = " + c1.getRadius() +
    ", Area = " + c1.getArea() + ", Volume = " + c1.getVolume());
    System.out.println("Cylinder c2: Height = " + c2.getHeight() + ", Radius = " + c2.getRadius() +
    ", Area = " + c2.getArea() + ", Volume = " + c2.getVolume());
    System.out.println("Cylinder c3: Height = " + c3.getHeight() + ", Radius = " + c3.getRadius() +
    ", Area = " + c3.getArea() + ", Volume = " + c3.getVolume());
    System.out.println("K.NAVADEEP");
    }
}