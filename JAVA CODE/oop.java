class student{
    String name;
    int rollnumber;
    String section;

    public void display(){
        System.out.println(this.name);
        System.out.println(this.rollnumber);
        System.out.println(this.section);
    }
        
}
class oop{
    public static void main(String args[]){
        student s1 = new student();
        student s2 = new student();

        s1.name="navadeep";
        s1.rollnumber=2024;
        s1.section="aiml-2b";
        s2.name="kalyan";
        s2.rollnumber=2025;
        s2.section="aiml-2b";

        s1.display();
        s2.display();
        
    }
}