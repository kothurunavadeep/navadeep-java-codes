class details{
    String name;
    int age;
    String salary;

    void getinfo(String x,int y,String z){
        name=x;
        age=y;
        salary=z;
    }
    void display(){
        System.out.println("Name is " + name );
        System.out.println("age is " + age );
        System.out.println("salary is " + salary );
    }
}
class person{
    public static void main(String[] args) {
        details p1 = new details();
        p1.getinfo("navadeep",20,"2lakhs");
        p1.display();

    }
}