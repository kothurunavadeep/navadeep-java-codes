class Student {
    private int rollNumber;
    private String name;
    private double percentage;
    private static int objectCount = 0; 
    public Student() {
    this.rollNumber = 0;
    this.name = "Unknown";
    this.percentage = 0.0;
    }
    public Student(int rollNumber, String name, double percentage) {
    this.rollNumber = rollNumber;
    this.name = name;
    this.percentage = percentage;
    objectCount++; 
    System.out.println("Object Count: " + objectCount);
    }
    public static int getObjectCount() {
    return objectCount;
    }
    @Override
    public String toString() {
    return "Student{" +
    "Roll Number=" + rollNumber +
    ", Name='" + name + '\'' +
    ", Percentage=" + percentage +
    '}';
    }
}
public class lab6student{
    public static void main(String[] args) {
    Student student1 = new Student(1, "navadeep", 75);
    System.out.println(student1);
    Student student2 = new Student(2, "ravi",8.2);
    System.out.println(student2);
    Student student3 = new Student(3, "ramu",8.5);
    System.out.println(student3);
    System.out.println("total Student Objects Created: " + Student.getObjectCount());
    }
}